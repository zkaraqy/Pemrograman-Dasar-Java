package playground;

import java.util.Arrays;
import java.util.Scanner;

public class operasiPerkalianMatriksDgnArray {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int[][] matrixA = {
            {1, 2},
            {3, 4},
        };
        int[][] matrixB = {
            {11, 12},
            {13, 14},
        };

        int[][] hasilKaliMatrix = kaliMatrix(matrixA, matrixB);
        printArray2D(hasilKaliMatrix);
    }

    public static int[][] kaliMatrix(int[][] matrix1, int[][] matrix2) {
        // jika a.b maka jumlah baris akan mengikuti matrix a, dan jumlah kolom akan mengikuti matrix b
        int[][] matrix3 = new int[matrix1.length][matrix2[0].length];

        int buffer;
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                buffer = 0;
                for (int k = 0; k < matrix1[i].length; k++) {
                    buffer += matrix1[i][k] * matrix2[k][j];
                }
                matrix3[i][j] = buffer;
            }
        }
        return matrix3;
    }

    public static void printArray2D(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

}
