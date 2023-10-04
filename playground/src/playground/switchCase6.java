package playground;

import java.util.Scanner;

/**
 * Buatlah program Java untuk menghitung biaya parkir berdasarkan jam parkir.
 * Tarif parkir per jam adalah 5000 rupiah. Jika parkir lebih dari 5 jam,
 * tambahkan biaya tambahan sebesar 2000 rupiah per jam. Program harus menerima
 * input jumlah jam parkir dari pengguna.
 *
 * @author Muhammad Azka Raki
 */
public class switchCase6 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String heading, status_parkir; // status parkir adalah "lebih" jika parkir > 5 jam, "belum" jika <= 5 jam dan "ERROR" jika input < 0
        int jam_parkir, tarif_parkir_perJam;

        heading = "Program Menghitung Biaya Parkir";
        status_parkir = "";
        tarif_parkir_perJam = 5_000;

        System.out.println(heading);
        for (int i = 0; i < heading.length(); i++) {
            System.out.print("=");
        }
        System.out.println("");
        System.out.print("Enter jam parkir : ");
        jam_parkir = input.nextInt();

        if (jam_parkir > 0) {
            if (jam_parkir > 5) {
                status_parkir = "lebih";
                tarif_parkir_perJam = (tarif_parkir_perJam + 2_000) * jam_parkir;
            } else {
                status_parkir = "belum";
                tarif_parkir_perJam = tarif_parkir_perJam * jam_parkir;
            }
        } else {
            status_parkir = "ERROR";
        }

        switch (status_parkir) {
            case "ERROR":
                System.out.println("ERROR - Input Invalid!");
                break;
            case "lebih":
                System.out.println("Tarif Parkir = " + tarif_parkir_perJam);
                break;
            case "belum":
                System.out.println("Tarif Parkir = " + tarif_parkir_perJam);
                break;

        }
    }
}
