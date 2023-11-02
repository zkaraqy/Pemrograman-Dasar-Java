package playground;

import java.util.Scanner;

public class p8bcrn3 {

    static double hitungSn(double a, double b, double n) {
        double Sn = n / 2 * (2 * a + (n - 1) * b);
        return Sn;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        double a, b, n;
        System.out.print("Input a: ");
        a = scan.nextInt();
        System.out.print("Input b: ");
        b = scan.nextInt();
        System.out.print("Input n: ");
        n = scan.nextInt();
        System.out.println("Jumlah " + (int) n + " suku pertama aritmatika tersebut adalah " + (int) hitungSn(a, b, n));
    }
}
