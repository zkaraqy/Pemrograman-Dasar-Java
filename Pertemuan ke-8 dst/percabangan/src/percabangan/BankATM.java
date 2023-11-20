package percabangan;

import java.util.Scanner;

public class BankATM {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int saldo = 100000, ambilUang;
        String pilihan;
        System.out.println("Selamat Datang di Bank Unan");
        System.out.println("Menu ATM");
        System.out.println("1. Cek Saldo");
        System.out.println("2. Simpan Uang");
        System.out.println("3. Ambil Uang");
        System.out.print("Pilih Menu: ");
        pilihan = input.nextLine();
        System.out.println("");

        if (pilihan.equals("1")) {
            System.out.println("Saldo anda adalah Rp: " + saldo);
        } else if (pilihan.equals("2")) {
            System.out.print("jumlah uang yang anda simpan Rp: ");
            saldo += input.nextInt();
            System.out.println("Saldo anda adalah Rp: " + saldo);
        } else if (pilihan.equals("3")) {
            System.out.print("Ambil uang: Rp. ");
            ambilUang = input.nextInt();
            if (ambilUang <= saldo) {
                saldo = saldo - ambilUang;
                System.out.println("Saldo saat ini: Rp. " + saldo);
            } else {
                System.out.println("Saldo tidak mencukupi");
            }
        } else {
            System.out.println("Pilihan menu invalid");
        }

    }
}
