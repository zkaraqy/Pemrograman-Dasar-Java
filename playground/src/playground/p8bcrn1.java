package playground;

import java.util.Scanner;

//p8bcrn1
public class p8bcrn1 {

    static int umur(int tahunLahir) {
        int umur = 2023 - tahunLahir;
        return umur;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nama        : ");
        String nama = scan.nextLine();
        System.out.print("Tahun lahir : ");
        int tahunLahir = scan.nextInt();
        System.out.println("Nama\t= " + nama);
        System.out.println("Umur\t= " + umur(tahunLahir));
    }
}
