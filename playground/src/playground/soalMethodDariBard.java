package playground;

import java.util.Arrays;
import java.util.Scanner;

public class soalMethodDariBard {

//    method no.1
    static int perkalianDuaBilangan(int bil1, int bil2) {
        if (bil1 < 0 || bil2 < 0) {
            return 0;
        } else {
            return bil1 * bil2;
        }
    }

//    method no.2
    static int jumlahKaraterDariKalimat(String kalimat) {
        return kalimat.length();
    }

//    method no.3
    static boolean palindrome(String[] splitTxt) {
        String[] rebuildTxt = new String[splitTxt.length];
        for (int i = 0; i < splitTxt.length; i++) {
            rebuildTxt[i] = splitTxt[splitTxt.length - i - 1];
        }
        String unSplitTxt = Arrays.toString(rebuildTxt).join("", rebuildTxt);
        String txt = Arrays.toString(splitTxt).join("", splitTxt);
        if (unSplitTxt.equals(txt)) {
            return true;
        } else {
            return false;
        }
    }

//    method no.4
    static int faktorial(int bil) {
        if (bil == 0) {
            return 1;
        }
        return bil * faktorial(bil - 1);
    }

//    method no.5
    static boolean prima(int bil) {
        boolean flag = false;
        for (int i = 2; i <= bil / 2; ++i) {
            // condition for nonprime number
            if (bil % i == 0) {
                flag = true;
                break;
            }
        }

        return flag;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        /*
        1. Buatlah sebuah method yang menerima dua bilangan bulat sebagai parameter dan mengembalikan bilangan bulat yang merupakan hasil perkalian dua bilangan tersebut. Namun, jika salah satu bilangan tersebut negatif maka method tersebut harus mengembalikan nilai 0.

        System.out.print("bilangan 1: ");
        int bil1 = scan.nextInt();
        System.out.print("bilangan 2: ");
        int bil2 = scan.nextInt();
        System.out.println("hasil = " + perkalianDuaBilangan(bil1, bil2));
        
        2. Buatlah sebuah method yang menerima sebuah string sebagai parameter dan mengembalikan bilangan bulat yang merupakan jumlah karakter dalam string tersebut.
        
        System.out.print("Masukkan kalimat: ");
        String kalimat = scan.nextLine();
        System.out.println("Jumlah karakter dari kalimat tersebut adalah = " + jumlahKaraterDariKalimat(kalimat));
        
        3. Buatlah sebuah method yang menerima sebuah string sebagai parameter dan mengembalikan boolean yang menunjukkan apakah string tersebut merupakan palindrome atau tidak. Sebuah string dikatakan palindrome jika string tersebut dibaca dari depan maupun belakang sama.

        System.out.print("Masukkan kalimat: ");
        String txt = scan.nextLine();
        String[] splitTxt = txt.split("");
        System.out.println(palindrome(splitTxt));
        
        4. Buatlah sebuah method yang menerima sebuah bilangan bulat sebagai parameter dan mengembalikan bilangan bulat yang merupakan faktorial dari bilangan tersebut. Faktorial dari sebuah bilangan bulat adalah hasil perkalian semua bilangan bulat dari 1 hingga bilangan tersebut.
        
        System.out.print("Enter bilangan: ");
        int bil = scan.nextInt();
        System.out.println(bil + "! = " + faktorial(bil));
        
        5. Buatlah sebuah method yang menerima sebuah bilangan bulat sebagai parameter dan mengembalikan boolean yang menunjukkan apakah bilangan tersebut merupakan bilangan prima atau tidak. Sebuah bilangan bulat dikatakan prima jika bilangan tersebut hanya memiliki dua faktor, yaitu 1 dan bilangan tersebut sendiri.
        
        System.out.print("Enter bilangan bulat = ");
        int bil = scan.nextInt();
        if (!prima(bil)) {
            System.out.println(bil + " is a prime number.");
        } else {
            System.out.println(bil + " is not a prime number.");
        }
         */

    }
}
