package pkg2311016110005_muhammad.azka.raki_utpemdas;

import java.util.Scanner;

public class AzkaRaki_UTPEMDAS {

    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        String username, password, pilihanMakanan, pilihanMinuman;
        float totalTagihan = 0, diskonYangDidapat;
        final float diskon = 0.1f;

        System.out.println("               Login               ");
        System.out.print("Username : ");
        username = input1.nextLine();
        System.out.print("Password : ");
        password = input2.nextLine();
        if (username.equals("muhammad azka raki") && password.equals("2311016110005")) {
            System.out.println("");
            System.out.println("|== Menu Warung Bakso Bang Azka ==|");
            System.out.println("|=================================|");
            System.out.println("|Makanan :                        |");
            System.out.println("|1. Bakso Urat            Rp12.000|");
            System.out.println("|2. Bakso Telor           Rp13.000|");
            System.out.println("|3. Mie Ayam              Rp10.000|");
            System.out.println("|                                 |");
            System.out.println("|Minuman :                        |");
            System.out.println("|1. Teh Es                 Rp3.000|");
            System.out.println("|2. Jus Alpukat            Rp5.000|");
            System.out.println("|=================================|");
            System.out.print(" Nomor pilihan makanan: ");
            pilihanMakanan = input1.nextLine();
            System.out.print(" Nomor pilihan minuman: ");
            pilihanMinuman = input2.nextLine();
            System.out.println("|=================================|");

            switch (pilihanMakanan) {
                case "1":
                    totalTagihan = 12000;
                    switch (pilihanMinuman) {
                        case "1":
                            totalTagihan += 3000;
                            break;
                        case "2":
                            totalTagihan += 5000;
                            break;
                        default:

                    }
                    break;
                case "2":
                    totalTagihan = 13000;
                    switch (pilihanMinuman) {
                        case "1":
                            totalTagihan += 3000;
                            break;
                        case "2":
                            totalTagihan += 5000;
                            break;
                        default:

                    }
                    break;
                case "3":
                    totalTagihan = 10000;
                    switch (pilihanMinuman) {
                        case "1":
                            totalTagihan += 3000;
                            break;
                        case "2":
                            totalTagihan += 5000;
                            break;
                        default:

                    }
                    break;

                default:

            }
            diskonYangDidapat = (totalTagihan > 15000) ? totalTagihan * diskon : 0;
            System.out.println("Diskon        : Rp" + diskonYangDidapat);
            
            totalTagihan = (totalTagihan > 15000) ? totalTagihan - (totalTagihan * diskon) : totalTagihan;
            System.out.println("Total tagihan : Rp" + totalTagihan);

        } else {
            System.out.println("Username atau Password SALAH");
        }
    }

}
