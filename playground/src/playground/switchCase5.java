package playground;

import java.util.Scanner;

/**
 * Buatlah program Java untuk menghitung diskon berdasarkan jumlah belanja. Jika
 * jumlah belanja lebih dari 500.000, diskonnya 10%. Jika jumlah belanja lebih
 * dari 1.000.000, diskonnya 15%. Selain itu, tidak ada diskon. Program harus
 * menerima input jumlah belanja dari pengguna.
 *
 * @author Muhammad Azka Raki
 */
public class switchCase5 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String heading = "Program menghitung diskon berdasarkan jumlah belanja", persentaseDiskon = "-";
        System.out.println(heading);
        for (int i = 0; i < heading.length(); i++) {
            System.out.print("=");
        }
        System.out.println("");
        System.out.print("Enter jumlah belanja : Rp.");
        double jumlah_belanja = input.nextDouble();

        double diskon = 0;
        if (jumlah_belanja >= 500_000 && jumlah_belanja < 1_000_000) {
            diskon = 0.1;
            persentaseDiskon = "10%";
        } else if (jumlah_belanja >= 1_000_000) {
            diskon = 0.15;
            persentaseDiskon = "15%";
        }
        jumlah_belanja -= jumlah_belanja * diskon;

        for (int i = 0; i < heading.length(); i++) {
            System.out.print("=");
        }
        System.out.println("");
        System.out.println("Diskon yang anda dapatkan = " + persentaseDiskon);
        System.out.println("Jumlah belanja            = " + (int) jumlah_belanja);
    }
}
