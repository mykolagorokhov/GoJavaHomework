package modul08.task084;

import modul07.task075.Task075;
import modul08.task082.Food;
import modul08.task083.IManageSystem;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by MYKOLA.GOROKHOV on 24.03.2017.
 * <p>
 * ДЗ №08.4
 * <p>
 * Реализуйте интерфейс IManageSystem для работы с базой данных товаров. Класс должен содержать поле:
 * Map<Food, Double> database
 * <p>
 * Поле эмулирует базу данных, содержит в себе данные о продуктах и их цене.
 * Поле должно быть доступно только внутри данного класса.
 */
public class ManageSystem<T> implements IManageSystem<T> {

    private static Map<Food, Double> database;

   
    @Override
    public T save(T obj, double price) {
        System.out.println("Class : "+obj.getClass().toString());
        if (obj.getClass().equals(Food.class)){
            System.out.println("true");
        database.put((Food) obj, price);}
        return obj;
    }


}
