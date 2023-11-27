package withzidan;

import java.util.Scanner;

public class WithZidan {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int angka, jumlahAngka = 0;
        char ulang;
        boolean outerRepeat = true;

        System.out.println("\tProgram Menjumlahkan Angka");

        do {
            String label = " + ", proses = "";
            System.out.println("=============================================");
            System.out.print("Masukan angka = ");
            angka = input.nextInt();
            jumlahAngka = tambahAngka(angka);

            for (int i = 1; i <= angka; i++) {
                if (i == angka) {
                    label = "";
                }
                proses += i + label;
            }

            System.out.println("Jumlah dari " + proses + " = " + jumlahAngka);

            do {
                System.out.print("Apakah mau memasukan angka lagi? (y/n): ");
                ulang = input.next().charAt(0);

                if (ulang == 'y') {
                    break;
                } else if (ulang == 'n') {
                    outerRepeat = false;
                    break;
                } else {
                    System.out.println("Input yang anda masukan salah.\nMohon masukan input yang valid");
                }

            } while (true);

        } while (outerRepeat);

        System.out.println("=============================================");

    }

    public static int tambahAngka(int angka) {
        if (angka == 0) {
            return angka;
        }
        return angka + tambahAngka(angka - 1);
    }
}
