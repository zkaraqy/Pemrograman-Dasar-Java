package praktikum7;

import java.util.Scanner;

public class soal3 {

    static void kelipatan(int angka, int rentangAwal, int rentangAkhir) {
        for (int i = angka; i <= rentangAkhir; i += angka) {
            if (i >= rentangAwal) {
                System.out.print(i + ", ");
            }
        }
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("\nProgram menampilkan kelipatan angka");
            System.out.print("Masukkan angka kelipatan = ");
            int angka = input.nextInt();
            System.out.print("Masukkan rentang angka awal = ");
            int rentangAwal = input.nextInt();
            System.out.print("Masukkan rentang angka akhir = ");
            int rentangAkhir = input.nextInt();
            System.out.print("Angka-angka kelipatan dari " + angka + " = ");
            kelipatan(angka, rentangAwal, rentangAkhir);
            System.out.println("");
        } while (true);

    }
}
