package modul07.task072;

import modul04.Currency;
import modul07.task071.Order;
import modul07.task071.User;

import java.util.*;

/**
 * Created by MYKOLA.GOROKHOV on 10.03.2017.
 * Create Main class where you create 10 Orders with 10 Users and put it to the List
 * <p>
 * - sort list by Order price in decrease order
 * - sort list by Order price in increase order AND User city
 * - sort list by Order itemName AND ShopIdentificator AND User city
 * <p>
 * Extra (optional):
 * <p>
 * - delete duplicates from the list
 * - delete items where price less than 1500
 * - separate list for two list - orders in USD and UAH
 * - separate list for as many lists as many unique cities are in User
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

//---sort list by Order price in decrease order--------------------------
        System.out.println("\u001B[31m");
        System.out.println("sort list by Order price in decrease order");
        collectionList.sort(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o2.getPrice() - o1.getPrice();
            }
        });

        for (Order cL : collectionList) {
            System.out.println(cL.toString());
        }

//---sort list by Order price in increase order AND User city---------------------------------------
        System.out.println("\u001B[32m");
        System.out.println("sort list by Order price in increase order AND User city");

        Comparator<Order> sortByPriceCity = new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                if (o1.getPrice() != o2.getPrice()) {
                    return o1.getPrice() - o2.getPrice();
                }
                return o1.getUser().getCity().compareTo(o2.getUser().getCity());

            }
        };

        collectionList.sort(sortByPriceCity);
        for (Order cL : collectionList) {
            System.out.println(cL.toString());
        }

        //---sort list by Order itemName AND ShopIdentificator AND User city------------------------------

        System.out.println("\u001B[33m");
        System.out.println("sort list by Order itemName AND ShopIdentificator AND User city");

        Comparator<Order> sortByItemShopCity = new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                if (o1.getItemName() != o2.getItemName()) {
                    return o1.getItemName().compareTo(o2.getItemName());
                }
                if (o1.getShopIdentificator() != o2.getShopIdentificator()) {
                    return o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
                }
                return o1.getUser().getCity().compareTo(o2.getUser().getCity());
            }
        };

        collectionList.sort(sortByItemShopCity);
        for (Order cL : collectionList) {
            System.out.println(cL.toString());
        }
//+============================================================
//       Extra (optional):
//
//        - delete duplicates from the list
//        - delete items where price less than 1500
//        - separate list for two list - orders in USD and UAH
//        - separate list for as many lists as many unique cities are in User
//+============================================================

//---удалите дублированные данные со списка---------------------
        HashSet<Order> setFreeFromDuplicates = new HashSet<>(collectionList);

        System.out.println("\u001B[31m");
        System.out.println("Set Free From Duplicates : ");
        for (Order sFFD : setFreeFromDuplicates) {
            System.out.println(sFFD.toString());
        }

//---разделите список на 2 списка - заказы в долларах и в гривнах---------------

        List<Order> collectionListUSD = new ArrayList<>();
        List<Order> collectionListEU = new ArrayList<>();
        for (int i = 0; i < collectionList.size(); i++) {
            if (collectionList.get(i).getCurrency() == Currency.USD) {
                collectionListUSD.add(collectionList.get(i));
            }
            if (collectionList.get(i).getCurrency() == Currency.EUR) {
                collectionListEU.add(collectionList.get(i));
            }
        }
        System.out.println("\u001B[33m");
        System.out.println("list with USD:");

        for (Order cL : collectionListUSD) {
            System.out.println(cL.toString());
        }
        System.out.println("\u001B[31m");
        System.out.println("list with EU:");

        for (Order cL : collectionListEU) {
            System.out.println(cL.toString());
        }


//---разделите список на столько списков, сколько уникальных городов в User------------
        collectionList.sort(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o1.getUser().getCity().compareTo(o2.getUser().getCity());
            }
        });



        System.out.println("\u001B[33m");
        System.out.println("sorted Orders:");
        for (Order cL : collectionList) {
            System.out.println(cL.toString());
        }





        List<List<Order>> arr = new ArrayList<>();
        List<Order> tempOrder = new ArrayList<>();
        tempOrder.add(collectionList.get(0));

        int count = 0;
        for (int i = 1; i < collectionList.size(); i++) {
            //НЕ считаем уникальные города

            if (!collectionList.get(i).getUser().getCity().equals(collectionList.get(i - 1).getUser().getCity())) {
                arr.add(tempOrder);
                tempOrder.clear();
                tempOrder.add(collectionList.get(i));
            } else {
                tempOrder.add(collectionList.get(i));
            }

        }
        System.out.println("\u001B[32m");
        System.out.println("separate list for as many lists as many unique cities are in User:");
        System.out.println(count);
        System.out.println(arr.get(0).toString());


//---удалите объекты, где цена меньше 1500-------------------------
        for (int i = collectionList.size() - 1; i >= 0; i--) {
            if (collectionList.get(i).getPrice() < 1500) {
                collectionList.remove(i);
            }
        }
        System.out.println("\u001B[33m");
        System.out.println("delete items where price less than 1500");
        for (Order cL : collectionList) {
            System.out.println(cL.toString());
        }
    }
}
