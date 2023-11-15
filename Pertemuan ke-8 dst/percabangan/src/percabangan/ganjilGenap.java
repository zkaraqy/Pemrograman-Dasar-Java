package percabangan;

import java.util.Scanner;

public class ganjilGenap {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan  = ");
        int bil = input.nextInt();
        String jenisBilangan= "";

        switch (bil % 2) {
            case 0:
                jenisBilangan = "genap";

                break;
            case 1:
                jenisBilangan = "ganjil";
                break;
        }
        System.out.println(bil + " adalah bilangan " + jenisBilangan);
    }
}
