
// File playground yang ini sebagai coba coba

import java.util.Arrays;

public class Playground {

    static void printHelloWorld() {
        System.out.println("Hello World");
    }

    static void printNameAndAge(String name, int age) {
//        for (int i = 0; i < 10; i++) {
        System.out.println("name : " + name + "\nage : " + age);
//        }
    }

    static String returnStringValue(String fname) {
        String lname = " Raki";
        return fname + lname;
    }

    static int returnIntvalue(int x, int y) {
        return x + y;
    }

    static void oddOrEven(int x) {
        if (x % 2 == 0) {
            System.out.println("The number that you submit is an Odd number.");
        } else {
            System.out.println("The number that you submit is an Even number.");
        }
    }

    static int sum(int k) {
        if (k > 0) {
            return k + sum(k-1);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
//
//          BASIC         
//        
//        String nama = "Muhammad Azka Raki";
//        int umur = 18;
//        System.out.println("Hello World\n");
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Nama : " + nama + " " + i + "\nUmur : " + umur + "\n");
//        }
//
//        String name = "Azka", hobby = "Playing chess";
//        int age = 18, idCard = 97654;
//        System.out.println("name : " + name + "\nhobby : " + hobby + "\nage : " + age + "\nID Card : " + idCard);
//
//        final String txt = "Hello World";
//        String symStart = "";
//        for (int i = 0; i < 10; i++) {
//            symStart += "* ";
//            System.out.println(symStart);
//        }
//
//        double x = 7.99;
//        int y = (int) x;
//        System.out.println(y);
//        int x = 5;
//        System.out.println(x > 3*9);
//        String txt = "Muhammad Azka Raki";
//        System.out.println(txt.toLowerCase());
//        System.out.println(txt.toUpperCase());
//        System.out.println(txt.length());
//        txt = "Muhammad Azka Raki Azka";
//        System.out.println(txt.indexOf("Azka"));
//        txt = txt.concat(" Raki");
//        System.out.println(txt);
//        int x = 5;
//        String y = "5";
//        var z = x + y;
//        System.out.println(z);
//        String txt = "Muhammad \tAzka";
//        System.out.println(txt);
//
//        var chance = Math.random();
//        int randomNum = (int) (Math.random() * 11); // random number between 0 and 10.
//        System.out.println(Math.max(-99, 99));
//        System.out.println(Math.min(-99, 99));
//        System.out.println(Math.sqrt(81));
//        System.out.println(Math.abs(-99.9));
//        System.out.println(Math.floor(chance*10));
//        System.out.println(randomNum);
//
//        String username_1 = "Muhammad Azka Raki";
//        username_1 = username_1.toLowerCase();
//        username_1 = "Muhammad Hussien Razzak";
//        if (username_1 == "Muhammad Azka Raki") {
//            System.out.println("Access Granted!");
//        } else if (username_1 == "Muhammad Hussien Razzak") {
//            System.out.println("Access Blocked!");
//        } else {
//            System.out.println("Access Denied!");
//        }
//        
//        int points = 100;
//            points = 60;
//        String message = (points >= 75) ? "Congrats!" : "Try Again!";
//        System.out.println(message);
//
//        int dayInNumber = 9;
//        switch (dayInNumber) {
//            case 1:
//                System.out.println("Senin");
//                break;
//            case 2:
//                System.out.println("Selasa");
//                break;
//            case 3:
//                System.out.println("Rabu");
//                break;
//            case 4:
//                System.out.println("Kamis");
//                break;
//            case 5:
//                System.out.println("Jumat");
//                break;
//            case 6:
//                System.out.println("Sabtu");
//                break;
//            case 7:
//                System.out.println("Minggu");
//                break;
//            default:
//                System.out.println("Day " + dayInNumber + " doesn\'t exist in one week.");
//        }
//
//        int i = 10;
//        while (i > 0) {            
//            System.out.println("=> "+i);
//            i--;
//        }
//        
//        do {
//            System.out.println("=> " + i);
//            i--;
//        } while (i > 0);
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Output => " + (i + 1));
//            for (int j = 0; j < 3; j++) {
//                System.out.println(" <> Output from nested for loop : " + (j + 1));
//            }
//            System.out.println("\n");
//        }
//
//        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//        for (String i : cars) {
//            System.out.println(i);
//        }
//
//        for (int i = 0; i < 10; i++) {
//            if (i == 3) {
//                break;
//            }
//            System.out.println("=>" + i);
//        }
//
//        for (int i = 0; i < 10; i++) {
//            if (i == 6) {
//                continue;
//            }
//            System.out.println(i);
//        }
//
        String[] HandphoneBrands = {"Realme", "Xiaomi", "Apple", "Samsung"};
        int[][] twoDimensionalArr = {{1, 2, 3}, {4, 5, 6, 7}};
        //        System.out.println(HandphoneBrands[0] + " " + HandphoneBrands[3]);
        //        System.out.println(HandphoneBrands.length);
        //        for (int i = 0; i < HandphoneBrands.length; i++) {
        //            System.out.println((i + 1) + ". " + HandphoneBrands[i]);
        //        }
        //        for (String i : HandphoneBrands) {
        //            System.out.println(i);
        //        }
        //        System.out.println(twoDimensionalArr[0][1] + twoDimensionalArr[1][3]);
        //        twoDimensionalArr[0][2] = 8;
        //        System.out.println(twoDimensionalArr[0][2]);
        //        for (int i = 0; i < twoDimensionalArr.length; i++) {
        //            System.out.println(Arrays.toString(twoDimensionalArr[i]));
        //            for (int j = 0; j < twoDimensionalArr[i].length; j++) {
        //                System.out.println(twoDimensionalArr[i][j]);
        //            }
        //        }
        //
        //        Method
        //
        //        printHelloWorld();
        //        printNameAndAge("Muhammad Azka Raki", 18);
        //        System.out.println(returnStringValue("Azka"));
        //        System.out.println(returnIntvalue(9, 8));
        //        oddOrEven(98);

        //{
        //    int x = 99;
        //    System.out.println(x);
        //}
        //
//        int result = sum(10);
//        System.out.println(result);
//        
//        int sum2 = 0;
//        for (int i = 1; i <= 10; i++) {
//            sum2 += i;
//        }
//        System.out.println(sum2);
//
//        int sum = 0;
//        for (int i = 5; i <= 10; i++) {
//            sum += i;
//        }
//        System.out.println(sum);

        System.out.println(sum(10));
    }
}
