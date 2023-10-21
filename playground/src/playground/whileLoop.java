package playground;
import java.util.Scanner;

public class whileLoop {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter perulangan : ");
        int n = input.nextInt(), i = 1;
        while (i <= n) {            
            System.out.println("Perulangan ke-" + i);
            i++;
        }
    }
}
