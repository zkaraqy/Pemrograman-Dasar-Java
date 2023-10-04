package pertemuan.keenam;

import java.util.Scanner;

public class MuhammadAzkaRaki_2311016110005 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama1, nama2, nama3, NIM1, NIM2, NIM3, status1, status2, status3;
        double nilai1_mhs1, nilai2_mhs1, nilai1_mhs2, nilai2_mhs2, nilai1_mhs3, nilai2_mhs3, rata_rata1, rata_rata2, rata_rata3;

        System.out.println("=======================");
        System.out.println("Input Nilai");
        System.out.println("=======================");
        System.out.print("Nama   : ");
        nama1 = input.nextLine();
        System.out.print("NIM    : ");
        NIM1 = input.nextLine();
        System.out.print("Nilai 1: ");
        nilai1_mhs1 = input.nextDouble();
        System.out.print("Nilai 2: ");
        nilai2_mhs1 = input.nextDouble();
        System.out.println("=======================");
        System.out.println("Input Nilai");
        System.out.println("=======================");
        System.out.print("Nama   : ");
        nama2 = input.nextLine();
        nama2 = input.nextLine();
        System.out.print("NIM    : ");
        NIM2 = input.nextLine();
        System.out.print("Nilai 1: ");
        nilai1_mhs2 = input.nextDouble();
        System.out.print("Nilai 2: ");
        nilai2_mhs2 = input.nextDouble();
        System.out.println("=======================");
        System.out.println("Input Nilai");
        System.out.println("=======================");
        System.out.print("Nama   : ");
        nama3 = input.nextLine();
        nama3 = input.nextLine();
        System.out.print("NIM    : ");
        NIM3 = input.nextLine();
        System.out.print("Nilai 1: ");
        nilai1_mhs3 = input.nextDouble();
        System.out.print("Nilai 2: ");
        nilai2_mhs3 = input.nextDouble();
        System.out.println("=======================");

        rata_rata1 = (nilai1_mhs1 + nilai2_mhs1) / 2;
        rata_rata2 = (nilai1_mhs2 + nilai2_mhs2) / 2;
        rata_rata3 = (nilai1_mhs3 + nilai2_mhs3) / 2;
        status1 = (rata_rata1 > 50) ? "LULUS" : "TIDAK LULUS";
        status2 = (rata_rata2 > 50) ? "LULUS" : "TIDAK LULUS";
        status3 = (rata_rata3 > 50) ? "LULUS" : "TIDAK LULUS";

        System.out.println("");
        System.out.println("========================================================================");
        System.out.println("Nama" + "\t" + "NIM" + "\t" + "Nilai 1" + "\t" + "Nilai 2" + "\t" + "Rata-rata" + "\t" + "Status");
        System.out.println("========================================================================");
        System.out.println(nama1 + "\t" + NIM1 + "\t" + (int) nilai1_mhs1 + "\t" + (int) nilai2_mhs1 + "\t" + rata_rata1 + "\t\t" + status1);
        System.out.println(nama2 + "\t" + NIM2 + "\t" + (int) nilai1_mhs2 + "\t" + (int) nilai2_mhs2 + "\t" + rata_rata2 + "\t\t" + status2);
        System.out.println(nama3 + "\t" + NIM3 + "\t" + (int) nilai1_mhs3 + "\t" + (int) nilai2_mhs3 + "\t" + rata_rata3 + "\t\t" + status3);
        System.out.println("========================================================================");

    }

}
