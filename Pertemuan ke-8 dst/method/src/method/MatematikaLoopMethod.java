package method;

import java.util.Scanner;

public class MatematikaLoopMethod {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            menu();
            System.out.println("");
            System.out.print("Pilih Menu = ");
            pilihan = input.nextInt();

            if (pilihan >= 1 && pilihan <= 4) {
                System.out.print("Masukkan Angka Pertama = ");
                double angka1 = input.nextDouble();
                System.out.print("Masukkan Angka Kedua = ");
                double angka2 = input.nextDouble();

                switch (pilihan) {
                    case 1:
                        System.out.println("");
                        pertambahan(angka1, angka2);
                        break;

                    case 2:
                        System.out.println("");
                        pengurangan(angka1, angka2);
                        break;

                    case 3:
                        System.out.println("");
                        perkalian(angka1, angka2);
                        break;

                    case 4:
                        System.out.println("");
                        pembagian(angka1, angka2);
                        break;

                }
            }
            System.out.println("------------------------------------------");

        } while (pilihan != 5);
    }

    public static void menu() {
        System.out.println("Menu Aplikasi Matematika:\n1. Penambahan\n2. Pengurangan\n3. Perkalian\n4. Pembagian\n5. Keluar Aplikasi");
    }

    public static void pertambahan(double angka1, double angka2) {
        System.out.println("Hasil Penambahan antara " + angka1 + " dan " + angka2 + " adalah " + (angka1 + angka2));
    }

    public static void pengurangan(double angka1, double angka2) {
        System.out.println("Hasil Pengurangan antara " + angka1 + " dan " + angka2 + " adalah " + (angka1 - angka2));
    }

    public static void perkalian(double angka1, double angka2) {
        System.out.println("Hasil Perkalian antara " + angka1 + " dan " + angka2 + " adalah " + (angka1 * angka2));
    }

    public static void pembagian(double angka1, double angka2) {
        System.out.println("Hasil Pembagian antara " + angka1 + " dan " + angka2 + " adalah " + (angka1 / angka2));
    }

}
