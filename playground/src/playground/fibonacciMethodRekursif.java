package playground;

import java.util.Scanner;

public class fibonacciMethodRekursif {
    
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("      Program menampilkan nilai fibonacci ke-n     ");
        System.out.println("===================================================");
        System.out.print(" n = ");
        int n = scan.nextInt();
        System.out.println("===================================================");
        System.out.println(" Nilai fibonacci ke-" + n + " adalah " + fibonacci(n));
    }
    
    public static int fibonacci(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
