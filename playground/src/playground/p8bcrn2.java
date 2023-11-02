package playground;

import java.util.Scanner;

public class p8bcrn2 {

    public static void menu() {
        System.out.println("\tMenu");
        System.out.println("1. Input s");
        System.out.println("2. Input t");
        System.out.println("3. Hitung Luas Persegi");
        System.out.println("4. Hitung Luas Segitiga");
        System.out.println("5. Hitung Luas Permukaan Limas Persegi");
        System.out.println("6. Keluar");
    }

    public static double hitungLuasPersegi(double s) {
        double luasPersegi = s * s;
        return luasPersegi;
    }

    public static double hitungLuasSegitiga(double alas, double t) {
        double setengahAlas = alas * 0.5,
                tinggi = Math.sqrt(Math.pow(setengahAlas, 2) + Math.pow(t, 2)),
                luasSegitiga = 0.5 * alas * tinggi;
        return luasSegitiga;
    }
    
    public static double hitungLuasPermukaanLimas(double s, double t) {
        double luasPermukaanLimas = hitungLuasPersegi(s) + 4 * hitungLuasSegitiga(s, t);
        return luasPermukaanLimas;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        double s = 0, t = 0, pilihan;
        do {
            menu();
            System.out.println("===========================================");
            System.out.print("Nomor pilihan menu : ");
            pilihan = scan.nextDouble();

            if ((pilihan >= 3 && pilihan <= 5) && (s == 0 || t == 0)) {
                System.out.println("Anda belum menginput Sisi Atau Tinggi!");
                System.out.println("");
            } else if (pilihan == 1) {
                System.out.print("Input s = ");
                s = scan.nextDouble();
                System.out.println("");
            } else if (pilihan == 2) {
                System.out.print("Input t = ");
                t = scan.nextDouble();
                System.out.println("");
            } else if (pilihan == 3) {
                System.out.println("Luas persegi = " + s + " x " + s + " = " + hitungLuasPersegi(s));
                System.out.println("");
            } else if (pilihan == 4) {
                System.out.println("Luas segitiga = 1/2 x Alas x Tinggi = " + hitungLuasSegitiga(s, t));
                System.out.println("");
            } else if (pilihan == 5) {
                System.out.println("Luas Permukaan Limas = " + hitungLuasPersegi(s) + " + " + 4 + " x " + hitungLuasSegitiga(s, t) + " = " + hitungLuasPermukaanLimas(s, t));
                System.out.println("");
            } else {
                System.out.println("");
            }

        } while (pilihan != 6);
    }
}
