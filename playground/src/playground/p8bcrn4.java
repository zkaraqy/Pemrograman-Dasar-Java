package playground;

import java.util.Scanner;

public class p8bcrn4 {

    public static int un(int n) {
        if (n <= 1) {
            return n;
        }
        return un(n - 1) + un(n - 2);
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Input n: ");
        n = scan.nextInt();
        System.out.println("Bilangan Fibbonaci ke-" + n + " adalah " + un(n));
    }
}
