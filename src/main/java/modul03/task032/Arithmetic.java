package modul03.task032;

/**
 * Created by MYKOLA.GOROKHOV on 08.02.2017.
 * <p>
 * Write class named Arithmetic with a method named add that takes  integers as parameters and returns an
 * integer denoting their sum.
 * <p>
 * Write class named Adder that inherits from a superclass named Arithmetic.
 * Also class Adder must contain method check that compare two numbers and returns true if a>=b and false in other cases.
 * <p>
 * Methods signature:
 * int add(Integer a, Integer b)
 * boolean check(Integer a, Integer b)
 */
public class Arithmetic {

    public static void main(String[] args) {

        Arithmetic a = new Arithmetic();
        Adder b = new Adder();

        System.out.println("add thru Arithmetic = " + a.add(1, 2));
        System.out.println("add thru Adder = " + b.add(5, 10));
        System.out.println("check thru Adder = " + b.check(100, 200));
    }

    public static int add(Integer a, Integer b) {
        return a + b;
    }
}
