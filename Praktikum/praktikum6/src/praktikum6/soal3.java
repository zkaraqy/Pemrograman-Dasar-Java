package praktikum6;
import java.util.Scanner;

public class soal3 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        boolean repeat = true;
        do {            
            System.out.println("Menu Program :");
            System.out.println("1. Lanjut");
            System.out.println("2. Berhenti");
            System.out.print("Pilihan menu (1/2) : ");
            int pilihan = input.nextInt();
            if (pilihan == 1) {
                System.out.println("Lanjut!");
                System.out.println("");
            } else if(pilihan == 2) {
                System.out.println("Program berhenti");
                repeat = false;
            }
        } while (repeat);
    }
}
