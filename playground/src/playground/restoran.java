package playground;

import java.util.Scanner;

/*
    Program restoran/warung
    Meminta username dan password terlebih dahulu.
    Jika salah menginput sebanyak 3 kali, maka akan diblokir
    Setiap kali salah akan menampilkan pesan sisa kesempatan
    Jika berhasil login, maka menampilkan menu.
    Meminta pilihan makanan user.
    Meminta jumlah makanan pilihan user.
    Meminta pilihan minuman user.
    Meminta jumlah minuman pilihan user.
    Jika jumlah tagihan user >= 100.000, maka akan ada diskon 5% disetiap kelipatan.
    Menampilkan harga-harga makanan dan minuman user beserta banyaknya, diskon dan total tagihan.
    program akan berhenti jika user memilih keluar.
 */
public class restoran {

    static int tagihanMakanan(int pilihanMakanan, int jumlahMakanan) {
        switch (pilihanMakanan) {
            case 1:
                return 16000 * jumlahMakanan;
            case 2:
            case 3:
                return 18000 * jumlahMakanan;
            case 4:
                return 15000 * jumlahMakanan;
            default:
                return 0;
        }
    }

    static int tagihanMinuman(int pilihanMinuman, int jumlahMinuman) {
        switch (pilihanMinuman) {
            case 1:
                return 3000 * jumlahMinuman;
            case 2:
            case 3:
                return 5000 * jumlahMinuman;
            default:
                return 0;
        }
    }

    static double totalDiskon(double diskon, int tagihanMakanan, int tagihanMinuman) {
        if (tagihanMakanan + tagihanMinuman >= 100000) {
            return diskon * Math.floor((tagihanMakanan + tagihanMinuman) / (100000));
        } else {
            return 0;
        }
    }

    static void menu() {
        System.out.println("\tMenu Makanan: ");
        System.out.println("1. Nasi Bumbu Ayam  Rp.16,000");
        System.out.println("2. Nasi Bumbu Bebek Rp.18,000");
        System.out.println("3. Spagetti         Rp.18,000");
        System.out.println("4. Soup Ayam        Rp.15,000");
        System.out.println("\n\tMenu Minuman: ");
        System.out.println("1. Teh Es           Rp.3,000");
        System.out.println("2, Susu             Rp.5,000");
        System.out.println("3. Jus Mangga       Rp.5,000");
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int chance = 3, percobaan = 0, pilihanMakanan, jumlahMakanan, pilihanMinuman, jumlahMinuman, tagihanMakanan, tagihanMinuman;
        double diskon = 0.05;
        String inputUsername, inputPasssword;

        do {
            System.out.println("=========================================");
            System.out.println("     Login Untuk Menggunakan Program     ");
            System.out.println("=========================================");
            System.out.print("Username\t: ");
            inputUsername = input.nextLine();
            System.out.print("Password\t: ");
            inputPasssword = input.nextLine();
            if (inputUsername.equals("Muhammad Azka Raki") && inputPasssword.equals("2311016110005")) {
                System.out.println("=========================================");
                System.out.println("      Selamat Datang di Restoran Zka     ");
                System.out.println("=========================================");
                menu();
                System.out.println("=========================================");
                System.out.print("Nomor pilihan makanan: ");
                pilihanMakanan = input.nextInt();
                System.out.print("Jumlah makanan       : ");
                jumlahMakanan = input.nextInt();
                System.out.print("Nomor pilihan minuman: ");
                pilihanMinuman = input.nextInt();
                System.out.print("Jumlah minuman       : ");
                jumlahMinuman = input.nextInt();
                System.out.println("=========================================");

                tagihanMakanan = tagihanMakanan(pilihanMakanan, jumlahMakanan);
                tagihanMinuman = tagihanMinuman(pilihanMinuman, jumlahMinuman);

                switch (pilihanMakanan) {
                    case 1:
                        System.out.println("Nasi Bumbu Ayam  x" + jumlahMakanan + "\t| Rp." + tagihanMakanan);
                        break;
                    case 2:
                        System.out.println("Nasi Bumbu Bebek x" + jumlahMakanan + "\t| Rp." + tagihanMakanan);
                        break;
                    case 3:
                        System.out.println("Spagetti         x" + jumlahMakanan + "\t| Rp." + tagihanMakanan);
                        break;
                    case 4:
                        System.out.println("Soup Ayam        x" + jumlahMakanan + " \t| Rp." + tagihanMakanan);
                        break;
                    default:
                        System.out.println("Pilihan menu makanan Invalid");
                }

                switch (pilihanMinuman) {
                    case 1:
                        System.out.println("Teh Es           x" + jumlahMinuman + "\t| Rp." + tagihanMinuman);
                        break;
                    case 2:
                        System.out.println("Susu             x" + jumlahMinuman + "\t| Rp." + tagihanMinuman);
                        break;
                    case 3:
                        System.out.println("Jus Mangga       x" + jumlahMinuman + "\t| Rp." + tagihanMinuman);
                        break;
                    default:
                        System.out.println("Pilihan menu minuman Invalid");
                }

                System.out.println("Diskon            \t| " + totalDiskon(diskon, tagihanMakanan, tagihanMinuman));
                System.out.println("Total Tagihan     \t= Rp." + ((tagihanMakanan + tagihanMinuman) - (tagihanMakanan + tagihanMinuman) * totalDiskon(diskon, tagihanMakanan, tagihanMinuman)));
                System.out.println("=========================================");
                System.out.println("   Terima Kasih Telah Berkunjung   ");
                break;
            } else {
                percobaan++;
                chance--;
                System.out.println("Username atau Password salah.\nUsaha login " + percobaan + "x. Tesisa " + chance + "x");
                if (chance == 0) {
                    System.out.println("Upaya anda login diblokir.");
                }
                System.out.println("=========================================");
            }
            System.out.println("");
        } while (chance > 0);

    }
}
