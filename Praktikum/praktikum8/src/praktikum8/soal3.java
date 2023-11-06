package praktikum8;

import java.util.Scanner;

public class soal3 {

    static double jumlahDeretGeometri(double a, double r, double n) {
        double Sn;
        if (r > 1) {
            Sn = a * (Math.pow(r, n) - 1) / (r - 1);
            return Sn;
        } else if (r < 1) {
            Sn = a * (1 - Math.pow(r, n)) / (1 - r);
            return Sn;
        } else {
            return 0;
        }
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double a, r, n;
        System.out.println("Hitung Deret Geometri");
        System.out.print("Input a: ");
        a = input.nextDouble();
        System.out.print("input r: ");
        r = input.nextDouble();
        System.out.print("input n: ");
        n = input.nextDouble();
        System.out.println("\njumlah " + (int) n + " suku pertama barusan Geometri tersebut adalah " + (int)jumlahDeretGeometri(a, r, n));
    }
}
