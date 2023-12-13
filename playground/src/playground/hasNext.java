package playground;

import java.io.*;
import java.util.*;

public class hasNext {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;
        do {
            String txt = input.nextLine();
            System.out.println(i + " " + txt);
            i++;
        } while (input.hasNext());
        input.close();
    }
}
