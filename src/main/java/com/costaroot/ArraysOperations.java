package com.costaroot;

import java.util.Random;

public class ArraysOperations {

    int[] createRandArray(int sizeArray, int boundValue) {
        Random random = new Random();
        int[] arr = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            arr[i] = random.nextInt(boundValue);
        }
        return arr;
    }

    void printArray(int[] arr) {
        System.out.println();
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    int minValueOfArray(int[] arr) {
        int minVal = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minVal)
                minVal = arr[i];
        }
        return minVal;
    }

    int maxValueOfArray(int[] arr) {
        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal)
                maxVal = arr[i];
        }
        return maxVal;
    }

    int sumOfArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    void squaredValues(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= arr[i];
        }
    }

    void sort(int[] arr) {
        int j = 0;
        int min;
        int buf;
        int index;
        while (j < arr.length) {
            min = Integer.MAX_VALUE;
            index = j;
            for (int i = j; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                    index = i;
                }
            }
            buf = arr[j];
            arr[j] = min;
            arr[index] = buf;
            j++;
        }
    }

    void reverseSort(int[] arr) {
        int j = 0;
        int max;
        int buf;
        int index;
        while (j < arr.length) {
            max = Integer.MIN_VALUE;
            index = j;
            for (int i = j; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                    index = i;
                }
            }
            buf = arr[j];
            arr[j] = max;
            arr[index] = buf;
            j++;
        }
    }

    void checkDublicate(int[] arr, int maxValue) {
        boolean[] checkArr = new boolean[maxValue + 1];
        for (int i = 0; i < checkArr.length; i++) {
            checkArr[i] = false;
        }

        for (int i = 0; i < arr.length; i++) {
            if (checkArr[Math.abs(arr[i])]) {
                arr[i] = 0;
            } else {
                checkArr[Math.abs(arr[i])] = true;
            }
        }
    }

}
