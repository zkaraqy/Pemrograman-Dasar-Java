package percabangan;

import java.util.Scanner;

public class Matematika {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu Aplikasi Matematika:");
        System.out.println("1. Penambahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("");
        System.out.print("Pilih Menu = ");
        String pilihan = input.nextLine();
        
        if (pilihan.equals("1")) {
            System.out.print("Masukkan Angka Pertama = ");
            int angka1 = input.nextInt();
            System.out.print("Masukkan Angka Kedua = ");
            int angka2 = input.nextInt();
            System.out.println("");
            System.out.println("Hasil Penambahan antara " + angka1 + " dan " + angka2 + " adalah " + (angka1 + angka2));
        } else if (pilihan.equals("2")) {
            System.out.print("Masukkan Angka Pertama = ");
            int angka1 = input.nextInt();
            System.out.print("Masukkan Angka Kedua = ");
            int angka2 = input.nextInt();
            System.out.println("");
            System.out.println("Hasil Pengurangan antara " + angka1 + " dan " + angka2 + " adalah " + (angka1 - angka2));
        } else if (pilihan.equals("3")) {
            System.out.print("Masukkan Angka Pertama = ");
            int angka1 = input.nextInt();
            System.out.print("Masukkan Angka Kedua = ");
            int angka2 = input.nextInt();
            System.out.println("");
            System.out.println("Hasil Perkalian antara " + angka1 + " dan " + angka2 + " adalah " + (angka1 * angka2));
        } else if (pilihan.equals("4")) {
            System.out.print("Masukkan Angka Pertama = ");
            int angka1 = input.nextInt();
            System.out.print("Masukkan Angka Kedua = ");
            int angka2 = input.nextInt();
            System.out.println("");
            System.out.println("Hasil Pembagian antara " + angka1 + " dan " + angka2 + " adalah " + ((double) angka1 / (double) angka2));
        } else {
            System.out.println("Pilihan menu invalid. Error");
        }
    }
}
