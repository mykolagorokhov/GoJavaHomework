package modul10.task104;

/**
 * Created by MYKOLA.GOROKHOV on 06.04.17.
 * <p>
 * TASK 4
 * <p>
 * Create a class with two methods, f( ) and g( ). In g( ), throw an exception of a new type that you define.
 * In f( ), call g( ), catch its exception and, in the catch clause, throw a different exception
 * (of a second type that you define). Test your code in main( ).
 */
public class Main {
//    Создайте класс с двумя методами f() и g().
//    В g() киньте (throw) исключение нового типа, который вы определили.
//    В f() вызовите g(), поймайте его исключение и в блоке catch киньте другое исключение
//    (другого типа, который вы определили). Протестируйте свой код в main().

    public static void main(String[] args) throws modul10.task102.Main.MyException {
        Class cc = new Class();


        try {
            cc.f();
        } catch (Exception e) {
            System.err.println("catch : " + e);
            System.err.println("catch : " + e.getMessage());
        } finally {
            System.err.println("finally");
        }
    }

}



