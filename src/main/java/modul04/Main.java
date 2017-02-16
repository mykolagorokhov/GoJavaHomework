package modul04;

/**
 * Created by MYKOLA.GOROKHOV on 16.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        USBank usBank1 = new USBank
                (1, "USA", Currency.USD, 2, 100, 1, 1000000);
        EUBank euBank1 = new EUBank
                (2, "Ukraine", Currency.EUR, 2, 100, 1, 1000000);
        ChinaBank chinaBank1 = new ChinaBank
                (3, "China", Currency.USD, 2, 100, 1, 1000000);

        User user_1_USBank = new User(1, "N1", 2000, 3, "CN_N1", 100, usBank1);
        User user_2_USBank = new User(2, "N2", 2000, 3, "CN_N2", 100, usBank1);

        User user_1_EUBank = new User(3, "N3", 2000, 3, "CN_N3", 100, euBank1);
        User user_2_EUBank = new User(4, "N4", 2000, 3, "CN_N4", 100, euBank1);

        User user_1_ChinaBank = new User(5, "N5", 2000, 3, "CN_N5", 100, chinaBank1);
        User user_2_ChinaBank = new User(6, "N6", 2000, 3, "CN_N6", 100, chinaBank1);


        System.out.println(user_1_USBank.toString());
        System.out.println(user_2_USBank.toString());
        System.out.println(user_1_EUBank.toString());
        System.out.println(user_2_EUBank.toString());
        System.out.println(user_1_ChinaBank.toString());
        System.out.println(user_2_ChinaBank.toString());

        System.out.println();


    }
}
