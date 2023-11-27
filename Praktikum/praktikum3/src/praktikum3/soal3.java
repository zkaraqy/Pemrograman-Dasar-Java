package praktikum3;

import java.util.Scanner;

public class soal3 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int banyakBeli = 0, cashback = 0, tambahanBarang = 0, jumlahBarang = 0;
        
        System.out.println("=================Selamat Datang di Toko Charlie============");
        
        System.out.print("Banyak Pembelian Barang : ");
        banyakBeli = input.nextInt();
        
        System.out.println("===========================================================");

        if (banyakBeli < 0) {
            System.out.println("ERROR - Inputan harus lebih dari 0");
        } else {
            if (banyakBeli % 3 == 0) {
                tambahanBarang += banyakBeli / 3;
                jumlahBarang = banyakBeli + tambahanBarang;
            } else if (banyakBeli % 7 == 0) {
                cashback += 5500 * (banyakBeli / 7);
                tambahanBarang += banyakBeli / 3;
                jumlahBarang = banyakBeli + tambahanBarang;
            } else {
                tambahanBarang += banyakBeli / 3;
                jumlahBarang = banyakBeli + tambahanBarang;
                cashback += 5500 * (banyakBeli / 7);
            }

            if (cashback > 0) {
                System.out.println("Cashback : Rp" + cashback);
            } else {
                System.out.println("Cashback : -");
            }

            if (tambahanBarang > 0) {
                System.out.println("Tambahan Barang : " + tambahanBarang);
            } else {
                System.out.println("Tambahan Barang : -");
            }

            if (jumlahBarang > 0) {
                System.out.println("Jumlah Barang : " + jumlahBarang);
            } else {
                System.out.println("Jumlah Barang : " + banyakBeli);
            }

        }

    }
}
