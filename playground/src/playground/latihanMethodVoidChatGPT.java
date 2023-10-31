package playground;

import java.util.Scanner;

public class latihanMethodVoidChatGPT {

    static void luasBalok(double panjang, double lebar, double tinggi) {
        double luas = 2*(panjang * lebar + panjang * tinggi + lebar * tinggi);
        System.out.println("Luas = 2 x (" + panjang + " x " + lebar + " + " + panjang + " x " + tinggi + " + " + lebar + " x " + tinggi + ") = " + luas);
    }
    
    static void volumeBalok(double panjang, double lebar, double tinggi) {
        double volume = panjang * lebar * tinggi;
        System.out.println("Volume = " + panjang + " x " + lebar + " x " + tinggi + " = " + volume);
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Program Menghitung Luas dan Volume balok");
        System.out.print("Panjang\t= ");
        double panjang = scan.nextDouble();
        System.out.print("Lebar\t= ");
        double lebar = scan.nextDouble();
        System.out.print("Tinggi\t= ");
        double tinggi = scan.nextDouble();
        System.out.println("");

        if (panjang >= 0 && lebar >= 0 && tinggi >= 0) {
            luasBalok(panjang, lebar, tinggi);
            System.out.println("");
            volumeBalok(panjang, lebar, tinggi);
        } else {
            System.out.println("Error. Hanya menerima bilangan bulat atau desimal positif.");
        }
    }
}
