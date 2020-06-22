package com.costaroot;

public class MatrixOperations {

    void printMainDiagMatrix(String[][] matrix) {
        String mainDiagLine = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j)
                    mainDiagLine += matrix[i][j] + " ";
            }
        }
        System.out.print("\n" + mainDiagLine);
    }

    void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }
}
