package modul07.task075;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by MYKOLA.GOROKHOV on 17.03.2017.
 * <p>
 * Сгенерируйте Integer и String ArrayList и LinkedList с 1000 и 10000 элементами.
 * <p>
 * Измерьте время выполнения этих методов и выведите их в консоль:
 * - add
 * - set
 * - get
 * - remove
 */
public class Task075 {
    public static void main(String[] args) {
        final int COUNT = 10000;

        ArrayList<Integer> ALI = new ArrayList<>();
        ArrayList<String> ALS = new ArrayList<>();

        LinkedList<Integer> LLI = new LinkedList<>();
        LinkedList<String> LLS = new LinkedList<>();

//------------------------ADD---------------------------------------------------------
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            ALI.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("ArrayList<Integer> add speed: " + (endTime - startTime));


        startTime = System.currentTimeMillis();
        for (Integer i = 0; i < COUNT; i++) {
            ALS.add(i.toString());
        }
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList<String> add speed: " + (endTime - startTime));


        startTime = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            LLI.add(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList<Integer> add speed: " + (endTime - startTime));


        startTime = System.currentTimeMillis();
        for (Integer i = 0; i < COUNT; i++) {
            LLS.add(i.toString());
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList<String> add speed: " + (endTime - startTime));

//-----------------SET----------------------------------------------------------------
        startTime = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            ALI.set(i, i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList<Integer> set speed: " + (endTime - startTime));


        startTime = System.currentTimeMillis();
        for (Integer i = 0; i < COUNT; i++) {
            ALS.set(i, i.toString());
        }
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList<String> set speed: " + (endTime - startTime));


        startTime = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            LLI.set(i, i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList<Integer> set speed: " + (endTime - startTime));


        startTime = System.currentTimeMillis();
        for (Integer i = 0; i < COUNT; i++) {
            LLS.set(i, i.toString());
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList<String> set speed: " + (endTime - startTime));

//-----------------GET----------------------------------------------------------------
        startTime = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            ALI.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList<Integer> get speed: " + (endTime - startTime));


        startTime = System.currentTimeMillis();
        for (Integer i = 0; i < COUNT; i++) {
            ALS.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList<String> get speed: " + (endTime - startTime));


        startTime = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            LLI.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList<Integer> get speed: " + (endTime - startTime));


        startTime = System.currentTimeMillis();
        for (Integer i = 0; i < COUNT; i++) {
            LLS.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList<String> get speed: " + (endTime - startTime));

//-----------------REMOVE----------------------------------------------------------------
        startTime = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            ALI.remove(COUNT - i - 1);
        }
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList<Integer> remove speed: " + (endTime - startTime));


        startTime = System.currentTimeMillis();
        for (Integer i = 0; i < COUNT; i++) {
            ALS.remove(COUNT - i - 1);
        }
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList<String> remove speed: " + (endTime - startTime));


        startTime = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            LLI.remove(COUNT - i - 1);
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList<Integer> remove speed: " + (endTime - startTime));


        startTime = System.currentTimeMillis();
        for (Integer i = 0; i < COUNT; i++) {
            LLS.remove(COUNT - i - 1);
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList<String> remove speed: " + (endTime - startTime));
    }
}