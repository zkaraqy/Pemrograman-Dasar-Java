package praktikum3;

import java.util.Scanner;

public class soal3 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int banyak_beli = 0, cashback = 0, tambahan_barang = 0, jumlah_barang = 0;
        
        System.out.println("=================Selamat Datang di Toko Charlie============");
        
        System.out.print("Banyak Pembelian Barang : ");
        banyak_beli = input.nextInt();
        
        System.out.println("===========================================================");

        if (banyak_beli < 0) {
            System.out.println("ERROR - Inputan harus lebih dari 0");
        } else {
            if (banyak_beli % 3 == 0) {
                tambahan_barang += banyak_beli / 3;
                jumlah_barang = banyak_beli + tambahan_barang;
            } else if (banyak_beli % 7 == 0) {
                cashback += 5500 * (banyak_beli / 7);
                tambahan_barang += banyak_beli / 3;
                jumlah_barang = banyak_beli + tambahan_barang;
            } else {
                tambahan_barang += banyak_beli / 3;
                jumlah_barang = banyak_beli + tambahan_barang;
                cashback += 5500 * (banyak_beli / 7);
            }

            if (cashback > 0) {
                System.out.println("Cashback : Rp" + cashback);
            } else {
                System.out.println("Cashback : -");
            }

            if (tambahan_barang > 0) {
                System.out.println("Tambahan Barang : " + tambahan_barang);
            } else {
                System.out.println("Tambahan Barang : -");
            }

            if (jumlah_barang > 0) {
                System.out.println("Jumlah Barang : " + jumlah_barang);
            } else {
                System.out.println("Jumlah Barang : " + banyak_beli);
            }

        }

    }
}
