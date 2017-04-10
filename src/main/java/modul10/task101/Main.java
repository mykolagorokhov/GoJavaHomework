package modul10.task101;

/**
 * Created by MYKOLA.GOROKHOV on 06.04.17.
 * <p>
 * TASK 1
 * <p>
 * Create a class with a main( ) that throws an object of class Exception inside a try block.
 * Give the constructor for Exception a String argument. Catch the exception inside a catch clause and print the
 * String argument. Add a finally clause and print a message to prove you were there.
 */
public class Main {
    public static void main(String[] args) throws Exception {
//        Создайте класс с main(), который закидывает (throws) объект класса Exception внутрь try-блока.
//        Задайте конструктору исключения (Exception) аргумент типа String.
//        Поймайте (catch) исключение внутри catch-блока и выведитe String argument.
//        Добавьте finally-блок и выведите сообщение в доказательство того, что он вызывался.

        try {
            throw new Exception("test message");
        } catch (Exception e) {
            System.err.println("catch : " + e);
            System.err.println("catch : " + e.getMessage());
        } finally {
            System.err.println("finally");
        }
    }

}
