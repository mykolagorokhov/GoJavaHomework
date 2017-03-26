package modul08.task083;

import modul08.task082.Food;

import java.util.List;
import java.util.Set;

/**
 * Created by MYKOLA.GOROKHOV on 24.03.2017.
 * <p>
 * ДЗ №08.3
 * <p>
 * Создайте универсальный интерфейс IManageSystem(T) с такими методами:
 * T save(T obj, double price);
 * T save(T obj);
 * void delete(T obj) ;
 * void deleteById(int id);
 * T get(int id);
 * Double getPrice(T obj);
 * Set<T> getProducts();
 * List<Double> getPrices();
 */
public interface IManageSystem<T> {

    T save(T obj, double price);

    T save(T obj);

    void delete(T obj);

    void deleteById(int id);

    T get(int id);

    Double getPrice(T obj);

    Set<T> getProducts();

    List<Double> getPrices();

//------------------------------------------------------------------------------------------------------
//    ДЗ №08.6 ** Дополнительно
//
//    Добавьте в интерфейс методы и проверьте их работу:
//    void printProductsSortedByName(); - выводит список «продукт-цена», отсортированных по имени продукта.
//    void printProductsSortedByPrice();- выводит список «продукт-цена», отсортированных по цене продукта (по возрастанию).
//------------------------------------------------------------------------------------------------------

//    void printProductsSortedByName();
//    void printProductsSortedByPrice();

}
