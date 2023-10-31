package playground;

import java.util.Scanner;

public class latihanMethodKelasTerbuka {

    static void gambarPersegiPanjang(int panjang, int lebar) {
        for (int i = 0; i < lebar; i++) {
            for (int j = 0; j < panjang; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    static void hitungLuasPersegiPanjang(int panjang, int lebar) {
        System.out.println("Luas = " + panjang + " x " + lebar + " = " + (panjang * lebar));
    }

    static void hitungKelilingPersegiPanjang(int panjang, int lebar) {
        System.out.println("Keliling = 2(" + panjang + " + " + lebar + ") = " + (2 * (panjang + lebar)));
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);  
        System.out.print("Panjang\t= ");
        int panjang = scan.nextInt();
        System.out.print("Lebar\t= ");
        int lebar = scan.nextInt();
        System.out.println("");

        gambarPersegiPanjang(panjang, lebar);
        System.out.println("");

        hitungLuasPersegiPanjang(panjang, lebar);
        System.out.println("");

        hitungKelilingPersegiPanjang(panjang, lebar);
    }
}
