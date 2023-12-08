package playground;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayKelasTerbuka {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arrayInt = {1, 2, 3, 4, 5, 6};
//        System.out.println(Arrays.binarySearch(arrayInt, 6)); // output = 5

//        System.out.println(Arrays.toString(Arrays.copyOf(arrayInt, 10))); // output = [1, 2, 3, 4, 5, 6, 0, 0, 0, 0]
//        int[] arrayInt2 = Arrays.copyOf(arrayInt, 10);
//        System.out.println(arrayInt2.length); // output = 10
//        System.out.println(Arrays.stream(arrayInt).sum()); // output 21
//        System.out.println(Arrays.stream(arrayInt).max().getAsInt()); // output = 6
//        System.out.println(Arrays.stream(arrayInt).min().getAsInt()); // output = 1
//        looping standart
/*
        System.out.println("looping standart");
        for (int i = 0; i < 6; i++) {
            System.out.println("index ke-" + i + " adalah = " + arrayInt[i]);
        }
        System.out.println("");
         */
 /*        
//        looping dengan property array
        System.out.println("looping dengan property array");
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println("index ke-" + i + " adalah = " + arrayInt[i]);
        }
        System.out.println("");
         */
 /*
//        looping khusus untuk collection <- array
        System.out.println("looping for each");
        for (int i : arrayInt) {
            System.out.println("angka pada looping ini = " + i);
        }
         */
    }
}
