package praktikum6;

import java.util.Scanner;

public class soal1 {

    public static void main(String args[]) {
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        String daftarNama = null, daftarNim = null, loginNama, loginNim;
        int pilihanMenu, kesempatanLogin = 3, percobaanLogin = 0;
        do {
            System.out.println("\tMenu : ");
            System.out.println("1. Daftar");
            System.out.println("2. Login");
            System.out.print("Nomor pilihan (1/2)\t: ");
            pilihanMenu = input1.nextInt();

            if (pilihanMenu == 1) {
                System.out.println("\n\tDaftar");
                System.out.print("nama\t: ");
                daftarNama = input2.nextLine();
                System.out.print("nim\t: ");
                daftarNim = input2.nextLine();
                System.out.println("");
            } else if (pilihanMenu == 2) {
                if (daftarNama != null && daftarNim != null) {
                    System.out.println("\n\tLogin");
                    System.out.print("nama\t: ");
                    loginNama = input2.nextLine();
                    System.out.print("nim\t: ");
                    loginNim = input2.nextLine();

                    if (loginNama.equals(daftarNama) && loginNim.equals(daftarNim)) {
                        System.out.println(daftarNama + " dengan NIM." + daftarNim + " login berhasil");
                        break;
                    } else {
                        kesempatanLogin--;
                        percobaanLogin++;

                        if (percobaanLogin == 3) {
                            System.out.println("Anda salah " + percobaanLogin + "x akun anda diblokir\n");
                            percobaanLogin = 0;
                        } else {
                            System.out.println("Anda salah " + percobaanLogin + "x silahkan ulangi, kesempatan login " + kesempatanLogin + "x lagi\n");
                        }
                    }
                } else {
                    System.out.println("Anda belum mendaftar\n");
                }
            }
        } while (kesempatanLogin != 0);
    }
}
