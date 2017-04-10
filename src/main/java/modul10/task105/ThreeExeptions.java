package modul10.task105;

/**
 * Created by MYKOLA.GOROKHOV on 06.04.17.
 * <p>
 * TASK 5
 * <p>
 * Create three new types of exceptions. Write a class with a method that throws all three.
 * In main( ), call the method but only use a single catch clause that will catch all three types of exceptions.
 */
public class ThreeExeptions {
//    Создайте три новых типа исключений. Напишите класс с методом, который будет кидать все три из них.
//    В main() вызовите этот метод, но используйте только один catch-блок который будет ловить все три типа исключений.

    public static class MyException1 extends Exception {
        @Override
        public String getMessage() {
            return "MyException1";
        }
    }

    public static class MyException2 extends Exception {
        @Override
        public String getMessage() {
            return "MyException2";
        }
    }

    public static class MyException3 extends Exception {
        @Override
        public String getMessage() {
            return "MyException3";
        }
    }


}
