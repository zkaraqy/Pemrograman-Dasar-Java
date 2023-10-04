package praktikum1;

import java.util.Scanner;

public class soal2 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String kalimat1, kalimat2, kalimat3;
        System.out.print("Kalimat 1 : ");
        kalimat1 = input.nextLine();
        System.out.print("Kalimat 2 : ");
        kalimat2 = input.nextLine();
        System.out.print("Kalimat 3 : ");
        kalimat3 = input.nextLine();

        System.out.println("\n" + kalimat1 + "\n" + kalimat2 + "\n\t" + kalimat3);
    }
}
