package additional_tasks.task02;

import java.util.Arrays;

/**
 * Created by MYKOLA.GOROKHOV on 14.02.2017.
 * сделать метод который принимает в параметры высоту и ширину двумерного массива (int x, int y), создает
 * int [][] массив с такими параметрами, и заполняет его числами по возрастанию
 * <p>
 * массив надо заполнить по спирали
 * <p>
 * [1][2][3]*
 * [8][9][4]*
 * [7][6][5]*
 * <p>
 * учитывайте что массив может быть не квадратным!
 */


public class LoopFilledArray {
    public static void main(String[] args) {
        LoopFilledArray doubleArray = new LoopFilledArray();
        int[][] testArray = doubleArray.getLoopFilledArray(5, 4);
        for (int i = 0; i < testArray.length; i++) {
            System.out.println(Arrays.toString(testArray[i]));
        }
    }

    public int[][] getLoopFilledArray(int x, int y) {
        int[][] resultArray = new int[y][x];
        int startX = 0;
        int startY = 0;
        int sizeX = x;
        int sizeY = y;
        int count = 0;

        do {

// Вправо
            for (int i = startX; i < sizeX; i++) {
                count++;
                resultArray[startY][i] = count;
            }
//Вниз
            if ((startY + 1) < sizeY) {
                for (int i = startY + 1; i < sizeY; i++) {
                    count++;
                    resultArray[i][sizeX - 1] = count;
                }
            }

// Влево
            if ((sizeY - 1) > startY) {
                for (int i = sizeX - 2; i >= startX; i--) {
                    count++;
                    resultArray[sizeY - 1][i] = count;
                }
            }

//Вверх
            if ((sizeX - 1) > startX) {
                for (int i = sizeY - 2; i > startY; i--) {
                    count++;
                    resultArray[i][startX] = count;
                }
            }

// уменьшаем массив
            startX++;
            startY++;
            sizeX--;
            sizeY--;

        } while (startX <= sizeX - 1 && startY <= sizeY - 1);
        return resultArray;
    }

}
