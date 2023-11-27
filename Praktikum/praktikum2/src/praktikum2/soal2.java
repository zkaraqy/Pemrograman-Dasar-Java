package praktikum2;
import java.util.Scanner;

public class soal2 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int bilangan;
        System.out.print("Masukkan bilangan : ");
        bilangan = input.nextInt();
        String genapAtauGanjil = (bilangan % 2 == 0) ? " merupakan bilangan genap" : " merupakan bilangan ganjil";
        System.out.println(bilangan + genapAtauGanjil);
    }
}
