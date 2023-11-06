package praktikum8;

import java.util.Scanner;

public class soal1 {

    static int umurUser(int tahunLahir) {
        int umur = 2023 - tahunLahir;
        return umur;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama        : ");
        String nama = input.nextLine();
        System.out.print("Tahun Lahir : ");
        int tahunLahir = input.nextInt();
        System.out.println("\nUmur " + nama + " adalah " + umurUser(tahunLahir) + " Tahun");
    }
}
