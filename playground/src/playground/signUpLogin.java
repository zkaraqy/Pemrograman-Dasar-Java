package playground;

import java.util.Scanner;

public class signUpLogin {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        String username = null, password = null, inputUsername, inputPassword;
        do {
            System.out.println("|------------------------------------------|");
            System.out.println("|              W E L C O M E               |");
            System.out.println("|------------------------------------------|");
            System.out.println("|                                          |");
            System.out.println("|        1. Daftar         2. Login        |");
            System.out.println("|                                          |");
            System.out.println("|------------------------------------------|");
            System.out.print("  Pilihan (1/2) = ");
            int choice = scan.nextInt();
            System.out.println("|------------------------------------------|");
            if (choice == 2) {
                if (username == null && password == null) {
                    System.out.println("|           Anda belum mendaftar           |");
                    System.out.println("|------------------------------------------|");
                    System.out.println("");
                } else {
                    System.out.println("|               L O G I N                  |");
                    System.out.println("|------------------------------------------|");
                    System.out.print("  Username : ");
                    inputUsername = scan2.nextLine();
                    System.out.print("  Password : ");
                    inputPassword = scan2.nextLine();
                    System.out.println("|------------------------------------------|");
                    if (inputUsername.equals(username) && inputPassword.equals(password)) {
                        System.out.println("|              LOGIN BERHASIL              |");
                        System.out.println("|------------------------------------------|");
                        System.out.println("");
                        break;
                    } else {
                        System.out.println("|                LOGIN GAGAL               |");
                        System.out.println("|------------------------------------------|");
                        System.out.println("");
                    }
                }
            } else if (choice == 1) {
                System.out.println("|              D A F T A R                 |");
                System.out.println("|------------------------------------------|");
                System.out.print("  Username : ");
                username = scan.nextLine();
                username = scan.nextLine();
                System.out.print("  Password : ");
                password = scan.nextLine();
                System.out.println("|------------------------------------------|");
                System.out.println("");
            }
        } while (true);
    }
}
