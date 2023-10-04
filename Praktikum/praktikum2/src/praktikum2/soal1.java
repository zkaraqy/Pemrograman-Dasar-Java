package praktikum2;
import java.util.Scanner;

public class soal1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int panjang, lebar, tinggi, volume;
        System.out.print("panjang : ");
        panjang = input.nextInt();
        System.out.print("lebar : ");
        lebar = input.nextInt();
        System.out.print("tinggi : ");
        tinggi = input.nextInt();
        
        volume = panjang * lebar * tinggi;
        System.out.println("Volume balok = " + volume);
    }

}
