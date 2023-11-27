package playground;

import java.util.Scanner;

public class latihanMethodRekursif {

    public static void main(String args[]) {
        /**
         * 1. Hitung Bilangan Positif: Buatlah program Java yang menghitung
         * jumlah bilangan positif dari 1 hingga n menggunakan rekursi.
         *
         */

        Scanner sc = new Scanner(System.in);
        String label = " + ";
        System.out.print("masukkan angka: ");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            if (i == 1) {
                label = " = ";
            }
            System.out.print(i + label);
        }
        System.out.println(jumlahBilPositif(n));
    }

    public static int jumlahBilPositif(int i) {
        if (i == 0) {
            return i;
        }
        return i + jumlahBilPositif(i - 1);
    }
    
}
