package modul09;

import modul07.task071.Order;

import java.util.*;

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

//        -удалите объекты, где цена меньше 1500

//        - разделите список на 2 списка - заказы в долларах и в гривнах

//        - разделите список на столько списков, сколько уникальных городов в User

//        -проверьте, содержит ли сет заказ, где фамилия пользователя - “Petrov”

//        -удалите заказы в USD

}



