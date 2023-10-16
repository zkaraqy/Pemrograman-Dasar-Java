package playground;

public class pptPengulanganPaReza {

    public static void main(String args[]) {
//         boolean repeat = true;
//         int num = 100;
//         while (num >= 95) {            
//             System.out.println(num);
//             num--;
//        }
//
        int num = 1;
//        while (num <= 3) {
//            while (num <= 3) {
//                System.out.print(num);
//            }
//            System.out.print("\n");
//            num++;
//         }
        for (int i = 1; i <= 3; i++) {
            for (int j = i; j-i < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
}
