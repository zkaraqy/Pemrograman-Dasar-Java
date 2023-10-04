package praktikum3;

import java.util.Scanner;

public class soal2 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double berat_barang = 0;
        double beratPerSatuan = 0;
        int IndeksBeratTas = 0;

        System.out.println("===========Indeks Berat Barang Bawaan Tasku==========");

        System.out.print("Banyak laptop       : ");
        double banyak_laptop = input.nextDouble();
        beratPerSatuan = 850.56 * banyak_laptop;

        System.out.print("Banyak buku tulis   : ");
        double banyak_bukuTulis = input.nextDouble();
        beratPerSatuan += 250.11 * banyak_bukuTulis;

        System.out.print("Banyak kotak pensil : ");
        double banyak_kotakPensil = input.nextDouble();
        beratPerSatuan += 25.31 * banyak_kotakPensil;

        System.out.print("Banyak Smartphone   : ");
        double banyak_Smartphone = input.nextDouble();
        beratPerSatuan += 200 * banyak_Smartphone;

        if (beratPerSatuan > 2000) {
            IndeksBeratTas = 5;
        } else if (beratPerSatuan >= 1500 && beratPerSatuan <= 2000) {
            IndeksBeratTas = 4;
        } else if (beratPerSatuan >= 1000 && beratPerSatuan < 1500) {
            IndeksBeratTas = 3;
        } else if (beratPerSatuan >= 500 && beratPerSatuan < 1000) {
            IndeksBeratTas = 2;
        } else if (beratPerSatuan > 0 && beratPerSatuan < 500) {
            IndeksBeratTas = 1;
        } else if (beratPerSatuan == 0) {
            IndeksBeratTas = 0;
        }

        System.out.println("=====================================================");

        if (banyak_Smartphone < 0 || banyak_bukuTulis < 0 || banyak_kotakPensil < 0 || banyak_laptop < 0) {
            System.out.println("ERROR - Tidak diperkenankan bilangan negatif!");
        } else {
            System.out.println("Indeks Berat Barang: " + IndeksBeratTas);
//            System.out.println("Total Berat Barang: " + beratPerSatuan);
            if (IndeksBeratTas == 5) {
                System.out.println("Berat barang melebihi ketentuan");
            } else if (IndeksBeratTas == 4 || IndeksBeratTas == 3 || IndeksBeratTas == 2 || IndeksBeratTas == 1) {
                System.out.println("Aman, bawaan barang tidak melebihi ketentuan");
            }

        }

    }
}
