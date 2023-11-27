package praktikum3;
import java.util.Scanner;

public class soal1 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai : ");
        int nilai = input.nextInt();
        
        if (nilai % 5 == 0 && nilai % 2 == 1) {
             System.out.println("Program Started");
        } else {
            System.out.println("Program Halted");
        }
    }
}
