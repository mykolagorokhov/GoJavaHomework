package modul10.task105;

/**
 * Created by MYKOLA.GOROKHOV on 06.04.17.
 * <p>
 * TASK 5
 * <p>
 * Create three new types of exceptions. Write a class with a method that throws all three.
 * In main( ), call the method but only use a single catch clause that will catch all three types of exceptions.
 */
public class Main {
//    Создайте три новых типа исключений. Напишите класс с методом, который будет кидать все три из них.
//    В main() вызовите этот метод, но используйте только один catch-блок который будет ловить все три типа исключений.


    public void test() throws Throwable {

//        throw new ThreeExeptions.MyException1();
//        throw new ThreeExeptions.MyException2();
        throw new ThreeExeptions.MyException3();
    }

    public static void main(String[] args) throws Throwable {
        Main tt = new Main();

        try {
            tt.test();
            throw new ThreeExeptions.MyException1();
//            throw new ThreeExeptions.MyException2();
//            throw new ThreeExeptions.MyException3();
        } catch (Exception e) {
            System.err.println("catch : " + e.getMessage());
        }
    }

}
