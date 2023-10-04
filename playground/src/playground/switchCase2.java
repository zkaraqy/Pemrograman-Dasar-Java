package playground;

import java.util.Scanner;

/**
 * Buatlah sebuah program Java yang menerima input angka bulan (1-12) dari
 * pengguna dan menampilkan nama bulan tersebut. Gunakan switch-case untuk
 * melakukan pengecekan.
 *
 * @author Muhammad Azka Raki
 */
public class switchCase2 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter angka bulan : ");
        int bulan = input.nextInt();
        switch (bulan) {
            case 1:
                System.out.println("Januari adalah bulan ke-" + bulan);
                break;
            case 2:
                System.out.println("Februari adalah bulan ke-" + bulan);
                break;
            case 3:
                System.out.println("Maret adalah bulan ke-" + bulan);
                break;
            case 4:
                System.out.println("April adalah bulan ke-" + bulan);
                break;
            case 5:
                System.out.println("Mei adalah bulan ke-" + bulan);
                break;
            case 6:
                System.out.println("Juni adalah bulan ke-" + bulan);
                break;
            case 7:
                System.out.println("Juli adalah bulan ke-" + bulan);
                break;
            case 8:
                System.out.println("Agustus adalah bulan ke-" + bulan);
                break;
            case 9:
                System.out.println("September adalah bulan ke-" + bulan);
                break;
            case 10:
                System.out.println("Oktober adalah bulan ke-" + bulan);
                break;
            case 11:
                System.out.println("November adalah bulan ke-" + bulan);
                break;
            case 12:
                System.out.println("Desember adalah bulan ke-" + bulan);
                break;
            default:
                System.out.println("Input Invalid!");
        }
    }
}
