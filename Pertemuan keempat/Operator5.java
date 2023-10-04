
public class Operator5 {

    public static void main(String args[]) {
//        System.out.println(90 > 77);//=> true
//        System.out.println(90 >= 77);//=> true
//        System.out.println(90 < 77);//=> false
//        System.out.println(90 <= 77);//=> false
//        System.out.println(90 == 77);//=> false
//        System.out.println(90 != 77);//=> true
//        System.out.println(90 <> 77); //=> Errors
//        System.out.println(5 > 5);  //=> false
//        System.out.println(5 < 5);  //=> false

        boolean status1, status2;
        status1 = 5 > 1; // true
        status2 = 5 != 5; // false

        System.out.println(status1 || status2);
        System.out.println(status1 && status2);
//        System.out.println(!status1);
//        System.out.println(!status2);

    }
}
