package praktikum5;

public class soal3 {

    public static void main(String args[]) {
        for (int i = 1; i <= 15; i++) {
            if ((i % 2 == 0) && (i % 3 == 0)) {
                System.out.println(i + " Kelipatan Dua dan Tiga");
            } else if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i + " Kelipatan Tiga dan Lima");
            } else if ((i % 2 == 0) && (i % 5 == 0)) {
                System.out.println(i + " Kelipatan Dua dan Lima");
            } else if (i % 2 == 0) {
                System.out.println(i + " Kelipatan Dua");
            } else if (i % 3 == 0) {
                System.out.println(i + " Kelipatan Tiga");
            } else if (i % 5 == 0) {
                System.out.println(i + " Kelipatan Lima");
            } else {
                System.out.println(i);
            }
        }
    }
}
