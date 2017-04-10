package modul10.task103;

/**
 * Created by MYKOLA.GOROKHOV on 06.04.17.
 * <p>
 * TASK 3
 * <p>
 * Define an object reference and initialize it to null. Try to call a method through this reference.
 * Now wrap the code in a try-catch clause to catch the exception.stored String.
 * Create a try-catch clause to exercise your new exception.
 */
public class Main {
    public static void main(String[] args) throws Exception {
//         Определите ссылку (reference) на объект и инициализируйте ее как null.
//         Попробуйте вызвать метод через эту ссылку.
//         Потом оберните этот код в try-catch-блок, чтобы поймать исключение.

        TestClass tc = new TestClass();

        tc = null;

        try {
            tc.testmethod();
        } catch (Exception e) {
            System.err.println("catch : " + e);
            System.err.println("catch : " + e.getMessage());
        } finally {
            System.err.println("finally");
        }
    }


    public static class TestClass {
        public void testmethod() {
            // do nothing
        }

    }
}
