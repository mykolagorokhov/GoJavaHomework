package modul08.task084;

import modul07.task075.Task075;
import modul08.task082.Food;
import modul08.task083.IManageSystem;

import java.util.*;

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

    private static Map<Food, Double> database = new HashMap<>();


    @Override
    public T save(T obj, double price) {
        if (obj.getClass().equals(Food.class)) {
            this.database.put((Food) obj, price);
            System.out.println(obj.toString() + " was added");
        }
        return obj;
    }

    @Override
    public T save(T obj) {
        this.database.put((Food) obj, null);
        System.out.println(obj.toString() + " was added without price");
        return obj;
    }

    @Override
    public void delete(T obj) {
        this.database.remove(obj);
        System.out.println(obj.toString() + " was removed");
    }

    @Override
    public void deleteById(int id) {
        for (Map.Entry<Food, Double> item : this.database.entrySet()) {
            if (item.getKey().getId() == id) {
                this.database.remove(item.getKey());
                System.out.println(item.getKey().toString() + " with id=" + id + " was deleted");
                return;
            }
        }
    }

    @Override
    public T get(int id) {
        for (Map.Entry<Food, Double> item : this.database.entrySet()) {
            if (item.getKey() != null && item.getKey().getId() == id) {
                System.out.println(item.getKey().toString() + " with id=" + id + " was found");
                return (T) item.getKey();
            }
        }
        System.out.println(id + " not found");
        return null;
    }

    @Override
    public Double getPrice(T obj) {
        for (Map.Entry<Food, Double> item : this.database.entrySet()) {
            if (item.getKey().equals(obj)) {
                System.out.println("Price of " + obj.toString() + "  " + item.getValue());
                return item.getValue();
            }
        }
        System.out.println(obj.toString() + " not found");
        return null;
    }

    @Override
    public Set<T> getProducts() {
        return (Set<T>) this.database.keySet();
    }

    @Override
    public List<Double> getPrices() {
        List<Double> priceList = new ArrayList();

        for (Map.Entry<Food, Double> item : this.database.entrySet()) {
            priceList.add(item.getValue());
        }
        return priceList;
    }


}
