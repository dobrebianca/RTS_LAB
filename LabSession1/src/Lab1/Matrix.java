package Lab1;

public class Matrix {

        public static void main(String[] args) {
            // Declare a 3x3 matrix row by row
            int[][] matrix = new int[3][3];

            // Initialize the matrix
            matrix[0][0] = 2;
            matrix[0][1] = 3;
            matrix[0][2] = 1;
            matrix[1][0] = 7;
            matrix[1][1] = 1;
            matrix[1][2] = 6;
            matrix[2][0] = 9;
            matrix[2][1] = 2;
            matrix[2][2] = 4;
            // Display the matrix
            System.out.println("Lab1.Matrix:");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
            int[][] matrix2 = new int[3][3];

            // Initialize the matrix
            matrix2[0][0] = 8;
            matrix2[0][1] = 5;
            matrix2[0][2] = 3;
            matrix2[1][0] = 3;
            matrix2[1][1] = 9;
            matrix2[1][2] = 2;
            matrix2[2][0] = 2;
            matrix2[2][1] = 7;
            matrix2[2][2] = 3;
            // Display the matrix
            System.out.println("Matrix2:");
            for (int i = 0; i < matrix2.length; i++) {
                for (int j = 0; j < matrix2[i].length; j++) {
                    System.out.print(matrix2[i][j] + " ");
                }
                System.out.println();
            }
            // Calculate the sum of the matrices
            int[][] sum = new int[matrix.length][matrix[0].length];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    sum[i][j] = matrix[i][j] + matrix2[i][j];
                }
            }

            // Display the sum of the matrices
            System.out.println("Sum of the matrices:");
            for (int i = 0; i < sum.length; i++) {
                for (int j = 0; j < sum[i].length; j++) {
                    System.out.print(sum[i][j] + " ");
                }
                System.out.println();
            }
            // Calculate the product of the matrices
            int[][] product = new int[matrix.length][matrix2[0].length];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix2[0].length; j++) {
                    for (int k = 0; k < matrix2.length; k++) {
                        product[i][j] += matrix[i][k] * matrix2[k][j];
                    }
                }
            }

            // Display the product of the matrices
            System.out.println("Product of the matrices:");
            for (int i = 0; i < product.length; i++) {
                for (int j = 0; j < product[i].length; j++) {
                    System.out.print(product[i][j] + " ");
                }
            }

        }
}
