package playground;

import java.util.Scanner;
import java.util.Arrays;

public class operasiPadaArray {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        /*
        int[] arrayAngka1 = {1, 2, 3, 4, 5};

        // merubah array menjadi string
        System.out.println("\nMerubah array menjadi string\n==============");
        printArray(arrayAngka1);

        // mengkopi array
        System.out.println("\nMengkopi array\n==============");
        int[] arrayAngka2 = new int[5];
        printArray(arrayAngka1);
        printArray(arrayAngka2);

        System.out.println("\nmengkopi dengan loop");
        for (int i = 0; i < arrayAngka1.length; i++) {
            arrayAngka2[i] = arrayAngka1[i];
        }
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka2);
        System.out.println(arrayAngka2);

        System.out.println("\nmengkopi dengan copyOf");
        int[] arrayAngka3 = Arrays.copyOf(arrayAngka1, 3);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka3);
        System.out.println(arrayAngka3);

        System.out.println("\nmengkopi dengan copyOfRange");
        int[] arrayAngka4 = Arrays.copyOfRange(arrayAngka1, 2, 5);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka4);
        System.out.println(arrayAngka4);

        // fill array
        System.out.println("\nFill array\n==============");
        int[] arrayAngka5 = new int[10];
        printArray(arrayAngka5);
        Arrays.fill(arrayAngka5, 5);
        printArray(arrayAngka5);

        // komparasi array
        System.out.println("\nkomparasi array\n==============");
        int[] arrayAngka6 = {1, 2, 3, 4, 9};
        int[] arrayAngka7 = {1, 2, 3, 4, 5};

        System.out.println("\nmembandingkan antara dua buah array");
        System.out.println(Arrays.equals(arrayAngka6, arrayAngka7));

        if (Arrays.equals(arrayAngka6, arrayAngka7)) {
            System.out.println("array ini sama");
        } else {
            System.out.println("array ini beda");
        }

        System.out.println("\nngecek mana array yang lebih besar");
        System.out.println(Arrays.compare(arrayAngka6, arrayAngka7));

        System.out.println("\nngecek mana index yang berbeda");
        System.out.println(Arrays.mismatch(arrayAngka6, arrayAngka7));

        // sort array
        System.out.println("\nsort array\n==============");
        int[] arrayAngka8 = {1, 6, 4, 5, 3, 5, 2, 6};
        printArray(arrayAngka8);
        Arrays.sort(arrayAngka8);
        printArray(arrayAngka8);

        // search array
        System.out.println("\nsearch array\n==============");
        int angka = 3;
        int posisi = Arrays.binarySearch(arrayAngka8, angka);
        System.out.println("angka " + angka + " ada di index " + posisi);

        // tugas -> sort kebalik,
        
        int[] arrayInt = {7, 5, 8, 4, 9, 2, 3, 1, 6};
        Arrays.sort(arrayInt);
        int[] arrayInt2 = new int[arrayInt.length];
        
        printArray(arrayInt);
        printArray(arrayInt2);
        System.out.println("");
        
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt2[i] = arrayInt[arrayInt.length - i - 1];
        }
        
        printArray(arrayInt);
        printArray(arrayInt2);
        
        // operasi tambah antara dua buah array
        
        int[] arrayInt1 = {1, 2, 3, 4, 5};
        int[] arrayInt2 = {6, 7, 8, 9, 10};
        int[] arrayInt3 = new int[5];

        printArray(arrayInt1);
        printArray(arrayInt2);
        printArray(arrayInt3);
        System.out.println("");

        for (int i = 0; i < arrayInt3.length; i++) {
            arrayInt3[i] = arrayInt1[i] + arrayInt2[i];
        }

        printArray(arrayInt1);
        printArray(arrayInt2);
        printArray(arrayInt3);
        System.out.println("");
        
        // mengabungkan dua buah array,

        int[] arrayInt1 = {1, 2, 3, 4};
        int[] arrayInt2 = {6, 7, 8};
        int[] arrayInt3 = Arrays.copyOf(arrayInt1, arrayInt1.length + arrayInt2.length);
        for (int i = 0; i < arrayInt2.length; i++) {
            arrayInt3[arrayInt1.length + i] = arrayInt2[i];
        }
        printArray(arrayInt3);
        
         */

        int[] arrayInt1 = {7, 5, 8, 4, 9, 2, 3, 1, 6, 100, -100};
        reverseSort(arrayInt1);
        System.out.println("");

        int[] arrayInt2 = {1, 2, 3, 4, 5};
        int[] arrayInt3 = {6, 7, 8, 9, 10};
        jumlah2Array(arrayInt2, arrayInt3);
        System.out.println("");

        int[] arrayInt4 = {1, 2, 77, 4, 5};
        int[] arrayInt5 = {6, 7, 8, 9, 10};
        gabung2Array(arrayInt4, arrayInt5);
    }

    public static void reverseSort(int[] dataArray) {
        Arrays.sort(dataArray);
        int[] array = new int[dataArray.length];
        for (int i = 0; i < dataArray.length; i++) {
            array[i] = dataArray[dataArray.length - i - 1];
        }
        printArray(array);
    }

    public static void gabung2Array(int[] array1, int[] array2) {
        int[] array3 = Arrays.copyOf(array1, array1.length + array2.length);
        for (int i = 0; i < array2.length; i++) {
            array3[array1.length + i] = array2[i];
        }
        printArray(array3);
    }

    public static void jumlah2Array(int[] array1, int[] array2) {
        if (array1.length == array2.length) {
            int[] array3 = new int[array1.length];
            for (int i = 0; i < array3.length; i++) {
                array3[i] = array1[i] + array2[i];
            }
            printArray(array3);
        } else {
            System.out.println("panjang kedua elemen berbeda. ERROR");
        }
    }

    public static void printArray(int[] dataArray) {
        System.out.println("array = " + Arrays.toString(dataArray));
    }

}
