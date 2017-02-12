package modul03.task032;

/**
 * Created by MYKOLA.GOROKHOV on 08.02.2017.
 * <p>
 * Write class named Arithmetic with a method named add that takes  integers as parameters and
 * returns an integer denoting their sum.
 * <p>
 * Write class named Adder that inherits from a superclass named Arithmetic.
 * Also class Adder must contain method check that compare two numbers and returns true if a>=b and false in other cases.
 * <p>
 * Methods signature:
 * int add(Integer a, Integer b)
 * boolean check(Integer a, Integer b)
 */
public class Adder extends Arithmetic {

    public boolean check(Integer a, Integer b) {
        return a >= b;
    }
}
