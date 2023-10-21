package playground;

import java.util.Scanner;

public class soalWhileDanDoWhileLoopDariChatGPT {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        /*
        1. While Loop - Menampilkan Bilangan Ganjil: 
        Buatlah program Java yang menggunakan while loop untuk menampilkan semua bilangan ganjil dari 1 hingga N, di mana N adalah masukan pengguna.
        
        System.out.print("Enter jumlah bilangan : ");
        int n = input.nextInt(), i = 1;
        while (i <= n) {            
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
        
        2. Do-While Loop - Tebak Angka: 
        Buatlah program Java yang meminta pengguna untuk menebak angka antara 1 dan 100. Program harus memberikan petunjuk apakah angka yang ditebak terlalu besar atau terlalu kecil, dan terus mengulang hingga pengguna menebak angka dengan benar. Gunakan do-while loop.
        
        System.out.println("Permainan Tebak Angka 1-100");
        int randomNum = (int) Math.round(Math.random() * 100);
//        System.out.println(randomNum);
        boolean benar = true;
        do {
            System.out.print("Tebakan anda : ");
            int tebakan = input.nextInt();
            if (tebakan < randomNum) {
                System.out.println("Tebakan terlalu kecil\n");
            } else if (tebakan > randomNum) {
                System.out.println("Tebakan terlalu besar\n");
            } else {
                System.out.println("Tebakan anda benar!");
                benar = false;
            }
        } while (benar == true);
        
        3. While Loop - Faktorial Angka:
        Buatlah program Java yang menghitung faktorial dari angka yang dimasukkan oleh pengguna. Gunakan while loop untuk menghitung faktorial dari angka tersebut.
        
        System.out.println("Menghitung faktorial dari input user");
        System.out.print("Enter angka : ");
        int n = input.nextInt(), sum = 1, faktorial = n;
        while (n > 0) {
            sum *= n;
            n--;
        }
        System.out.println("Faktorial dari " + faktorial + "! adalah " + sum);
        
        4. Do-While Loop - Validasi Input:
        Buat program Java yang meminta pengguna untuk memasukkan kata sandi. Program harus terus meminta input hingga pengguna memasukkan kata sandi yang benar. Gunakan do-while loop untuk melakukan validasi.

        System.out.println("\tLogin");
        boolean repeat = true;
        do {
            System.out.print("Username : ");
            String username = input.nextLine();
            System.out.print("Password : ");
            String password = input.nextLine();
            if (username.equals("azkaraqy") && password.equals("@azkaraqy")) {
                System.out.println("Access Granted");
                repeat = false;
            } else {
                System.out.println("Access Denied. Try Again");
            }
        } while (repeat);
        
        5. While Loop - Deret Fibonacci:
        Buat program Java yang mencetak deret Fibonacci hingga N bilangan pertama. Deret Fibonacci dimulai dengan 0 dan 1, dan setiap angka berikutnya adalah penjumlahan dari dua angka sebelumnya. Gunakan while loop.
        
        int i, n, f_n, f_n_1, f_n_2;

        System.out.print("mengambil nilai fibinocci ke - : ");
        n = input.nextInt();

        i = 1;
        f_n_2 = 0;
        f_n_1 = 1;
        f_n = 1;

        while (i <= n) {
            System.out.println("nilai ke-" + i + " = " + f_n);
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;
            i++;
        }
        
        6. Do-While Loop - Menu Pilihan: 
        Buat program Java yang menampilkan sebuah menu pilihan kepada pengguna (misalnya: pilihan untuk menghitung luas segitiga, persegi panjang, atau keluar). Program harus terus menampilkan menu ini dan meng-handle pilihan pengguna menggunakan do-while loop.

        boolean repeat = true;
        do {
            System.out.println("\tMenu");
            System.out.println("1. Menghitung luas segitiga");
            System.out.println("2. Menghitung luas persegi panjang");
            System.out.println("3. Keluar");
            System.out.print("Nomor pilihan (1/2/3) : ");
            String pilihan = input.nextLine();
            if (pilihan.equals("1") || pilihan.equals("2") || pilihan.equals("3")) {
                repeat = false;
            } else {
                System.out.println("Input Invalid. Try Again\n");
            }
        } while (repeat);
         */

    }
}
