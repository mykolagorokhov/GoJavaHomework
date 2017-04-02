package modul08.task081;

/**
 * Created by MYKOLA.GOROKHOV on 24.03.2017.
 * ДЗ №08.1
 * <p>
 * Создайте enum класс Country со списком стран (страны произвольные, не меньше 5ти).
 * Создайте класс-утилиту IdGenerator, который будет генерировать и возвращать
 * уникальный идентификатор (реализацию продумайте самостоятельно).
 */
public final class IdGenerator {

//==========OLD REALISATION==========================================
//    private IdGenerator() {
//    }
//
//    private static long lastID;
//
//    public static long generate() {
//        if (lastID < Long.MAX_VALUE) {
//            return lastID++;
//        }
//
//        return Long.parseLong(null);
//    }
//-----------------------------------------------------

    public static long generate(String name, Country country, long expiration) {
        int result = name.hashCode();
        result = 31 * result + country.hashCode();
        result = 31 * result + (int) (expiration ^ (expiration >>> 32));
        return result;
    }
}
