package praktikum8;

import java.util.Scanner;

public class soal4 {

    static String tambahKalimat(String kalimat, Scanner input) {
        return (kalimat + input.nextLine());
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String kalimat = "";
        char lanjut;
        do {
            System.out.print("Masukkan kalimat: " + kalimat);
            kalimat = tambahKalimat(kalimat, input);
            System.out.print("Lanjut menambahkan kalimat ? (y/n) ");
            lanjut = input.next().charAt(0);
            if (lanjut == 'y') {
                kalimat = tambahKalimat(kalimat, input);
                System.out.println("");
            } else if (lanjut == 'n') {
                System.out.println("\nKalimat akhir : " + kalimat);
                break;
            }
        } while (true);
    }
}
