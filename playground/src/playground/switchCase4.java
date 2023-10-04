package playground;

import java.util.Scanner;

/**
 * Buatlah program Java untuk mengonversi angka hari dalam seminggu menjadi nama
 * hari. Program harus menerima input angka hari (1-7) dan menampilkan nama hari
 * yang sesuai menggunakan switch-case.
 *
 * @author Muhammad Azka Raki
 */
public class switchCase4 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter angka hari : ");
        int hari = input.nextInt();
        switch (hari) {
            case 1:
                System.out.println("nama hari ke-" + hari + " adalah Senin");
                break;
            case 2:
                System.out.println("nama hari ke-" + hari + " adalah Selasa");
                break;
            case 3:
                System.out.println("nama hari ke-" + hari + " adalah Rabu");
                break;
            case 4:
                System.out.println("nama hari ke-" + hari + " adalah Kamis");
                break;
            case 5:
                System.out.println("nama hari ke-" + hari + " adalah Jum\'at");
                break;
            case 6:
                System.out.println("nama hari ke-" + hari + " adalah Sabtu");
                break;
            case 7:
                System.out.println("nama hari ke-" + hari + " adalah Minggu");
                break;
            default:
                System.out.println("Input Invalid!");
        }
    }
}
