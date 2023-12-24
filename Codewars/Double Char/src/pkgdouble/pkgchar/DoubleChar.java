package pkgdouble.pkgchar;

import java.util.Arrays;

public class DoubleChar {

    public static void main(String[] args) {
//        System.out.println(doubleChar("String"));
        doubleChar("String");
    }

    public static String doubleChar(String s) {
        char[] karakter = s.toCharArray();
        char[] result = new char[karakter.length * 2];
        int j = 0;
        for (int i = 0; i < result.length; i += 2) {
            result[i + 1] = karakter[j];
            if (j < karakter.length) {
                j++;
            }
        }
        j = 0;
        for (int i = 0; i < result.length; i += 2) {
            result[i] = karakter[j];
            if (j < karakter.length) {
                j++;
            }
        }

        String solusi = new String(result);
//        System.out.println(Arrays.toString(karakter));
//        System.out.println(Arrays.toString(result));
//        System.out.println(solusi);
        return solusi;
    }
}
