package playground;

import java.util.Scanner;

public class soalPengulanganDariChatGPT {

    public static void main(String args[]) {

//        int i = 1;
//        while (i <= 10) {            
//            System.out.println(i);
//            i++;
//        }
//
//        int i = 1;
//        while (i <= 20) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//            i++;
//        }
//
//        for (int i = 10; i > 0; i--) {
//            System.out.println(i);
//        }
//
//        int sum = 0;
//        for (int i = 2; i <= 100; i++) {
//            
//            if (i == 2 || i == 3 || i == 7) {
//                System.out.println(i);
//                sum += i;
//            }
//            if (i % 2 == 1 && !(i % 3 == 0 || i % 5 == 0 || i % 7 == 0)) {
//                System.out.println(i);
//                sum += i;
//            }
//        }
//        System.out.println(sum);
//
        Scanner input = new Scanner(System.in);
//        int angka, sum = 0;
//
//        do {
//            System.out.print("Masukkan angka (0 untuk berhenti): ");
//            angka = input.nextInt();
//            
//            if(angka != 0) {
//                sum += angka;
//            }
//        } while (angka != 0);
//
//        System.out.println("Anda telah berhenti.");
//        System.out.println("Jumlah angka yang dimasukkan = " + sum);
//
        for (int i = 1; i <= 10; i++) {
            if (i == 3 || i == 7) {
                continue;
            }
            System.out.println(i);
//            if (i == 5) {
//                break;
//            }
        }
    }
}
