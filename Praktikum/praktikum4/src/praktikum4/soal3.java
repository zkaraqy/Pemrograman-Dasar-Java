package praktikum4;

import java.util.Scanner;

public class soal3 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String bulan, jumlahHariPerBulan;
        System.out.println("Jumlah hari dalam satu bulan pada kalender Hijriyah");
        System.out.println("===================================================");
        System.out.print("Nama bulan : ");
        bulan = input.nextLine();

        switch (bulan) {
            case "muharram":
            case "rabiul awal":
            case "jumadil awal":
            case "rajab":
            case "zulkaidah":
                System.out.println("Jumlah hari pada bulan " + bulan + " adalah 29 hari");
                break;
            case "safar":
            case "rabiul akhir":
            case "jumadil akhir":
            case "syaban":
            case "ramadan":
            case "syawal":
                System.out.println("Jumlah hari pada bulan " + bulan + " adalah 30 hari");
                break;
            case "zulhijjah":
                System.out.println("Jumlah hari pada bulan " + bulan + " adalah 29/30 hari");
                break;
            default:
                System.out.println("Inputan tidak sesuai");
        }

    }
}
