package method;

import java.util.Scanner;

public class Segitiga {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double a, t;
        System.out.println("Hitung Luas Segitiga");
        System.out.print("Masukkan alas   : ");
        a = input.nextDouble();
        System.out.print("Masukkan tinggi : ");
        t = input.nextDouble();
        System.out.println("");
        System.out.println("Luas Segitiga dengan alas : " + a + " dan tinggi : " + t + " adalah " + hitungLuasSegitiga(a, t));
    }
    
    public static double hitungLuasSegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }
}
