package perulangan;

public class PerulanganGenap {

    public static void main(String args[]) {

//        for (int i = 2; i <= 20; i += 2) {
//            System.out.println(i);
//        }
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("");

        int i = 2;
        while (i <= 20) {
            System.out.println(i);
            i += 2;
        }
    }
}
