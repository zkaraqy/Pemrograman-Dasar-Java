package playground;

import java.util.Scanner;

public class deretFibonacciForLoop {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n, f_n, f_n_1, f_n_2;

        System.out.print("mengambil nilai fibinocci ke - : ");
        n = input.nextInt();

        f_n_2 = 0;
        f_n_1 = 1;
        f_n = 1;

        for (int i = 1; i <= n; i++) {
            System.out.println("nilai ke-" + i + " = " + f_n);
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;
        }

    }
}
