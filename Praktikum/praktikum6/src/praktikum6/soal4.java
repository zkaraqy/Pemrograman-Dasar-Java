package praktikum6;
import java.util.Scanner;

public class soal4 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        String lanjut;
        double jumlahAngka = 1, angka, nilaiTerkecil = 9999, nilaiTerbesar = -9999, rataRata = 0;
        boolean repeat = true;
        do {
            System.out.print("Masukkan bilangan\t: ");
            angka = input.nextDouble();
            System.out.print("Ingin lanjut? (y/n)\t: ");
            lanjut = input2.nextLine();
            rataRata += angka;
            nilaiTerkecil = (angka < nilaiTerkecil) ? nilaiTerkecil = angka : nilaiTerkecil;
            nilaiTerbesar = (angka > nilaiTerbesar) ? nilaiTerbesar = angka : nilaiTerbesar;
            if (lanjut.equals("y")) {
                jumlahAngka++;
                repeat = true;
            } else if (lanjut.equals("n")) {
                repeat = false;
            }

        } while (repeat);

        rataRata = rataRata / jumlahAngka;
        System.out.println("\nNilai tertinggi\t: " + (int) nilaiTerbesar);
        System.out.println("Nilai terendah\t: " + (int) nilaiTerkecil);
        System.out.println("Rata-rata\t: " + rataRata);

    }
}
