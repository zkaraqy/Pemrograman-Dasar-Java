package praktikum7;

import java.util.Scanner;

public class soal2 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan = ");
        int bilangan = input.nextInt();
        apakahPrima(bilangan);
        apakahFibonacci(bilangan);
    }

    static void apakahPrima(int bilangan) {
        if (bilangan == 2 || bilangan == 3 || bilangan == 5 || bilangan == 7) {
            System.out.println(bilangan + " adalah bilangan prima");
        } else if (bilangan % 2 == 0 || bilangan % 3 == 0 || bilangan % 5 == 0 || bilangan % 7 == 0 || bilangan == 1) {
            System.out.println(bilangan + " bukan bilangan prima");
        } else {
            System.out.println(bilangan + " adalah bilangan prima");
        }
    }

    static void apakahFibonacci(int bilangan) {
        int f_n, f_n_1, f_n_2;
        f_n_2 = 0;
        f_n_1 = 1;
        f_n = 1;

        for (int i = 1; i <= bilangan; i++) {
            if (f_n_1 == bilangan) {
                break;
            }
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;
        }
        if (bilangan == f_n_1) {
            System.out.println(bilangan + " adalah bilangan Fibonacci");
        } else {
            System.out.println(bilangan + " bukan bilangan Fibonacci");
        }
    }

}
