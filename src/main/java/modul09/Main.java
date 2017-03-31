package modul09;

import modul04.Currency;
import modul07.task071.Order;
import modul07.task071.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MYKOLA.GOROKHOV on 30.03.2017.
 * <p>
 * <p>
 * Определите каждую подзадачу в отдельный метод.
 * Создайте класс Main и протестируйте каждый метод на тестовых данных.
 */
public class Main {
    public static void main(String[] args) {
        User user1 = new User(1, "F1", "L1", "C1", 100);
        User user2 = new User(2, "F2", "L2", "C1", 100);
        User user3 = new User(3, "F3", "L3", "C1", 100);
        User user4 = new User(4, "F4", "L4", "C1", 100);
        User user5 = new User(5, "F5", "L5", "C1", 100);
        User user6 = new User(6, "F6", "L6", "C2", 100);
        User user7 = new User(7, "F7", "L7", "C2", 100);
        User user8 = new User(8, "F8", "L8", "AAAA", 100);
        User user9 = new User(9, "F9", "L9", "C2", 100);
        User user10 = new User(10, "F10", "L10", "C1", 100);

        Order order1 = new Order(1, 200, Currency.USD, "I1", "S1", user1);
        Order order2 = new Order(2, 300, Currency.USD, "I9", "S2", user2);
        Order order3 = new Order(3, 400, Currency.USD, "I3", "S2", user3);
        Order order4 = new Order(4, 500, Currency.USD, "I7", "S2", user4);
        Order order5 = new Order(5, 900, Currency.EUR, "I6", "S2", user5);
        Order order6 = new Order(6, 700, Currency.EUR, "I5", "S1", user6);
        Order order7 = new Order(1, 200, Currency.USD, "I1", "S1", user1);
        Order order8 = new Order(8, 1200, Currency.USD, "I3", "S1", user8);
        Order order9 = new Order(9, 2200, Currency.USD, "I2", "S1", user9);
        Order order10 = new Order(10, 2200, Currency.USD, "I1", "S2", user10);

        List<Order> collectionList = new ArrayList<>();

        collectionList.add(order1);
        collectionList.add(order2);
        collectionList.add(order3);
        collectionList.add(order4);
        collectionList.add(order5);
        collectionList.add(order6);
        collectionList.add(order7);
        collectionList.add(order8);
        collectionList.add(order9);
        collectionList.add(order10);

        System.out.println("\u001B[33m");
        System.out.println("Initial list of Orders:");
        for (Order cL : collectionList) {
            System.out.println(cL.toString());
        }

        Java8Instruments JI = new Java8Instruments();

//        -отсортируйте список за ценой заказа по убыванию
JI.sort1(collectionList);

        System.out.println("\u001B[34m");
        System.out.println("отсортируйте список за ценой заказа по убыванию:");
        for (Order cL : collectionList) {
            System.out.println(cL.toString());
        }
//        -отсортируйте список за ценой заказа по возрастанию и за городом пользователя
        //JI.sort2(collectionList);

        System.out.println("\u001B[35m");
        System.out.println("отсортируйте список за ценой заказа по возрастанию и за городом пользователя:");
        for (Order cL : collectionList) {
            System.out.println(cL.toString());
        }
//        -отсортируйте список за наименованием товара, идентификатором заказа, и городом пользователя

//        -удалите дублированные данные со списка

//        -удалите объекты, где цена меньше 1500

//        - разделите список на 2 списка - заказы в долларах и в гривнах

//        - разделите список на столько списков, сколько уникальных городов в User

//        -проверьте, содержит ли сет заказ, где фамилия пользователя - “Petrov”

//        -удалите заказы в USD


    }

}
