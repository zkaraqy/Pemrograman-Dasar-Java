package playground;

import java.util.Scanner;

public class deretFibonacciWhileLoop {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int i, n, f_n, f_n_1, f_n_2;

        System.out.print("mengambil nilai fibinocci ke - : ");
        n = input.nextInt();

        i = 1;
        f_n_2 = 0;
        f_n_1 = 1;
        f_n = 1;

        while (i <= n) {
            System.out.println("nilai ke-" + i + " = " + f_n);
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;
            i++;
        }

    }
}
