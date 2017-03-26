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

        Food z0 = new Food("name", Country.UKRAINE, 100);
        System.out.println(z0);

        Food z1 = new Food("name", Country.UKRAINE, 100);
        System.out.println(z1);

        Food z2 = new Food("name", Country.UKRAINE, 100);
        System.out.println(z2);

        // ManageSystem<Country> ms = new ManageSystem<Country>();
        ManageSystem<Food> ms = new ManageSystem<Food>();
        //    ms.save(Country.BRASIL,100);
        ms.save(z0, 100);


    }
}
