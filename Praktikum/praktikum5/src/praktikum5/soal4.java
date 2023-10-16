package praktikum5;

import java.util.Scanner;

public class soal4 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n, f_n, f_n_1, f_n_2;

        System.out.print("Banyak bilangan Fibonacci : ");
        n = input.nextInt();

        f_n_2 = 0;
        f_n_1 = 1;
        f_n = 1;

        System.out.print("0 ");
        for (int i = 1; i < n; i++) {
            System.out.print(f_n + " ");
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;
        }
        System.out.println("");

    }
}
