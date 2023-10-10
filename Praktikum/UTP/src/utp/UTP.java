package utp;

import java.util.Scanner;

public class UTP {

    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        String username, password;

        System.out.println("\tLogin");
        System.out.print("Username : ");
        username = input1.nextLine();
        System.out.print("Password : ");
        password = input2.nextLine();
        if (username.equals("muhammad azka raki") && password.equals("2311016110005")) {
            System.out.println("== Menu Warung Bakso Bang Azka ==");
            System.out.println("=================================");
        } else {
        }

    }

}
