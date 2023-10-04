
package praktikum2;
import java.util.Scanner;

public class soal4 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double pi = 3.141592;
        double jari_jari;
        System.out.print("Jari-jari lingkaran : ");
        jari_jari =  input.nextDouble();
        double hasil = pi*jari_jari*jari_jari;
        
        System.out.println("Luas lingkaran = " + (int) hasil);
    }
}
