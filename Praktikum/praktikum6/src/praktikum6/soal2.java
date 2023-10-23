package praktikum6;

import java.util.Scanner;

public class soal2 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka = ");
        int angka = input.nextInt();
        while (angka > 0) {
            if (angka > 1) {
                System.out.println("Bunga mawar mekarlah " + angka + ", layu 1 tinggallah " + (angka - 1));
            } else {
                System.out.println("Bunga mawar mekarlah " + angka + ", layu 1 habis semua");
            }
            angka--;
        }
    }
}
