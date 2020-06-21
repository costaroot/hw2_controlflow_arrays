package com.costaroot;

public class TaskManager {
    void arrayTask() {
        System.out.print("-----Task1-----");
        ArraysOperations arrOperation = new ArraysOperations();
        int[] arr = new int[20];
        arr = arrOperation.createRandArray(arr.length, 10);
        arrOperation.printArray(arr);
        System.out.print("\nMin val=" + arrOperation.minValueOfArray(arr));
        System.out.print("\nMax val=" + arrOperation.maxValueOfArray(arr));
        arrOperation.sort(arr);
        arrOperation.printArray(arr);
        arrOperation.reverseSort(arr);
        arrOperation.printArray(arr);
        System.out.print("\nSum of Array= " + arrOperation.sumOfArray(arr));
        arrOperation.squaredValues(arr);
        arrOperation.printArray(arr);
    }

    void matrixTask() {
        System.out.print("\n -----Task2-----");
        MatrixOperations test = new MatrixOperations();
        String[][] text = {{"This", "code", "big", "w2"},
                {"The", "is", "bg", "w2"},
                {"boos", "jdk", "right", "fifo"},
                {"task", "code", "ans", "message"}};
        System.out.print("\nMatrix");
        test.printMatrix(text);
        test.printMainDiagMatrix(text);
    }

    void checkDublicateTask() {
        System.out.print("\n -----Task3-----");
        ArraysOperations arrOperation = new ArraysOperations();
        int[] arr = new int[25];
        arr = arrOperation.createRandArray(arr.length, 10);
        arrOperation.printArray(arr);
        arrOperation.checkDublicate(arr, 15);
        arrOperation.printArray(arr);
    }
}
