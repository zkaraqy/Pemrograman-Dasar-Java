package praktikum7;

import java.util.Scanner;

public class soal4 {

    static void panjangL(double d, double s, double phi, double radius) {
        d = phi * radius;
        System.out.println("L = " + (2 * d + s));
    }

    static void luasKelilingLingkaran(double phi, double radius) {
        double luasLingkaran = phi * radius * radius;
        double diameter = phi * radius;
        double kelilingLingkaran = phi * diameter;
        System.out.println("Luas Lingkaran = " + phi + " x " + radius + " x " + radius + " = " + luasLingkaran);
        System.out.println("keliling lingakarn = " + phi + " x " + diameter + " = " + kelilingLingkaran);
    }

    static void LuasdanKelilingSegitigaSamaKaki(int panjangSisi, double radius, double phi) {
        double diameter = phi * radius;
        double c = Math.sqrt(((0.5) * panjangSisi) * ((0.5) * panjangSisi) + diameter * diameter);
        double b = c - panjangSisi;
        double luasSegitigaSamaKaki = 0.5 * panjangSisi * b;
        double kelilingSegitigaSamaKaki = 3 * panjangSisi;
        System.out.println("Luas Segitiga Sama Kaki = 1/2 x " + panjangSisi + " x " + b + " = " + luasSegitigaSamaKaki);
        System.out.println("Keliling Segitiga Sama Kaki = " + panjangSisi + " + " + panjangSisi + " + " + panjangSisi + " = " + kelilingSegitigaSamaKaki);
    }

    static void menu() {
        System.out.println("\n\tMenu Program : ");
        System.out.println("1. Input nilai radius dan nilai panjang sisi");
        System.out.println("2. Hitung Luas dan Keliling Lingkaran");
        System.out.println("3. Hitung Luas dan Keliling Segitiga Sama Kaki");
        System.out.println("4. Hitung panjang L");
        System.out.println("5. Keluar");
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        final double phi = 3.14;
        int pilihan, radius = 0, panjangSisi = 0;
        double diameter = 0;

        do {
            menu();
            System.out.print("Nomor pilihan : ");
            pilihan = input.nextInt();
            if (pilihan != 1 && radius == 0 && panjangSisi == 0) {
                System.out.println("Anda belum memasukkan nilai radius dan nilai panjang sisi");
            } else {
                if (pilihan == 1) {
                    System.out.print("Masukkan nilai radius        = ");
                    radius = input.nextInt();
                    System.out.print("Masukkan nilai panjang sisi  = ");
                    panjangSisi = input.nextInt();
                } else if (pilihan == 2) {
                    luasKelilingLingkaran(phi, radius);
                } else if (pilihan == 3) {
                    LuasdanKelilingSegitigaSamaKaki(panjangSisi, radius, phi);
                } else if (pilihan == 4) {
                    panjangL(diameter, panjangSisi, phi, radius);
                }
            }
        } while (pilihan != 5);
    }
}
