package pkg2311016110005_muhammad.azka.raki_uappemdas;

import java.util.Scanner;

public class AzkaRaki_UAPPEMDAS {

    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        int pilihanLogin, pilihanMenu, jumlahBukuPemrograman = 0, jumlahBukuMTK = 0, jumlahBukuSejarah = 0, totalBukuPinjaman = 0, tambahBuku, nomorBuku, bukuKembalian;
        String username = null, password = null, inputUsername, inputPassword;
        boolean repeat = true;
        final int MaxTotalBukuPerKategori = 1;

        do {
            System.out.println("=== Login untuk menjalankan program ==");
            System.out.println("1. Daftar");
            System.out.println("2. Login");
            System.out.print("Pilihan : ");
            pilihanLogin = input1.nextInt();
            System.out.println("======================================");

            switch (pilihanLogin) {
                case 1:
                    System.out.println("\n============== Daftar ================");
                    System.out.print("Username : ");
                    username = input2.nextLine();
                    System.out.print("Password : ");
                    password = input2.nextLine();
                    System.out.println("======================================");
                    System.out.println("");
                    break;
                case 2:
                    if (username == null && password == null) {
                        System.out.println("\tAnda belum mendaftar");
                        System.out.println("");
                    } else {
                        System.out.println("\n=============== Login ================");
                        System.out.print("Username : ");
                        inputUsername = input2.nextLine();
                        System.out.print("Password : ");
                        inputPassword = input2.nextLine();
                        System.out.println("======================================");
                        if (inputUsername.equals(username) && inputPassword.equals(password)) {
                            repeat = false;
                        } else {
                            System.out.println("Username atau password salah. Silakan\ncoba lagi");
                            System.out.println("");
                        }
                    }
                    break;
                default:
                    System.out.println("");
                    break;
            }
        } while (repeat);

        do {
            menu();
            System.out.print("Pilihan Menu\t : ");
            pilihanMenu = input1.nextInt();

            switch (pilihanMenu) {
                case 1:
                    System.out.print("Jumlah buku\t = ");
                    tambahBuku = input1.nextInt();
                    System.out.println("======================================");
                    if (tambahBuku >= 0) {
                        if (tambahBuku > MaxTotalBukuPerKategori) {
                            System.out.println("Jumlah peminjaman per buku tidak boleh\nlebih dari 1 sekaligus");
                        } else {
                            jumlahBukuPemrograman += tambahBuku;
                            totalBukuPinjaman += tambahBuku;
                        }
                    } else {
                        System.out.println("Jumlah buku yang diinput\ntidak boleh negatif");
                    }
                    break;
                case 2:
                    System.out.print("Jumlah buku\t = ");
                    tambahBuku = input2.nextInt();
                    System.out.println("======================================");
                    if (tambahBuku >= 0) {
                        if (tambahBuku > MaxTotalBukuPerKategori) {
                            System.out.println("Jumlah peminjaman per buku tidak boleh\nlebih dari 1 sekaligus");
                        } else {
                            jumlahBukuMTK += tambahBuku;
                            totalBukuPinjaman += tambahBuku;
                        }
                    } else {
                        System.out.println("Jumlah buku yang diinput tidak boleh negatif");
                    }
                    break;
                case 3:
                    System.out.print("Jumlah buku\t = ");
                    tambahBuku = input1.nextInt();
                    System.out.println("======================================");
                    if (tambahBuku >= 0) {
                        if (tambahBuku > MaxTotalBukuPerKategori) {
                            System.out.println("Jumlah peminjaman per buku tidak boleh\nlebih dari 1 sekaligus");
                        } else {
                            jumlahBukuSejarah += tambahBuku;
                            totalBukuPinjaman += tambahBuku;
                        }
                    } else {
                        System.out.println("Jumlah buku yang diinput tidak boleh negatif");
                    }
                    break;
                case 4:
                    System.out.println("======================================");
                    System.out.println("\tMengambalikkan buku");
                    cetakBukuPinjaman(jumlahBukuPemrograman, jumlahBukuMTK, jumlahBukuSejarah);
                    System.out.print("Nomor buku (1/2/3) : ");
                    nomorBuku = input1.nextInt();
                    System.out.print("Jumlah buku        : ");
                    bukuKembalian = input2.nextInt();
                    if (bukuKembalian >= 0 && bukuKembalian <= totalBukuPinjaman) {
                        switch (nomorBuku) {
                            case 1:
                                if (bukuKembalian <= jumlahBukuPemrograman) {
                                    jumlahBukuPemrograman = ngembalikanBuku(nomorBuku, bukuKembalian, jumlahBukuPemrograman, jumlahBukuMTK, jumlahBukuSejarah);
                                    totalBukuPinjaman -= bukuKembalian;
                                } else {
                                    System.out.println("Buku yang anda kembalikkan lebih banyak\ndari buku yang anda pinjam. Silakan\ncoba lagi");
                                }
                                break;
                            case 2:
                                if (bukuKembalian <= jumlahBukuMTK) {
                                    jumlahBukuMTK = ngembalikanBuku(nomorBuku, bukuKembalian, jumlahBukuPemrograman, jumlahBukuMTK, jumlahBukuSejarah);
                                    totalBukuPinjaman -= bukuKembalian;
                                } else {
                                    System.out.println("Buku yang anda kembalikkan lebih banyak\ndari buku yang anda pinjam. Silakan\ncoba lagi");
                                }
                                break;
                            case 3:
                                if (bukuKembalian <= jumlahBukuSejarah) {
                                    jumlahBukuSejarah = ngembalikanBuku(nomorBuku, bukuKembalian, jumlahBukuPemrograman, jumlahBukuMTK, jumlahBukuSejarah);
                                    totalBukuPinjaman -= bukuKembalian;
                                } else {
                                    System.out.println("Buku yang anda kembalikkan lebih banyak\ndari buku yang anda pinjam. Silakan\ncoba lagi");
                                }
                                break;
                            default:
                                break;
                        }
                    } else if (bukuKembalian < 0) {
                        System.out.println("Jumlah buku yang diinput tidak boleh negatif");
                    } else {
                        System.out.println("Buku yang anda kembalikan melebihi buku\nyang anda pinjam. Silakan coba lagi");
                    }
                    System.out.println("======================================");
                    break;
                default:
                    System.out.println("======================================");
                    break;
            }
            if (totalBukuPinjaman > 0) {
                cetakBukuPinjaman(jumlahBukuPemrograman, jumlahBukuMTK, jumlahBukuSejarah);
            }
            System.out.println("Total buku       = " + totalBukuPinjaman);

        } while (pilihanMenu != 5);
        System.out.println("======================================");
        if (totalBukuPinjaman > 0) {
            System.out.println("Tolong kembalikan bukunya di kunjungan\nberikutnya ya");
        }
        System.out.println("Terimakasih telah ke perpustakaan");
    }

    static void menu() {
        System.out.println("");
        System.out.println("");
        System.out.println("======================================");
        System.out.println(" Program Peminjaman Buku Perpustakaan ");
        System.out.println("======================================");
        System.out.println("1. Pinjam buku pemrograman");
        System.out.println("2. Pinjam buku matematika");
        System.out.println("3. Pinjam buku sejarah");
        System.out.println("4. Mengembalikan buku");
        System.out.println("5. Keluar");
        System.out.println("======================================");
    }

    static void cetakBukuPinjaman(int jumlahBukuPemrograman, int jumlahBukuMTK, int jumlahBukuSejarah) {
        System.out.println("     List buku yang anda pinjam :     ");
        if (jumlahBukuPemrograman > 0) {
            System.out.println("1. Buku pemrograman = " + jumlahBukuPemrograman + "x");
        }
        if (jumlahBukuMTK > 0) {
            System.out.println("2. Buku Matematika  = " + jumlahBukuMTK + "x");
        }
        if (jumlahBukuSejarah > 0) {
            System.out.println("3. Buku Sejarah     = " + jumlahBukuSejarah + "x");
        }
        System.out.println("======================================");
    }

    static int ngembalikanBuku(int no, int buku, int jumlahBukuPemrograman, int jumlahBukuMTK, int jumlahBukuSejarah) {
        switch (no) {
            case 1:
                return jumlahBukuPemrograman -= buku;
            case 2:
                return jumlahBukuMTK -= buku;
            case 3:
                return jumlahBukuSejarah -= buku;
            default:
                return 0;
        }
    }
}