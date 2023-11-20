package method;

import java.util.Scanner;

public class BankMethod {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int saldo = 100000, ambilUang;
        System.out.println("Selamat Datang di Bank Unan");
        System.out.println("Saldo saat ini: Rp. " + saldo);
        System.out.println("");
        
        System.out.print("Simpan uang: Rp. ");
        saldo += input.nextInt();
        System.out.println("Saldo saat ini: Rp. " + saldo);
        System.out.println("");

        System.out.print("Ambil uang: Rp. ");
        ambilUang = input.nextInt();
        if (ambilUang <= saldo) {
            saldo = tarikUang(saldo, ambilUang);
            System.out.println("Saldo saat ini: Rp. " + saldo);
        } else {
            System.out.println("ERROR");
        }
    }
    
    public static int tarikUang(int saldo, int ambilUang) {
        return saldo - ambilUang;
    }
}
