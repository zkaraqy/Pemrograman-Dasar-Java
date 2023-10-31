package playground;

import java.util.Scanner;

public class method {

    static void hitung(int x) {
        double hasil = Math.pow(x, 2);
        System.out.println(x + " x " + x + " = " + hasil);
    }

    static void hitung2(int n, int m) {
        System.out.println(n + " + " + m + " = " + (n + m));
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan angka 1 = ");
        int x = scan.nextInt();
        System.out.print("Masukkan angka 2 = ");
        int y = scan.nextInt();
        System.out.println("");

        for (int i = x; i <= y; i++) {
            hitung2(i, i);
        }

//        hitung(input);
    }
}
