package praktikum7;

import java.util.Scanner;

public class soal3 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("\n\tProgram menampilkan kelipatan angka");
            System.out.println("==================================================");
            System.out.print("Masukkan angka kelipatan = ");
            int angka = input.nextInt();
            System.out.print("Masukkan rentang angka awal = ");
            int rentangAwal = input.nextInt();
            System.out.print("Masukkan rentang angka akhir = ");
            int rentangAkhir = input.nextInt();
            System.out.print("Angka-angka kelipatan dari " + angka + " = ");
            kelipatan(angka, rentangAwal, rentangAkhir);
            System.out.println("\n==================================================");
            System.out.print("Ulang? (y/n) = ");
            String ulang = input.nextLine();
            ulang = input.nextLine();
            if (ulang.equalsIgnoreCase("n")) {
                break;
            } else if (!(ulang.equalsIgnoreCase("y"))) {
                System.out.println("Input Invalid");
                System.out.println("Program dihentikan");
                break;
            }
            System.out.println("");
        } while (true);

    }

    static void kelipatan(int angka, int rentangAwal, int rentangAkhir) {
        for (int i = angka; i <= rentangAkhir; i += angka) {
            if (i >= rentangAwal) {
                System.out.print(i + ", ");
            }
        }
    }

}
