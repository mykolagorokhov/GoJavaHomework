package modul06.task061;

/**
 * Created by MYKOLA.GOROKHOV on 04.03.2017.
 */
public class ArraysMain

{
    public static void main(String[] args) {
//    ArraysUtils Test-------------------
        int[] array = {-11, 22, -33, -44, -55, -66, -77, -88, -99, -101};
        //  ArraysUtils arraysUtils = new ArraysUtils();

        System.out.println("\u001B[31m");
        ArraysUtils.getInstance().sum(array);
        System.out.println("\u001B[32m");
        ArraysUtils.getInstance().min(array);
        System.out.println("\u001B[33m");
        ArraysUtils.getInstance().max(array);
        System.out.println("\u001B[31m");
        ArraysUtils.getInstance().maxPositive(array);
        System.out.println("\u001B[32m");
        ArraysUtils.getInstance().multiplication(array);
        System.out.println("\u001B[33m");
        ArraysUtils.getInstance().modulus(array);
        System.out.println("\u001B[31m");
        ArraysUtils.getInstance().secondLargest(array);
        System.out.println("\u001B[32m");
        ArraysUtils.getInstance().reverse(array);
        System.out.println("\u001B[33m");
        ArraysUtils.getInstance().findEvenElements(array);

    }// END MAIN METHOD
}
