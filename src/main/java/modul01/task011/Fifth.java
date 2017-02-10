package modul01.task011;

/**
 * Created by MYKOLA.GOROKHOV on 27.01.2017.
 */
public class Fifth {
    public static void main(String[] args) {

        System.out.println("Мой пятый класс на Java");

        char escCode = 0x1B;
        int row = 10;
        int column = 10;
        System.out.print(String.format("%c[%d;%df", escCode, row, column));
        System.out.print('a');

    }

}
