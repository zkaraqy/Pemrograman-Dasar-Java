package method;

import java.util.Scanner;

public class BankATMMethod {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int saldo = 100000, jmlUang, pilihan;
        System.out.println("Selamat Datang di Bank Unan");
        System.out.println("Menu ATM");
        System.out.println("1. Cek Saldo");
        System.out.println("2. Simpan Uang");
        System.out.println("3. Ambil Uang");
        System.out.print("Pilih Menu: ");
        pilihan = input.nextInt();
        System.out.println("");

        if (pilihan == 1) {
            System.out.println("Saldo anda adalah Rp: " + saldo);
        } else if (pilihan == 2) {
            System.out.print("jumlah uang yang anda simpan Rp: ");
            jmlUang = input.nextInt();
            saldo = tambahUang(saldo, jmlUang);
            System.out.println("Saldo anda adalah Rp: " + saldo);
        } else if (pilihan == 3) {
            System.out.print("Ambil uang: Rp. ");
            jmlUang = input.nextInt();

            if (jmlUang <= saldo) {
                saldo = tarikUang(saldo, jmlUang);
                System.out.println("Saldo saat ini: Rp. " + saldo);
            } else {
                System.out.println("Saldo tidak mencukupi");
            }

        } else {
            System.out.println("Pilihan menu invalid");
        }

    }

    public static int tambahUang(int saldo, int simpanUang) {
        return saldo + simpanUang;
    }

    public static int tarikUang(int saldo, int ambilUang) {
        return saldo - ambilUang;
    }
}
