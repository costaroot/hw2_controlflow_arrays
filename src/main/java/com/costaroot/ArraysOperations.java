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
        for (int temp : arr)
            System.out.print(temp + " ");
    }

    int minValueOfArray(int[] arr) {
        int minVal = Integer.MAX_VALUE;
        for (int temp : arr) {
            if (temp < minVal)
                minVal = temp;
        }
        return minVal;
    }

    int maxValueOfArray(int[] arr) {
        int maxVal = Integer.MIN_VALUE;
        for (int temp : arr) {
            if (temp > maxVal)
                maxVal = temp;
        }
        return maxVal;
    }

    int sumOfArray(int[] arr) {
        int sum = 0;
        for (int tmp : arr) {
            sum += tmp;
        }
        return sum;
    }

    void squaredValues(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= arr[i];
        }
    }

    void sort(int[] arr) {
        int min;
        int buf;
        int index;
        for (int j = 0; j < arr.length; j++) {
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
        }
    }

    void reverseSort(int[] arr) {
        int max;
        int buf;
        int index;
        for (int j = 0; j < arr.length; j++) {
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
        }
    }

    void checkDuplicate(int[] arr, int maxValue) {
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
