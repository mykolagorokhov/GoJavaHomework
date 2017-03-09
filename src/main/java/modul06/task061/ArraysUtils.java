package modul06.task061;

import java.util.Arrays;

/**
 * Created by MYKOLA.GOROKHOV on 04.03.2017.
 * <p>
 * Create ArraysUtils with following methods
 * sum(int array[])
 * min(int array[])
 * max(int array[])
 * maxPositive(int array[])
 * multiplication  (int array[])
 * modulus(int array[])
 * secondLargest(int array[])
 * <p>
 * Copy methods realization from homework 2.1
 * <p>
 * In addition add new methods
 * <p>
 * int[] reverse(int[] array) - arranges array elements backwards
 * int[] findEvenElements(int[] array) - finds even numbers in the array
 * <p>
 * Class ArraysUtils must match the pattern “Utility class”:
 * - You cannot create an instance of this class
 * - All class methods are static
 * <p>
 * Make sure nobody can inherit your ArraysUtils.
 * <p>
 * Create class ArraysMain with a main method, where check ArraysUtils class methods (use a random array).
 */

//final
public final class ArraysUtils {
    private static ArraysUtils instance;

    public static ArraysUtils getInstance() {
        if (instance == null) {
            instance = new ArraysUtils();
        }
        return instance;
    }

    private ArraysUtils() {
    }

    static final int[] reverse(int[] array) {
        int[] reverseArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reverseArray[i] = array[array.length - i - 1];
        }
        System.out.println("Обращенный масив= " + Arrays.toString(reverseArray));
        return reverseArray;
    }

    static final int[] findEvenElements(int[] array) {
        int[] tempArray = new int[array.length];

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                tempArray[count] = array[i];
                count++;
            }
        }
        int[] arrayOfEvent = new int[count];
        arrayOfEvent = Arrays.copyOf(tempArray, count);

        System.out.println("Масив четных элементов= " + Arrays.toString(arrayOfEvent));
        return arrayOfEvent;
    }

    //----------------Методы для Integer-----------------------------
    static final void secondLargest(int[] array) {
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
//        System.out.println("sorted array= " + Arrays.toString(sortedArray));
//        System.out.println("initial array= " + Arrays.toString(array));
    }

    static final void modulus(int[] array) {
        System.out.println("Модуль первого элемента= " + Math.abs(array[0]));
        System.out.println("Модуль последнего элемента = " + Math.abs(array[array.length - 1]));
    }

    static final void multiplication(int[] array) {
        int mult = 1;
        for (int i = 0; i < array.length; i++) {
            mult *= array[i];
        }
        System.out.println("Произведение элементов массива= " + mult);
    }

    static final void maxPositive(int[] array) {
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

    static final void max(int[] array) {
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Максимальное значение массива= " + max);
    }

    static final void min(int[] array) {
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Минимальное значение массива= " + min);
    }

    static final void sum(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Сумма элементов массива= " + sum);
    }
}
