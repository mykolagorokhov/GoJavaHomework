package modul11;

import java.io.*;
import java.util.Map;

/**
 * Created by MYKOLA.GOROKHOV on 12.04.2017.
 * <p>
 * TASK 1
 * You should create method which replace words in the File and returns String with replaced values
 * a) read file, save to string var
 * b) replace words
 * c) return new string
 * String replacer(Map<String, String> map)
 * <p>
 * TASK 2
 * You should create method which replace words in the File and rewrite File content with new values
 * a) read file, save to string var
 * b) replace words
 * c) rewrite file with string
 * File fileContentReplacer(Map<String, String> map)
 * <p>
 * TASK 3
 * You should create method which replace words in the File and write result to existing File content
 * a) read file, save to string var
 * b) replace words
 * c) add string to the existing file content
 * File fileContentMerger(Map<String, String> map)
 * <p>
 * TASK 4
 * Check if file contains particular word. Pring 0 if no. Print number n which equals number of times it is contained in the file
 * a) read file, save to string var
 * b) calculate how many time the word occurs
 * c) print result
 * int checkWord(String word)
 * Write this task with usual try and try with resources (two versions)
 */
public class WorkWithFiles {
//    Задание 1
//    Создать метод, который заменяет слова в файле (File) и возвращает строку (String) с заменёнными значениями.
//    String replacer(Map map)

    public String replacer(Map map) throws IOException {
        try (FileInputStream fs = new FileInputStream("tasks.resources");

      //  BufferedReader bf = new BufferedReader(new FileReader("tasks.resources"));

        return null;
    }

    //    Задание 2
//    Создать метод, который заменяет слова в файле (File) и переписать его содержание с новыми значениями.
//    File fileContentReplacer(Map map)
    public File fileContentReplacer(Map map) {


        return null;
    }


    //    Задание 3
//    Создать метод, который заменяет слова в файле (File), и вывести результат в существующий контент файла.
//    File fileContentMerger(Map<String, String> map)
    public File fileContentMerger(Map<String, String> map) {


        return null;
    }


    //    Задание 4
//    Проверить, содержит ли файл конкретное слово. Вывести 0, если нет. Вывести номер n, который эквивалентен числу появлений этого слова в файле.
//    int checkWord(String word)
//    Написать это задание с обычным try и try-with-resources(две версии).
    public int checkWord(String word) {


        return 0;
    }

    public int checkWordResources(String word) {


        return 0;
    }


}
