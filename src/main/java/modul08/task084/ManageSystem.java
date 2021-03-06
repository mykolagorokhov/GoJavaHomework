package modul08.task084;

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
public class ManageSystem implements IManageSystem<Food> {

    private Map<Food, Double> database = new HashMap<>();


    @Override
    public Food save(Food obj, double price) {

        this.database.put(obj, price);
        System.out.println(obj.toString() + " was added");

        return obj;
    }

    @Override
    public Food save(Food obj) {

        this.database.put(obj, null);
        System.out.println(obj.toString() + " was added without price");

        return obj;
    }

    @Override
    public void delete(Food obj) {

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
    public Food get(int id) {
        for (Map.Entry<Food, Double> item : this.database.entrySet()) {
            if (item.getKey() != null && item.getKey().getId() == id) {
                System.out.println(item.getKey().toString() + " with id=" + id + " was found");
                return item.getKey();
            }
        }
        System.out.println(id + " not found");
        return null;
    }

    @Override
    public Double getPrice(Food obj) {

        if (this.database.containsKey(obj)) {
            System.out.println(obj + " - " + this.database.get(obj));
            return this.database.get(obj);
        }
        System.out.println("This " + obj.toString() + " not found");
        return null;
    }

    @Override
    public Set<Food> getProducts() {
        return this.database.keySet();
    }

    @Override
    public List<Double> getPrices() {
        List<Double> priceList = new ArrayList();

        for (Map.Entry<Food, Double> item : this.database.entrySet()) {
            priceList.add(item.getValue());
        }
        return priceList;
    }

    @Override
    public void printProductsSortedByName() {
        List<Food> sortedDB = new ArrayList();
        sortedDB.addAll(this.database.keySet());

        sortedDB.sort(new Comparator<Food>() {
            @Override
            public int compare(Food o1, Food o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        for (Food item : sortedDB) {
            System.out.println(item.toString() + " - with price - " + this.database.get(item));
        }
    }

    @Override
    public void printProductsSortedByPrice() {
        List<Map.Entry<Food, Double>> sortedPriceDB = new ArrayList();
        sortedPriceDB.addAll(this.database.entrySet());

        sortedPriceDB.sort(new Comparator<Map.Entry<Food, Double>>() {
            @Override
            public int compare(Map.Entry<Food, Double> o1, Map.Entry<Food, Double> o2) {
                if (o1.getValue() == null) return -1;
                if (o2.getValue() == null) return 1;
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        for (Map.Entry<Food, Double> item : sortedPriceDB) {
            System.out.println(item.toString());
        }
    }
}
