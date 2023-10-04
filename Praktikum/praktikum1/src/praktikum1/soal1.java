package praktikum1;

import java.util.Scanner;

public class soal1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, NIM, program_studi;

        System.out.print("Nama lengkap : ");
        nama = input.nextLine();
        System.out.print("NIM : ");
        NIM = input.nextLine();
        System.out.print("Program Studi : ");
        program_studi = input.nextLine();

        System.out.println("Selamat datang, " + nama + " dengan NIM " + NIM + " dari program studi " + program_studi);
    }

}
