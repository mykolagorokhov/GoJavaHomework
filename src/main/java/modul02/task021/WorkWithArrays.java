package modul02.task021;

import java.util.Arrays;

/**
 * Created by MYKOLA.GOROKHOV on 30.01.2017.
 * ЗАДАНИЕ 1
 * Input: array with size = 10 can be of one of two data types: int and double. Calculate:
 * <p>
 * sum
 * min/max
 * max positive
 * multiplication
 * modulus of first and last element
 * second largest element
 * <p>
 * As a result you should have methods with following names :
 * <p>
 * sum(int array[]), sum(double[])
 * min(int array[]), min(double[])
 * max(int array[]), max(double[])
 * maxPositive(int array[]), maxPositive(double array[]),
 * multiplication  (int array[]), multiplication (double[])
 * modulus(int array[]), modulus(double[])
 * secondLargest(int array[]), secondLargest(double[])
 */
public class WorkWithArrays {
    public static void main(String[] args) {

        //int[] array = {-11, 22, -33, -44, -55, -66, -77, -88, -99, -101};
        double[] array = {1.1, 2.2, -3.3, -4.4, -5.5, 6.6, -7.7, -8.8, -99, -10.1};

        WorkWithArrays myClass = new WorkWithArrays();

        myClass.sum(array);
        myClass.min(array);
        myClass.max(array);
        myClass.maxPositive(array);
        myClass.multiplication(array);
        myClass.modulus(array);
        myClass.secondLargest(array);
    }

    //----------------Методы для Integer-----------------------------
    public void secondLargest(int[] array) {
        int[] sortedArray = array.clone();

        for (int i = sortedArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (sortedArray[j] > sortedArray[j + 1]) {
                    int tmp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = tmp;
                }
            }
        }
        System.out.println("Второе наибольшее= " + sortedArray[sortedArray.length - 2]);
        System.out.println("sorted array= " + Arrays.toString(sortedArray));
        System.out.println("initial array= " + Arrays.toString(array));


    }

    public void modulus(int[] array) {
        System.out.println("Модуль первого элемента= " + Math.abs(array[0]));
        System.out.println("Модуль последнего элемента = " + Math.abs(array[array.length - 1]));
    }

    public void multiplication(int[] array) {
        int mult = 1;
        for (int i = 0; i < array.length; i++) {
            mult *= array[i];
        }
        System.out.println("Произведение элементов массива= " + mult);
    }

    public void maxPositive(int[] array) {
        int maxPositive = array[0];

        for (int i = 0; i < array.length; i++) {
            if (maxPositive < array[i] && array[i] >= 0) {
                maxPositive = array[i];
            }
        }

        if (maxPositive < 0) {
            System.out.println("В массиве отсутствуют положительные элементы");
        } else {
            System.out.println("Максимальный положительный элемент= " + maxPositive);
        }
    }

    public void max(int[] array) {
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Максимальное значение массива= " + max);
    }

    public void min(int[] array) {
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Минимальное значение массива= " + min);
    }

    public void sum(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Сумма элементов массива= " + sum);
    }

    //----------------Методы для Double-----------------------------
    public void secondLargest(double[] array) {
        double[] sortedArray = array.clone();

        for (int i = sortedArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (sortedArray[j] > sortedArray[j + 1]) {
                    double tmp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = tmp;
                }
            }
        }
        System.out.println("Второе наибольшее= " + sortedArray[sortedArray.length - 2]);
        System.out.println("sorted array= " + Arrays.toString(sortedArray));
        System.out.println("initial array= " + Arrays.toString(array));


    }

    public void modulus(double[] array) {
        System.out.println("Модуль первого элемента= " + Math.abs(array[0]));
        System.out.println("Модуль последнего элемента = " + Math.abs(array[array.length - 1]));
    }

    public void multiplication(double[] array) {
        double mult = 1;

        for (int i = 0; i < array.length; i++) {
            mult *= array[i];
        }
        System.out.println("Произведение элементов массива= " + mult);
    }

    public void maxPositive(double[] array) {
        double maxPositive = array[0];

        for (int i = 0; i < array.length; i++) {
            if (maxPositive < array[i] && array[i] >= 0) {
                maxPositive = array[i];
            }
        }
        if (maxPositive < 0) {
            System.out.println("В массиве отсутствуют положительные элементы");
        } else {
            System.out.println("Максимальный положительный элемент= " + maxPositive);
        }
    }

    public void max(double[] array) {
        double max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Максимальное значение массива= " + max);
    }

    public void min(double[] array) {
        double min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Минимальное значение массива= " + min);
    }

    public void sum(double[] array) {
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Сумма элементов массива= " + sum);
    }
}

