package playground;

import java.util.Arrays;
import java.util.Scanner;

public class operasiPertambahanMatriksDgnArray2D {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrixB = {
            {11, 12, 13},
            {14, 15, 16},
            {17, 18, 19}
        };

        tambahMatrix(matrixA, matrixB);
        System.out.println("");
        
        int[][] matrixC = {
            {1, 2},
            {4, 5},
            {7, 8}
        };
        
        int[][] matrixD = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        tambahMatrix(matrixC, matrixD);
    }

    public static void tambahMatrix(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length) {
            int[][] matrix3 = new int[matrix1.length][matrix1[0].length];
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[i].length; j++) {
                    matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            printArray2D(matrix3);
        } else {
            System.out.println("Jumlah baris atau kolom kedua matrix berbeda. ERROR");
        }
    }

    public static void printArray2D(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

}
