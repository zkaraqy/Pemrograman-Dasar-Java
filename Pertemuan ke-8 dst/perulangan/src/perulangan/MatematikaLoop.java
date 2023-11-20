package perulangan;

import java.util.Scanner;

public class MatematikaLoop {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        
        do {
            
            System.out.println("Menu Aplikasi Matematika:");
            System.out.println("1. Penambahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Keluar Aplikasi");
            System.out.println("");
            System.out.print("Pilih Menu = ");
            pilihan = input.nextInt();

            if (pilihan >= 1 && pilihan <= 4) {

                System.out.print("Masukkan Angka Pertama = ");
                int angka1 = input.nextInt();
                System.out.print("Masukkan Angka Kedua = ");
                int angka2 = input.nextInt();

                switch (pilihan) {
                    case 1: {
                        System.out.println("");
                        System.out.println("Hasil Penambahan antara " + angka1 + " dan " + angka2 + " adalah " + (angka1 + angka2));
                        break;
                    }
                    case 2: {
                        System.out.println("");
                        System.out.println("Hasil Pengurangan antara " + angka1 + " dan " + angka2 + " adalah " + (angka1 - angka2));
                        break;
                    }
                    case 3: {
                        System.out.println("");
                        System.out.println("Hasil Perkalian antara " + angka1 + " dan " + angka2 + " adalah " + (angka1 * angka2));
                        break;
                    }
                    case 4: {
                        System.out.println("");
                        System.out.println("Hasil Pembagian antara " + angka1 + " dan " + angka2 + " adalah " + ((double) angka1 / (double) angka2));
                        break;
                    }
                }
            }
            System.out.println("------------------------------------------");

        } while (pilihan != 5);

    }
}
