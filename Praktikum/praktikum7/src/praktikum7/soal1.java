package praktikum7;

import java.util.Scanner;

public class soal1 {

    public static void main(String args[]) {
        int pilihan;
        Scanner input = new Scanner(System.in);
        do {
            menu();
            System.out.print("Nomor pilihan menu : ");
            pilihan = input.nextInt();
            System.out.println("");
            if (pilihan == 1) {
                System.out.print("Masukkan bilangan 1 = ");
                int bil1 = input.nextInt();
                System.out.print("Masukkan bilangan 2 = ");
                int bil2 = input.nextInt();
                penambahan(bil1, bil2);
            } else if (pilihan == 2) {
                System.out.print("Masukkan bilangan 1 = ");
                int bil1 = input.nextInt();
                System.out.print("Masukkan bilangan 2 = ");
                int bil2 = input.nextInt();
                pengurangan(bil1, bil2);
            } else if (pilihan == 3) {
                System.out.print("Masukkan bilangan = ");
                int bil = input.nextInt();
                genapAtauGanjil(bil);
            } else if (pilihan == 4) {
                System.out.print("Masukkan bilangan = ");
                int bil = input.nextInt();
                positifNegatifAtauNol(bil);
            } else if (pilihan == 5) {
                break;
            }
        } while (pilihan != 5);

    }

    static void penambahan(int bil1, int bil2) {
        System.out.println("Hasil = " + bil1 + " + " + bil2 + " = " + (bil1 + bil2));
    }

    static void pengurangan(int bil1, int bil2) {
        System.out.println("Hasil = " + bil1 + " - " + bil2 + " = " + (bil1 - bil2));
    }

    static void genapAtauGanjil(int bil) {
        if (bil % 2 == 0) {
            System.out.println(bil + " adalah bilangan bernilai genap");
        } else {
            System.out.println(bil + "adalah bilangan bernilai ganjil");
        }
    }

    static void positifNegatifAtauNol(int bil) {
        if (bil < 0) {
            System.out.println(bil + " adalah bilangan bernilai negatif");
        } else if (bil > 0) {
            System.out.println(bil + " adalah bilangan bernilai positif");
        } else {
            System.out.println(bil + " adalah bilangan bernilai nol");
        }
    }

    static void menu() {
        System.out.println("\n\tMenu Program :");
        System.out.println("1. Penambahan antara dua bilangan");
        System.out.println("2. Pengurangan antara dua bilangan");
        System.out.println("3. Menentukan bilangan bernilai genap atau ganjil");
        System.out.println("4. Menentukan bilangan bernilai positif, negatif atau nol");
        System.out.println("5. Keluar");
    }

}
