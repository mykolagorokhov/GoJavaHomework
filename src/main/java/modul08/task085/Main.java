package modul08.task085;

import modul08.task081.Country;
import modul08.task082.Food;
import modul08.task084.ManageSystem;

/**
 * Created by MYKOLA.GOROKHOV on 24.03.2017.
 * ДЗ №08.5
 * <p>
 * Проверьте работу Manage System в классе Main (на примере 5+ продуктов).
 */
public class Main {
    public static void main(String[] args) {

        Food z0 = new Food("name5", Country.UKRAINE, 100);
        Food z1 = new Food("name4", Country.UKRAINE, 100);
        Food z2 = new Food("name3", Country.UKRAINE, 100);
        Food z3 = new Food("name1", Country.UKRAINE, 300);
        Food z4 = new Food("name4", Country.UKRAINE, 100);
        Food z5 = new Food("name5", Country.UKRAINE, 500);

        ManageSystem ms = new ManageSystem();

        ms.save(z1, 700);
        ms.save(z2, 600);
        ms.save(z0, 500);
        ms.save(z3, 400);
        ms.save(z4, 300);
        ms.save(z5, 200);

        ms.delete(z2);
        ms.save(z2);

        ms.deleteById(-2044102032);
        System.out.println();
        System.out.println("get by ID");
        ms.get(-2044100310);
        System.out.println();
        System.out.println("getPrice ");
        ms.getPrice(z3);
        System.out.println();
        System.out.println("getProducts \n" + ms.getProducts().toString());
        System.out.println();
        System.out.println("getPrices \n" + ms.getPrices().toString());
        System.out.println();
        System.out.println("printProductsSortedByName");
        ms.printProductsSortedByName();
        System.out.println();
        System.out.println("printProductsSortedByPrice");
        ms.printProductsSortedByPrice();

    }
}
