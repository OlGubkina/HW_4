package com.company;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] array = initMatrix(10);
        System.out.println("Matrix:");
        printMatrix(array);
        changeD(array);
        System.out.println("Matrix with changed diagonal:");
        printMatrix(array);
    }

    public static int[][] initMatrix(int size) {
        int[][] matrix = new int[size][size];
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(0, 5);
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] changeD(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                   int a = matrix[i][j];
                   int b = matrix[i][matrix.length-1-i];
                   matrix[i][j] = b;
                   matrix[i][matrix.length-1-i]=a;
                }
            }
        }
        return matrix;
    }
}

