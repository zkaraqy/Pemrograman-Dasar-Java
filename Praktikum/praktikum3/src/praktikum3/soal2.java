package praktikum3;

import java.util.Scanner;

public class soal2 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double berat = 0;
        int IndeksBeratTas = 0;

        System.out.println("===========Indeks Berat Barang Bawaan Tasku==========");

        System.out.print("Banyak laptop       : ");
        double banyakLaptop = input.nextDouble();
        berat = 850.56 * banyakLaptop;

        System.out.print("Banyak buku tulis   : ");
        double banyakBukuTulis = input.nextDouble();
        berat += 250.11 * banyakBukuTulis;

        System.out.print("Banyak kotak pensil : ");
        double banyakKotakPensil = input.nextDouble();
        berat += 25.31 * banyakKotakPensil;

        System.out.print("Banyak Smartphone   : ");
        double banyakSmartphone = input.nextDouble();
        berat += 200 * banyakSmartphone;

        if (berat > 2000) {
            IndeksBeratTas = 5;
        } else if (berat >= 1500 && berat <= 2000) {
            IndeksBeratTas = 4;
        } else if (berat >= 1000 && berat < 1500) {
            IndeksBeratTas = 3;
        } else if (berat >= 500 && berat < 1000) {
            IndeksBeratTas = 2;
        } else if (berat > 0 && berat < 500) {
            IndeksBeratTas = 1;
        } else if (berat == 0) {
            IndeksBeratTas = 0;
        }

        System.out.println("=====================================================");

        if (banyakSmartphone < 0 || banyakBukuTulis < 0 || banyakKotakPensil < 0 || banyakLaptop < 0) {
            System.out.println("ERROR - Tidak diperkenankan bilangan negatif!");
        } else {
            System.out.println("Indeks Berat Barang: " + IndeksBeratTas);
            if (IndeksBeratTas == 5) {
                System.out.println("Berat barang melebihi ketentuan");
            } else if (IndeksBeratTas == 4 || IndeksBeratTas == 3 || IndeksBeratTas == 2 || IndeksBeratTas == 1) {
                System.out.println("Aman, bawaan barang tidak melebihi ketentuan");
            }
        }
    }
}
