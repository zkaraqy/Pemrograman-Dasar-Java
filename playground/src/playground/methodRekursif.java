package playground;

import java.util.Scanner;

public class methodRekursif {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Angka : ");
        int n = sc.nextInt();
        cetakN(n);
        System.out.println("Jumlah angka " + n + " sampai 1 adalah " + jumlahN(n));
    }

    public static int cetakN(int i) {
        if (i == 0) {
            return 0;
        }
        System.out.println(i);
        return cetakN(i - 1);
    }

    public static int jumlahN(int i) {
        if (i == 1) {
            return 1;
        }
        return i + jumlahN(i - 1);
    }
}
