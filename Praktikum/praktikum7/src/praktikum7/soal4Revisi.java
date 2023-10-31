package praktikum7;

import java.util.Scanner;

public class soal4Revisi {

    static void hitungPanjangL(double sisi, double radius) {
        double diameterDanTinggi = 2 * radius;
        double panjangL = diameterDanTinggi + diameterDanTinggi + sisi;
        System.out.println("Panjang L = diameter + sisi + diameter = " + diameterDanTinggi + " + " + sisi + " + " + diameterDanTinggi + " = " + panjangL);
    }

    static void luasDanKelilingLingkaran(double radius) {
        final double phi = 3.14;
        double luas = phi * radius * radius;
        double keliling = 2 * phi * radius;
        System.out.println("Luas lingkaran = " + phi + " x " + radius + " x " + radius + " = " + luas);
        System.out.println("Keliling lingkaran = 2 x " + phi + " x " + radius + " = " + keliling);
    }

    static void luasDanKelilingSegitigaSamaKaki(double sisi, double radius) {
        double alas = sisi;
        double setengahAlas = 0.5 * alas;
        double diameterDanTinggi = 2 * radius;
        double luas = 0.5 * alas * diameterDanTinggi;
        double sisiMiring = Math.sqrt(Math.pow(setengahAlas, 2) + Math.pow(diameterDanTinggi, 2));
        double keliling = alas + sisiMiring + sisiMiring;
        System.out.println("Luas Segitiga = 1/2 x " + alas + " x " + diameterDanTinggi + " = " + luas);
        System.out.println("Keliling Segitiga = " + alas + " + " + sisiMiring + " + " + sisiMiring + " = " + keliling);
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
        int pilihan;
        double radius = 0, sisi = 0;
        do {
            menu();
            System.out.print("Nomor pilihan : ");
            pilihan = input.nextInt();
            if (pilihan != 1 && radius == 0 && sisi == 0) {
                if (pilihan > 1 && pilihan < 5) {
                    System.out.println("Anda belum memasukkan nilai radius dan nilai panjang sisi");
                }
            } else {
                switch (pilihan) {
                    case 1:
                        System.out.print("nilai radius       = ");
                        radius = input.nextDouble();
                        System.out.print("nilai panjang sisi = ");
                        sisi = input.nextDouble();
                        break;
                    case 2:
                        luasDanKelilingLingkaran(radius);
                        break;
                    case 3:
                        luasDanKelilingSegitigaSamaKaki(sisi, radius);
                        break;
                    case 4:
                        hitungPanjangL(sisi, radius);
                        break;
                }
            }
            System.out.println("");
        } while (pilihan != 5);
    }
}
