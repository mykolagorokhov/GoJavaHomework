package modul07.task073;

import modul04.Currency;
import modul07.task071.Order;
import modul07.task071.User;

import java.util.*;

/**
 * Created by MYKOLA.GOROKHOV on 10.03.2017.
 * TASK 3
 * Create Main class where you create 10 Orders with 10 Users and put it to the TreeSet.
 * You should create 8 unique and two duplicated Orders
 * - check if set contain Order where User’s lastName is - “Petrov”
 * - print Order with largest price using only one set method - get
 * - delete orders where currency is USD using Iterator
 */
public class Main {

    public static void main(String[] args) {
        User user1 = new User(1, "F1", "Petrov", "C1", 100);
        User user2 = new User(2, "F2", "L2", "C1", 100);
        User user3 = new User(3, "F3", "L3", "C1", 100);
        User user4 = new User(4, "F4", "L4", "C1", 100);
        User user5 = new User(5, "F5", "L5", "C1", 100);
        User user6 = new User(6, "F6", "Petrov", "C2", 100);
        User user7 = new User(7, "F7", "L7", "C2", 100);
        User user8 = new User(8, "F8", "L8", "C2", 100);
        User user9 = new User(9, "F9", "L9", "C2", 100);
        User user10 = new User(10, "F10", "L10", "C1", 100);

        Order order1 = new Order(1, 200, Currency.USD, "I1", "S1", user1);
        Order order2 = new Order(5, 300, Currency.EUR, "I1", "S1", user2);
        Order order3 = new Order(5, 400, Currency.USD, "I1", "S1", user3);
        Order order4 = new Order(1, 200, Currency.EUR, "I1", "S1", user1);
        Order order5 = new Order(5, 600, Currency.USD, "I1", "S1", user5);
        Order order6 = new Order(5, 700, Currency.USD, "I1", "S1", user6);
        Order order7 = new Order(5, 800, Currency.USD, "I1", "S1", user7);
        Order order8 = new Order(5, 900, Currency.EUR, "I1", "S1", user8);
        Order order9 = new Order(5, 3300, Currency.USD, "I1", "S1", user8);
        Order order10 = new Order(5, 2200, Currency.USD, "I1", "S1", user10);


        // сортирует ТОЛЬКО по цене
        Comparator<Order> orderStupidComporator = new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                if (!o1.equals(o2)) {
                    return o1.getPrice() - o2.getPrice();
                } else {
                    return 0;
                }
            }
        };

        TreeSet<Order> treeSet = new TreeSet<>(orderStupidComporator);

        treeSet.add(order1);
        treeSet.add(order2);
        treeSet.add(order3);
        treeSet.add(order4);
        treeSet.add(order5);
        treeSet.add(order6);
        treeSet.add(order7);
        treeSet.add(order8);
        treeSet.add(order9);
        treeSet.add(order10);

        System.out.println("\u001B[33m");
        System.out.println("Initial Set of Orders:");
        for (Order cL : treeSet) {
            System.out.println(cL.toString());
        }

//---проверьте, содержит ли сет заказ, где фамилия пользователя - “Petrov”
        final String LASTNAMELOOKFOR = "Petrov";

        TreeSet<String> lastName = new TreeSet<>();

        for (Order cL : treeSet) {
            lastName.add(cL.getUser().getLastName());
        }
        System.out.println("\u001B[31m");
        System.out.println("set contain Order where User’s lastName is - “" + LASTNAMELOOKFOR + "” : " + lastName.contains(LASTNAMELOOKFOR));

//---выведите заказ с наибольшей ценой, исспользуя только один сет-метод - get
        System.out.println("\u001B[32m");
        System.out.println("Order with largest price");
        System.out.println(treeSet.last());

//---удалите заказы, где валюта доллар, используя Iterator
        Iterator<Order> itr = treeSet.iterator();

        while (itr.hasNext()) {

            Order tempOrder = itr.next();
            if (tempOrder.getCurrency() == Currency.USD) {
                itr.remove();
            }
        }

        System.out.println("\u001B[33m");
        System.out.println("delete orders where currency is USD using Iterator:");
        for (Order cL : treeSet) {
            System.out.println(cL.toString());
        }

    }
}
