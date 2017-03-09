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
public interface Citizen {
    void sayHello();

}
