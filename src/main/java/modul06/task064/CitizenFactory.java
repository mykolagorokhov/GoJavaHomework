package modul06.task064;

/**
 * Created by MYKOLA.GOROKHOV on 08.03.2017.
 * <p>
 * Create interface Citizen with method sayHello ().
 * <p>
 * Create a class-factory CitizenFactory, which statically generates сcitizens of different countries.
 * <p>
 * Use the following nested sub-classes:
 * <p>
 * - Englishman
 * - Chinese
 * - Russian
 * - Italian
 * <p>
 * Each of the sub-class implements the interface Citizen. sayHello () method has to display "Hello" phrase in different languages. Make sure that the nested classes are not available outside the class-factory.
 * <p>
 * Create CitizenMain class with a main method, where check how CitizenFactory works.
 */
public class CitizenFactory {

    public static Citizen createNewCitizen(String contry) {
        if (contry == "Englishman") {
            Citizen newCitizen = new Englishman();
            newCitizen.sayHello();
            return newCitizen;
        }
        if (contry == "Chinese") {
            Citizen newCitizen = new Chinese();
            newCitizen.sayHello();
            return newCitizen;
        }
        if (contry == "Russian") {
            Citizen newCitizen = new Russian();
            newCitizen.sayHello();
            return newCitizen;
        }
        if (contry == "Italian") {
            Citizen newCitizen = new Italian();
            newCitizen.sayHello();
            return newCitizen;
        }
        System.out.println("Wrong country");
        return null;
    }

    public static class Englishman implements Citizen {
        public void sayHello() {
            System.out.println("Hello");
        }
    }

    public static class Chinese implements Citizen {
        public void sayHello() {
            System.out.println("嗨");
        }
    }

    public static class Russian implements Citizen {
        public void sayHello() {
            System.out.println("Привет");
        }
    }

    public static class Italian implements Citizen {
        public void sayHello() {
            System.out.println("ciao");
        }
    }


}
