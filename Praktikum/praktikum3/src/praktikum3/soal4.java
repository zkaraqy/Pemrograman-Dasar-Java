package praktikum3;

import java.util.Scanner;

public class soal4 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int jumlah_pembelian, menit, stok_tersisa, harga_semangka;
        String status = "";
        stok_tersisa = 150;
        harga_semangka = 100000;
        double hasil_pembelian;
        hasil_pembelian = 0;

        System.out.println("========TOKO BUAH A========");
        System.out.print("Enter jumlah pembelian : ");
        jumlah_pembelian = input.nextInt();
        System.out.print("Enter menit : ");
        menit = input.nextInt();
        System.out.println("===========================");
        if (jumlah_pembelian > 0) {

            if (menit > 0 && menit <= 420) {
                if (menit >= 40) {
                    hasil_pembelian = harga_semangka * jumlah_pembelian - ((harga_semangka*jumlah_pembelian) * 0.05) * (int)(menit/40);
                } else {
                    hasil_pembelian = harga_semangka * jumlah_pembelian;
                }
                System.out.println("Jumlah Pembelian : " + jumlah_pembelian);
                System.out.println("Stok Tersisa : " + (stok_tersisa - jumlah_pembelian));
                System.out.println("Hasil Pembelian : Rp" + (int) hasil_pembelian);
            } else if (menit > 420) {
                status = "Toko telah tutup!";
            } else {
                status = "ERROR - Inputan Invalid!";
            }
            System.out.println(status);
        }

    }
}
