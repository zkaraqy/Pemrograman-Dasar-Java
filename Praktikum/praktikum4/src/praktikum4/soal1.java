package praktikum4;

import java.util.Scanner;

public class soal1 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int pil, sisiA = 0, sisiB = 0, sisiC = 0;
        System.out.print("Menu program mencari nilai sisi sebuah segitiga : \n1. Mencari nilai sisi a\n2. Mencari nilai sisi b\n3. Mencari nilai sisi c");
        System.out.println("\n================================================");
        System.out.print("Pilihan : ");
        pil = input.nextInt();
        System.out.println("================================================");
        switch (pil) {
            case 1:
                System.out.print("Enter sisi b : ");
                sisiB = input.nextInt();
                System.out.print("Enter sisi c : ");
                sisiC = input.nextInt();
                sisiA = (int) Math.sqrt((sisiC * sisiC) - (sisiB * sisiB));
                System.out.println("================================================");
                System.out.println("Nilai sisi A = " + sisiA);
                break;
            case 2:
                System.out.print("Enter sisi a : ");
                sisiA = input.nextInt();
                System.out.print("Enter sisi c : ");
                sisiC = input.nextInt();
                sisiB = (int) Math.sqrt((sisiC * sisiC) - (sisiA * sisiA));
                System.out.println("================================================");
                System.out.println("Nilai sisi B = " + sisiB);
                break;
            case 3:
                System.out.print("Enter sisi a : ");
                sisiA = input.nextInt();
                System.out.print("Enter sisi b : ");
                sisiB = input.nextInt();
                sisiC = (int) Math.sqrt((sisiA * sisiA) + (sisiB * sisiB));
                System.out.println("================================================");
                System.out.println("Nilai sisi B = " + sisiC);
                break;

        }

    }
}
