package perulangan;

import java.util.Scanner;

public class rerata {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n, i = 1;
        double angka, rataRata = 0;
        System.out.print("Jumlah angka yang ingin dimasukkan : ");
        n = input.nextInt();

        while (i <= n) {
            System.out.print("Masukan angka ke-" + i + " : ");
            angka = input.nextInt();
            rataRata += angka;
            i++;
        }

        rataRata = rataRata / n;
        System.out.println("Rerata angka adalah : " + rataRata);

    }
}
