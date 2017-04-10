package modul09;

import modul04.Currency;
import modul07.task071.Order;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.ArrayList;

import java.util.List;
import java.util.Map;

/**
 * Created by MYKOLA.GOROKHOV on 30.03.2017.
 * <p>
 * Используйте структуры с HW модуля 7 (User и Order) и выполните задания, используя Java 8 instruments
 * <p>
 * -отсортируйте список за ценой заказа по убыванию
 * -отсортируйте список за ценой заказа по возрастанию и за городом пользователя
 * -отсортируйте список за наименованием товара, идентификатором заказа, и городом пользователя
 * <p>
 * -удалите дублированные данные со списка
 * -удалите объекты, где цена меньше 1500
 * -разделите список на 2 списка - заказы в долларах и в гривнах
 * -разделите список на столько списков, сколько уникальных городов в User
 * <p>
 * -проверьте, содержит ли сет заказ, где фамилия пользователя - “Petrov”
 * -удалите заказы в USD
 * <p>
 * Ограничения:
 * -нельзя использовать итератор
 * -нельзя использовать циклы
 * <p>
 * Определите каждую подзадачу в отдельный метод.
 * Создайте класс Main и протестируйте каждый метод на тестовых данных.
 */
public class Java8Instruments {

    //        -отсортируйте список за ценой заказа по убыванию
    public void sort1(List<Order> arrayList) {
        Collections.sort(arrayList, (o1, o2) -> o2.getPrice() - o1.getPrice());
    }

    //        -отсортируйте список за ценой заказа по возрастанию и за городом пользователя
    public void sort2(ArrayList<Order> arrayList) {

        arrayList.sort((Order o1, Order o2) ->
        {
            if (o1.getPrice() != o2.getPrice()) {
                return (o1.getPrice() - o2.getPrice());
            }
            return o1.getUser().getCity().compareTo(o2.getUser().getCity());

        });
    }

    //        -отсортируйте список за наименованием товара, идентификатором заказа, и городом пользователя
    public void sort3(ArrayList<Order> arrayList) {
        arrayList.sort((Order o1, Order o2) ->
        {
            if (!o1.getItemName().equals(o2.getItemName())) {
                return (o1.getItemName().compareTo(o2.getItemName()));
            }
            if (o1.getId() != o2.getId()) {
                return (int) (o1.getId() - o2.getId());
            }
            return o1.getUser().getCity().compareTo(o2.getUser().getCity());
        });
    }

    //        -удалите дублированные данные со списка
    public void remove(ArrayList<Order> arrayList) {
        HashSet<Order> clearSet = new HashSet<>(arrayList);
        arrayList.clear();
        arrayList.addAll(clearSet);

    }

    //        -удалите объекты, где цена меньше 1500
    public void priceCompare(ArrayList<Order> arrayList, int price) {
        Predicate<Order> pricecComporator = p -> p.getPrice() < price;
        arrayList.removeIf(pricecComporator);
    }

    //        - разделите список на 2 списка - заказы в долларах и в гривнах
    public ArrayList<ArrayList<Order>> separateCurrency(ArrayList<Order> arrayList) {

        ArrayList<ArrayList<Order>> result = new ArrayList<ArrayList<Order>>();

        List<Order> usdList = arrayList.stream().filter(p -> p.getCurrency() == Currency.USD).collect(Collectors.toList());
        List<Order> eurList = arrayList.stream().filter(p -> p.getCurrency() == Currency.EUR).collect(Collectors.toList());

        result.add((ArrayList<Order>) usdList);
        result.add((ArrayList<Order>) eurList);

        return result;
    }


    //        - разделите список на столько списков, сколько уникальных городов в User
    public Map<String, ArrayList<Order>> separateCitys(List<Order> arrayList) {

        Map<String, ArrayList<Order>> result = new HashMap();

        List<String> unicCity = arrayList.stream().map(p -> p.getUser().getCity()).distinct().collect(Collectors.toList());

        for (String tt : unicCity) {
            List<Order> unicCityOrders = arrayList.stream().filter(p -> p.getUser().getCity().equals(tt)).collect(Collectors.toList());
            result.put(tt, (ArrayList<Order>) unicCityOrders);
        }

        return result;
    }

    //        -проверьте, содержит ли сет заказ, где фамилия пользователя - “Petrov”
    public Long petroV(ArrayList<Order> arrayList, String lastName) {
        return arrayList.stream().filter(p -> p.getUser().getLastName().equals(lastName)).count();
    }

    //        -удалите заказы в USD
    public void noUSD(ArrayList<Order> arrayList) {
        Predicate<Order> noUSDPredicate = p -> p.getCurrency() == Currency.USD;
        arrayList.removeIf(noUSDPredicate);
    }

}

