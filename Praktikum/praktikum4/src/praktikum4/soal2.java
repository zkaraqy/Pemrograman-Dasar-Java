package praktikum4;

import java.util.Scanner;

public class soal2 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ibukota Negara Indonesia adalah...");
        System.out.println("A. Banjarmasin\nB. Surabaya\nC. Aceh\nD. Jakarta");
        System.out.print("Jawab = ");
        char jwbn = input.next().charAt(0);
        switch (jwbn) {
            case 'D':
            case 'd':
                System.out.println("Jawaban anda benar");
                break;
            default:
                System.out.println("Jawaban anda salah");
        }
    }
}
