package praktikum3;

import java.util.Scanner;

public class soal4 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int jumlahPembelian, menit, stokTersisa, hargaSemangka;
        String status = "";
        stokTersisa = 150;
        hargaSemangka = 100000;
        double hasilPembelian;
        hasilPembelian = 0;

        System.out.println("========TOKO BUAH A========");
        System.out.print("Enter jumlah pembelian : ");
        jumlahPembelian = input.nextInt();
        System.out.print("Enter menit : ");
        menit = input.nextInt();
        System.out.println("===========================");
        if (jumlahPembelian >= 0) {

            if (menit > 0 && menit <= 420) {
                if (menit >= 40) {
                    hasilPembelian = hargaSemangka * jumlahPembelian - ((hargaSemangka * jumlahPembelian) * 0.05) * (int) (menit / 40);
                } else {
                    hasilPembelian = hargaSemangka * jumlahPembelian;
                }
                System.out.println("Jumlah Pembelian : " + jumlahPembelian);
                System.out.println("Stok Tersisa : " + (stokTersisa - jumlahPembelian));
                System.out.println("Hasil Pembelian : Rp" + (int) hasilPembelian);
            } else if (menit > 420) {
                status = "Toko telah tutup!";
            } else {
                status = "ERROR - Inputan Invalid!";
            }
            System.out.println(status);
        }

    }
}
