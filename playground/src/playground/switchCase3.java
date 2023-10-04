package playground;

import java.util.Scanner;

/**
 * Buatlah program Java untuk menghitung jumlah hari dalam suatu bulan. Program
 * tersebut harus menerima dua input dari pengguna: angka bulan (1-12) dan
 * tahun. Gunakan switch-case untuk menentukan jumlah hari berdasarkan bulan dan
 * tahun tersebut.
 *
 * @author Muhammad Azka Raki
 */
public class switchCase3 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int bulan, tahun, jumlahHariPerBulanPerTahun = 0;
        String statusBulan, statusTahun;

        System.out.print("Enter bulan : ");
        bulan = input.nextInt();
        if (bulan % 2 == 0) {
            statusBulan = "bulan genap";
        } else {
            statusBulan = "bulan ganjil";
        }

        System.out.print("Enter tahun : ");
        tahun = input.nextInt();
        if (tahun % 4 == 0) {
            statusTahun = "tahun kabisat";
        } else {
            statusTahun = "tahun biasa";
        }

        switch (statusTahun) {
            case "tahun kabisat":
                switch (bulan) {
                    case 2:
                        jumlahHariPerBulanPerTahun = 29;
                        break;
                    default:
                        switch (statusBulan) {
                            case "bulan genap":
                                jumlahHariPerBulanPerTahun = 30;
                                break;
                            case "bulan ganjil":
                                jumlahHariPerBulanPerTahun = 31;
                                break;
                        }
                }
                break;
            case "tahun biasa":
                switch (bulan) {
                    case 2:
                        jumlahHariPerBulanPerTahun = 28;
                        break;
                    default:
                        switch (statusBulan) {
                            case "bulan genap":
                                jumlahHariPerBulanPerTahun = 30;
                                break;
                            case "bulan ganjil":
                                jumlahHariPerBulanPerTahun = 31;
                                break;
                        }
                }
                break;
        }
        System.out.println("jumlah hari berdasarkan bulan " + bulan + " dan tahun " + tahun + " adalah " + jumlahHariPerBulanPerTahun);
    }
}
