package praktikum4;

import java.util.Scanner;

public class soal4 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String unsur;
        System.out.println("Sebutkan salah satu dari tiga unsur penting dalam membuat sejarah!");
        System.out.print("Jawab : ");
        unsur = input.nextLine();
        switch (unsur) {
            case "manusia":
            case "ruang":
            case "waktu":
                System.out.println(unsur + " merupakan salah satu unsur penting pembentuk sejarah");
                break;
            default:
                System.out.println(unsur + " bukanlah salah satu unsur penting pembentuk sejarah");
        }
    }
}
