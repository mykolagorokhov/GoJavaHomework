package modul10.task102;

/**
 * Created by MYKOLA.GOROKHOV on 06.04.17.
 * <p>
 * TASK 2
 * <p>
 * Create your own exception class using the extends keyword. Write a constructor for this class that takes a
 * String argument and stores it inside the object with a String reference. Write a method that prints out the
 * stored String. Create a try-catch clause to exercise your new exception.
 */
public class Main {
    public static void main(String[] args) throws MyException {
//      Создайте свой собственный класс исключений, используя ключевое слово extends.
//      Напишите конструктор для этого класса, который получает аргумент типа String и хранит его внутри объекта как ссылку (reference) на String.
//      Написать метод, который выводит хранимую строку.
//      Создать try-catch-блоки, чтобы поупражняться на новом исключении.

        try {
            throw new MyException("test message");
        } catch (MyException e) {
            System.err.println("catch : " + e);
            System.err.println("catch : " + e.getMessage());
        } finally {
            System.err.println("finally");
        }
    }


    public static class MyException extends Exception {
        private String msg;

        @Override
        public String getMessage() {
            return this.msg;
        }

        public MyException(String msg) {
            this.msg = msg+" - вот такое исключение";
        }
    }
}
