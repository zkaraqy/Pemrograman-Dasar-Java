package playground;

import java.util.Scanner;
import java.util.Arrays;

public class latihanArray1 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("     Program Pembuat Matriks     ");
        System.out.println("---------------------------------");
        System.out.print(" Masukkan jumlah baris = ");
        int baris = input.nextInt();
        System.out.print(" Masukkan jumlah kolom = ");
        int kolom = input.nextInt();
        System.out.println("---------------------------------");
        int[][] matriksInt = new int[baris][kolom];
        System.out.println(" Matriks:");
        printArray2D(matriksInt);
        System.out.println("---------------------------------");
        System.out.print(" Apakah ingin anda isi? (y/n) = ");
        String pilihan = input.nextLine();
        pilihan = input.nextLine();
        System.out.println("---------------------------------");

        if (pilihan.equalsIgnoreCase("y")) {
            for (int i = 0; i < matriksInt.length; i++) {
                for (int j = 0; j < matriksInt[i].length; j++) {
                    System.out.print( " isi baris ke-" + (i + 1) + " kolom ke-" + (j + 1) + " = ");
                    matriksInt[i][j] = input.nextInt();
                }
            }
            System.out.println("---------------------------------");
            System.out.println(" Matriks:");
            printArray2D(matriksInt);
            System.out.println("---------------------------------");
        } else if (pilihan.equalsIgnoreCase("n")) {
            System.out.println(" Anda Keluar");
        } else {
            System.out.println(" Pilihan invalid. Program dihentikan");
        }
    }

//    public static void printArray2D(int[][] array) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("   ");
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + ", ");
//            }
//            System.out.print("\n");
//        }
//    }
    
    public static void printArray2D(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("   " + Arrays.toString(array[i]));
        }
    }
}
