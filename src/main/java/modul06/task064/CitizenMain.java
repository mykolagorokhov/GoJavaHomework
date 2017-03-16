package modul06.task064;


import java.util.Scanner;

/**
 * Created by MYKOLA.GOROKHOV on 04.03.2017.
 */
public class CitizenMain {
    public static void main(String[] args) {
        //Factory Test
        //---------------------------------------------
        System.out.println("Factory Test :");
        CitizenFactory test = new CitizenFactory();
        test.createNewCitizen("Englishman");
        CitizenFactory test1 = new CitizenFactory();
        test1.createNewCitizen("Chinese");
        CitizenFactory test2 = new CitizenFactory();
        test2.createNewCitizen("Russian");
        CitizenFactory test3 = new CitizenFactory();
        test3.createNewCitizen("Italian");
        CitizenFactory test4 = new CitizenFactory();
        test4.createNewCitizen("some country");

        System.out.println("Enter country: ");
        Scanner scanner = new Scanner(System.in);
        String test5 = scanner.nextLine();
        Citizen citizen = CitizenFactory.createNewCitizen(test5);


    }// END MAIN METHOD

}
