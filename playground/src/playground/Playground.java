package playground;

import java.util.Scanner;

public class Playground {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        /*
//        menerima input kemudian disimpan dalam variable
        System.out.print("Nama : ");
        String nama = scan.nextLine();
        System.out.print("NIM  : ");
        String nim = scan.nextLine();
        System.out.println("Hello " + nama + " (" + nim + ")");
         */
 /*
    String nama, nim;
    
        System.out.print("Nama : ");
        nama = scan.nextLine();
        System.out.print("NIM  : ");
        nim = scan.nextLine();
        
        System.out.println("Hello " + nama + " (" + nim + ")");
         */
 /*
        int bilangan1, bilangan2, hasil;
 
        System.out.println("Penjumlahan");
        System.out.println("");
        
        System.out.print("Bilangan 1: ");
        bilangan1 = scan.nextInt();
        
        System.out.print("Bilangan 2: ");
        bilangan2 = scan.nextInt();

        hasil = bilangan1 + bilangan2;
        System.out.println("Hasil: " + hasil);
         */
 /*
        double bilangan1, bilangan2, hasil;
 
//        System.out.println("Penjumlahan");
        System.out.println("");
        
        System.out.print("Bilangan 1: ");
        bilangan1 = scan.nextDouble();
        
        System.out.print("Bilangan 2: ");
        bilangan2 = scan.nextDouble();

        hasil = bilangan1 / bilangan2;
        System.out.println("Hasil: " + hasil); 
         */
 /*
        String username, password, status;
        status = "Login Gagal";

        System.out.print("Username : ");
        username = scan.nextLine();
        System.out.print("Password : ");
        password = scan.nextLine();
        System.out.println("");

        if (username.equals("root") && password.equals("rahasia")) {
            System.out.println("Login Berhasil");
        } else {
            System.out.println("Login Gagal");
        }
//        if (username.equals("root") && password.equals("rahasia")) {
//            status = "Login Berhasil";
//        }
//        System.out.println(status);
         */
 /*
        System.out.print("masukkan nilai : ");
        char index = 'Z';
        int nilai = scan.nextInt();

//         if (nilai >= 60 && nilai <= 100) {
//             System.out.println("LULUS");
//        } else if (nilai >= 0 && nilai < 60) {
//             System.out.println("TIDAK LULUS");
//        } else {
//             System.out.println("Nilai salah");
//        }
        if (nilai >= 80 && nilai <= 100) {
            index = 'A';
//            System.out.println("A");
//            System.out.println("LULUS");
        } else if (nilai >= 60 && nilai < 80) {
            index = 'B';
//            System.out.println("B");
//            System.out.println("LULUS");
        } else if (nilai >= 50 && nilai < 60) {
            index = 'C';
//            System.out.println("C");
//            System.out.println("LULUS");
        } else if (nilai >= 40 && nilai < 50) {
            index = 'D';
//            System.out.println("D");
//            System.out.println("TIDAK LULUS");
        } else if (nilai >= 0 && nilai < 40) {
            index = 'E';
//            System.out.println("E");
//            System.out.println("TIDAK LULUS");
        }
        
        if (index == 'A' || index == 'B' || index == 'C') {
            System.out.println(index);
            System.out.println("LULUS");
        } else {
            System.out.println(index);
            System.out.println("TIDAK LULUS");
        }
         */
//        int angka;
//        System.out.print("masukkan angka : ");
//        angka = scan.nextInt();
        /*
        if (angka == 1) {
            System.out.println("SENIN");
        } else if (angka == 2) {
            System.out.println("SELASA");
        } else if (angka == 3) {
            System.out.println("RABU");
        } else if (angka == 4) {
            System.out.println("KAMIS");
        } else if (angka == 5) {
            System.out.println("JUMAT");
        } else if (angka == 6) {
            System.out.println("SABTU");
        } else if (angka == 7) {
            System.out.println("MINGGU");
        }
         */
 /*
        switch (angka) { // kondisi nya tidak bisa pakai rentang
            case 1: // string juga bisa
                System.out.println("SENIN");
                break;
            case 2:
                System.out.println("SELASA");
                break;
            case 3:
                System.out.println("RABU");
                break;
            case 4:
                System.out.println("KAMIS");
                break;
            case 5:
                System.out.println("JUMAT");
                break;
            case 6:
                System.out.println("SABTU");
                break;
            case 7:
                System.out.println("MINGGU");
                break;
            default:
                break;
        }
         */
//        int bil;
//        System.out.print("Masukkan bilangan : ");
//        bil = scan.nextInt();
//        if (bil % 2 == 0) {
//            System.out.println(bil + " merupakan bilangan GENAP");
//        } else {
//            System.out.println(bil + " merupakan bilangan GANJIL");
//        }
//
//        int x = 100;
//        System.out.println(x);
//        x++;
//        ++x;
//        x--;
//        --x;
//        System.out.println(x);
//
//        int x = Integer.sum(9, 10);
//        int x = Integer.compare(10, 7);
//        int x = Integer.max(0, 90);
//        int x = Integer.min(0, 90);
//        int x = Integer.divideUnsigned(6, 9);
//        int x = Integer.parseInt("857");
//        int x = I;
//        System.out.println(x);
//        
//        String text = String.join(" ", "Muhammad", "Azka", "Raki");
//        System.out.println(text);

//        double y = Double.parseDouble("345.87");
//        System.out.println(y);
//        int z = Math.abs(-9);
//        double z = Math.toDegrees(1);
//        double z = Math.floor(1.9);
//        double z = Math.round(1.5);
//        double z = Math.sin(90);
//        double z = Math.sqrt(17);
//        System.out.println(z);
//        System.out.print("Masukan angka = ");
//        int x = scan.nextInt();
//        for (int i = 1; i <= x; i++) {
//            apakahPrima(i);
//        }

        System.out.println(Math.cbrt(8));
        System.out.println(Math.pow(16, 0.5));
    }

    static void apakahPrima(int bilangan) {
        if (bilangan == 2 || bilangan == 3 || bilangan == 5 || bilangan == 7) {
            System.out.println(bilangan + " adalah bilangan prima");
        } else if (bilangan % 2 == 0 || bilangan % 3 == 0 || bilangan % 5 == 0 || bilangan % 7 == 0 || bilangan == 1) {
            System.out.println(bilangan + " bukan bilangan prima");
        } else {
            System.out.println(bilangan + " adalah bilangan prima");
        }
    }
}
