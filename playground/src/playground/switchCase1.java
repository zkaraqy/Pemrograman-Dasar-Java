package playground;

import java.util.Scanner;

/**
 * Buatlah program Java yang menggunakan switch-case untuk menentukan apakah
 * sebuah nilai merupakan bilangan prima.
 *
 * @author Azka Raki
 */
public class switchCase1 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String kalimat_pembuka = "Masukkan sebuah nilai : ";
        String prima = "true";
        
        System.out.print(kalimat_pembuka);
        int nilai = input.nextInt();
        
        for (int i = 0; i < kalimat_pembuka.length(); i++) {
            System.out.print("=");
        }
        
        System.out.println("");
        
        for (int i = 0; i < Math.sqrt(nilai); i++) {
            if (nilai % 2 == 0) {
                prima = "false";
                break;
            }
        }

        switch (prima) {
            case "true":
                System.out.println("Nilai " + nilai + " adalah bilangan prima");
                break;
            case "false":
                System.out.println("Nilai " + nilai + " bukan bilangan prima");
                break;
        }
    }
}
