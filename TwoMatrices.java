import java.util.*;

public class TwoMatrices {
    public static void main(String[] args) {
        System.out.println("------------------");
        System.out.println("Author: JealousGx");
        System.out.println("------------------");
        
        Scanner input = new Scanner(System.in);
        double[][] matrixOne = new double[3][3];
        double[][] matrixTwo = new double[3][3];
            
        System.out.print("Enter matrix1 (3x3): ");
        for (int i = 0; i < matrixOne.length; i++) {
            for (int j = 0; j < matrixOne[i].length; j++) {
                matrixOne[i][j] = input.nextDouble();
            }
        }

        System.out.print("Enter matrix2 (3x3): ");
        for (int i = 0; i < matrixTwo.length; i++) {
            for (int j = 0; j < matrixTwo[i].length; j++) {
                matrixTwo[i][j] = input.nextDouble();
            }
        }

        double[][] multiply = multiplyMatrix(matrixOne, matrixTwo);
        double[][] sum = addMatrix(matrixOne, matrixTwo);
        double[][] diff = diffMatrix(matrixOne, matrixTwo);

        System.out.println("\n\n-------Matrix Multiplication-------");
        for (int i = 0; i < matrixOne.length; i++) {
            System.out.printf("| %.1f %.1f %.1f |  %s  | %.1f %.1f %.1f |  %s  |  %.1f  %.1f  %.1f |%n", matrixOne[i][0], matrixOne[i][1], matrixOne[i][2], i == 1 ? "*" : " ", matrixTwo[i][0], matrixTwo[i][1], matrixTwo[i][2], i == 1 ? "=" : " ", multiply[i][0], multiply[i][1], multiply[i][2]);
        }

        System.out.println("\n\n-------Matrix Addition-------");
        for (int i = 0; i < matrixOne.length; i++) {
            System.out.printf("| %.1f %.1f %.1f |  %s  | %.1f %.1f %.1f |  %s  |  %.1f  %.1f  %.1f |%n", matrixOne[i][0], matrixOne[i][1], matrixOne[i][2], i == 1 ? "+" : " ", matrixTwo[i][0], matrixTwo[i][1], matrixTwo[i][2], i == 1 ? "=" : " ", sum[i][0], sum[i][1], sum[i][2]);
        }

        System.out.println("\n\n-------Matrix Subtraction-------");
        for (int i = 0; i < matrixOne.length; i++) {
            System.out.printf("| %.1f %.1f %.1f |  %s  | %.1f %.1f %.1f |  %s  |  %.1f  %.1f  %.1f |%n", matrixOne[i][0], matrixOne[i][1], matrixOne[i][2], i == 1 ? "-" : " ", matrixTwo[i][0], matrixTwo[i][1], matrixTwo[i][2], i == 1 ? "=" : " ", diff[i][0], diff[i][1], diff[i][2]);
        }
    }

    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        double[][] c = new double[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                for (int k = 0; k < a[i].length; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c; 
   }

    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] c = new double[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                    c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c; 
    }

    public static double[][] diffMatrix(double[][] a, double[][] b) {
        double[][] c = new double[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                    c[i][j] = a[i][j] - b[i][j];
            }
        }
        return c; 
    }
}