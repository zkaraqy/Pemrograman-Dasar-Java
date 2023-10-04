/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package playground;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class ifelse1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String kalimat_pembuka, jenis_kendaraan;
        int lama_parkir, biaya_parkir; // biaya parkir itu rupiah per jam

        biaya_parkir = 0;
        kalimat_pembuka = "Program Menghitung Biaya Parkir Berdasarkan Jenis Kendaraan dan Lama Parkirnya";
        System.out.println(kalimat_pembuka);

        for (int i = 0; i < kalimat_pembuka.length(); i++) {
            System.out.print("=");
        }

        System.out.print("\nJenis kendaraan yang ingin diparkir (mobil/motor/sepeda): ");
        jenis_kendaraan = input.nextLine();
        System.out.print("Perkiraan berapa lama ingin parkir (jam) : ");
        lama_parkir = input.nextInt();

        if (jenis_kendaraan.equalsIgnoreCase("mobil")) {
            biaya_parkir = 5000;
            if (lama_parkir > 2) {
                biaya_parkir = biaya_parkir + 1000 * (lama_parkir - 2);
            }
        } else if (jenis_kendaraan.equalsIgnoreCase("motor")) {
            biaya_parkir = 3000;
            if (lama_parkir > 2) {
                biaya_parkir = biaya_parkir + 500 * (lama_parkir - 2);
            }
        } else if (jenis_kendaraan.equalsIgnoreCase("sepeda")) {
            biaya_parkir = 0;
            if (lama_parkir > 3) {
                biaya_parkir = biaya_parkir + 2000 * (lama_parkir - 3);
            }
        } else {
            System.out.println("Jenis kendaraan tidak valid");
        }

        for (int i = 0; i < kalimat_pembuka.length(); i++) {
            System.out.print("=");
        }

        System.out.println("\nTotal biaya parkir = " + biaya_parkir + " rupiah");
    }
}
