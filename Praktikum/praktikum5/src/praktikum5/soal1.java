package praktikum5;

import java.util.Scanner;

public class soal1 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double jumlahAngka = 0, angka, nilaiTerkecil = 9999, nilaiTerbesar = -9999, rataRata = 0;
        System.out.print("Masukan jumlah angka : ");
        jumlahAngka = input.nextInt();

        for (int i = 0; i < jumlahAngka; i++) {
            System.out.print("Masukan angka ke-" + (i + 1) + " : ");
            angka = input.nextInt();
            if (angka < nilaiTerkecil) {
                nilaiTerkecil = angka;
            }
            if (angka > nilaiTerbesar) {
                nilaiTerbesar = angka;
            }

            rataRata += angka;
        }
        rataRata = rataRata / 3;
        System.out.println("Nilai terkecil : " + (int)nilaiTerkecil);
        System.out.println("Nilai terbesar : " + (int)nilaiTerbesar);
        System.out.println("Rata-rata : " + rataRata);

    }
}
