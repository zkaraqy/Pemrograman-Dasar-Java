package perulangan;

import java.util.Scanner;

public class latihan4_6 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int i = 1, n, angka, angkaTerbesar = -9999, angkaTerkecil = 9999;
        System.out.print("Jumlah angka yang ingin dimasukan : ");
        n = input.nextInt();
        
        do {
            System.out.print("Masukan angka ke-" + i + " : ");
            angka = input.nextInt();
            
            if (angka > angkaTerbesar) {
                angkaTerbesar = angka;
            }
            
            if (angka < angkaTerkecil) {
                angkaTerkecil = angka;
            }
            
            i++;
        } while (i <= n);
        
        System.out.println("Angka terbesar adalah : " + angkaTerbesar);
        System.out.println("Angka terkecil adalah : " + angkaTerkecil);
    }
}
