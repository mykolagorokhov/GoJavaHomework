package modul06.task061;

/**
 * Created by MYKOLA.GOROKHOV on 04.03.2017.
 */
public class ArraysMain

{
    public static void main(String[] args) {
//    ArraysUtils Test-------------------
        int[] array = {-11, 22, -33, -44, -55, -66, -77, -88, -99, -101};
     //     ArraysUtils arraysUtils = new ArraysUtils();

        System.out.println("\u001B[31m");
        ArraysUtils.sum(array);
        System.out.println("\u001B[32m");
        ArraysUtils.min(array);
        System.out.println("\u001B[33m");
        ArraysUtils.max(array);
        System.out.println("\u001B[31m");
        ArraysUtils.maxPositive(array);
        System.out.println("\u001B[32m");
        ArraysUtils.multiplication(array);
        System.out.println("\u001B[33m");
        ArraysUtils.modulus(array);
        System.out.println("\u001B[31m");
        ArraysUtils.secondLargest(array);
        System.out.println("\u001B[32m");
        ArraysUtils.reverse(array);
        System.out.println("\u001B[33m");
        ArraysUtils.findEvenElements(array);

    }// END MAIN METHOD
}
