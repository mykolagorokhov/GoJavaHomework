package additional_tasks.task01;

import java.util.Arrays;

/**
 * Created by MYKOLA.GOROKHOV on 12.02.2017.
 * <p>
 * *Задание01*
 * сделать метод который принимает в параметры высоту и ширину двумерного массива (int x, int y), создает int [][] массив
 * с такими параметрами,
 * и заполняет его числами по возрастанию
 * индексы двумерного массива 3 х 3:
 * [0.0][0.1][0.2]*
 * [1.0][1.1][1.2]*
 * [2.0][2.1][2.2]*
 * индексы как в Декартовых координатах только сначала y - высота(глубина) а потом x - ширина
 * <p>
 * метод с параметрами 3, 3 должен вернуть массив с числами:
 * <p>
 * [1][2][3]*
 * [4][5][6]*
 * [7][8][9]*
 */
public class DoubleArrayFiller {
    public static void main(String[] args) {
        DoubleArrayFiller doubleArray = new DoubleArrayFiller();
        int[][] testArray = doubleArray.getFilledArray(10, 5);
        for (int i = 0; i < testArray.length; i++) {
            System.out.println(Arrays.toString(testArray[i]));
        }
    }

    public int[][] getFilledArray(int x, int y) {
        int[][] resultArray = new int[y][x];

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                resultArray[i][j] = j + i * x + 1;
            }
        }
        return resultArray;
    }
}
