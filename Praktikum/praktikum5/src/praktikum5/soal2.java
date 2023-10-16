package praktikum5;

import java.util.Scanner;

public class soal2 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tinggi segitiga : ");
        int tinggi = input.nextInt();
        int bintang = tinggi;
        for (int i = tinggi; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = i; j <= bintang; j++) {
                System.out.print("*");

            }
            bintang++;
            System.out.print("\n");

        }

    }
}
