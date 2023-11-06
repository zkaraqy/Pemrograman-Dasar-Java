package praktikum8;

import java.util.Scanner;

public class soal2 {

    static double hitungLuasLingkaran(double r) {
        return 3.14 * Math.pow(r, 2);
    }

    static double hitungLuasSelimutTabung(double r, double t) {
        return 3.14 * 2 * r * t;
    }

    static double hitungLuasPermukaanTabung(double r, double t) {
        return 2 * hitungLuasLingkaran(r) + hitungLuasSelimutTabung(r, t);
    }

    static void menu() {
        System.out.println("\tMenu Program:");
        System.out.println("1. Input jari-jari");
        System.out.println("2. Input Tinggi");
        System.out.println("3. Hitung Luas Lingkaran");
        System.out.println("4. Hitung Luas Selimut tabung");
        System.out.println("5. Hitung Luas Permukaan Tabung");
        System.out.println("6. Keluar");
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        double r = 0, t = 0;

        do {

            menu();
            System.out.print("Nomor pilihan menu: ");
            pilihan = input.nextInt();
            if (pilihan == 1) {
                System.out.print("Input jari-jari = ");
                r = input.nextDouble();
            } else if (pilihan == 2) {
                System.out.print("Input Tinggi = ");
                t = input.nextDouble();
            } else if (pilihan == 3) {
                if (r != 0) {
                    System.out.println("Luas Lingkaran = " + hitungLuasLingkaran(r));
                } else {
                    System.out.println("Anda belum menginput Jari-jari atau Tinggi!");
                }
            } else if (pilihan == 4) {
                if (r != 0 && t != 0) {
                    System.out.println("Luas Selimut tabung = " + hitungLuasSelimutTabung(r, t));
                } else {
                    System.out.println("Anda belum menginput Jari-jari atau Tinggi!");
                }
            } else if (pilihan == 5) {
                if (r != 0 && t != 0) {
                    System.out.println("Luas permukaan tabung = " + hitungLuasPermukaanTabung(r, t));
                } else {
                    System.out.println("Anda belum menginput Jari-jari atau Tinggi!");
                }
            } else if(pilihan > 6) {
                System.out.println("pilihan menu salah");
            }
            System.out.println("");
        } while (pilihan != 6);
        System.out.println("Anda keluar");
    }
}
