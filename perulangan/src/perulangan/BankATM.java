package perulangan;

import java.util.Scanner;

public class BankATM {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int saldo = 100000, ambilUang, pilihan;

        do {
            
            System.out.println("Menu ATM");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Simpan Uang");
            System.out.println("3. Ambil Uang");
            System.out.println("4. Keluar");
            System.out.print("Pilih Menu: ");
            pilihan = input.nextInt();

            if (pilihan == 1) {
                System.out.println("Saldo anda adalah Rp. " + saldo);
            } else if (pilihan == 2) {
                System.out.print("jumlah uang yang anda simpan Rp. ");
                saldo += input.nextInt();
                System.out.println("Saldo anda adalah Rp. " + saldo);
            } else if (pilihan == 3) {
                System.out.print("Jumlah uang yang anda ambil uang Rp. ");
                ambilUang = input.nextInt();
                
                if (ambilUang <= saldo) {
                    saldo = saldo - ambilUang;
                    System.out.println("Saldo anda adalah Rp. " + saldo);
                } else {
                    System.out.println("Saldo tidak mencukupi");
                }
                
            }
            System.out.println("----------------------------------------------");
        } while (pilihan != 4);
        System.out.println("Terimakasih telah memakai ATM");
    }
}
