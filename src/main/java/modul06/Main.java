package modul06;

/**
 * Created by MYKOLA.GOROKHOV on 04.03.2017.
 */
public class Main {
    public static void main(String[] args) {
//    ArraysUtils Test-------------------
        int[] array = {-11, 22, -33, -44, -55, -66, -77, -88, -99, -101};
        ArraysUtils arraysUtils = new ArraysUtils();

        System.out.println("\u001B[31m");
        arraysUtils.sum(array);
        System.out.println("\u001B[32m");
        arraysUtils.min(array);
        System.out.println("\u001B[33m");
        arraysUtils.max(array);
        System.out.println("\u001B[31m");
        arraysUtils.maxPositive(array);
        System.out.println("\u001B[32m");
        arraysUtils.multiplication(array);
        System.out.println("\u001B[33m");
        arraysUtils.modulus(array);
        System.out.println("\u001B[31m");
        arraysUtils.secondLargest(array);
        System.out.println("\u001B[32m");

        arraysUtils.reverse(array);
        System.out.println("\u001B[33m");
        arraysUtils.findEvenElements(array);
//--------------------------------------------------
//        User Utils Test
//--------------------------------------------------

        UserUtils userUtils = new UserUtils();
        User[] users = new User[10];
        users[0] = new User(1, "F1", "L1", 100, 100);
        users[1] = new User(2, "F2", "L2", 100, 50);
        // users[2] = new User(3, "F3", "L3", 100, 100);
        users[3] = new User(6, "F6", "L6", 100, 100);
        users[4] = new User(5, "F5", "L5", 100, 100);
        users[5] = new User(6, "F6", "L6", 100, 50);
        users[6] = new User(10, "F10", "L10", 100, 100);
        users[7] = new User(8, "F8", "L8", 100, 100);
        users[8] = new User(9, "F9", "L9", 100, 100);
        users[9] = new User(10, "F10", "L10", 100, 100);


        System.out.println("\u001B[32m");
        System.out.println("Initial Users:");
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                System.out.println("NULL");
            } else {
                System.out.println(users[i].toString());
            }
        }

        System.out.println("\u001B[31m");
        users = userUtils.deleteEmptyUsers(users);

        System.out.println("\u001B[32m");
        userUtils.uniqueUsers(users);
        System.out.println("\u001B[33m");
        userUtils.usersWithContitionalBalance(users, 50);
        System.out.println("\u001B[31m");
        userUtils.paySalaryToUsers(users);

        System.out.println("\u001B[32m");
        userUtils.getUsersId(users);
//----------------------------------------------
        //Factory Test
        System.out.println("\u001B[31m");
        System.out.println("Factory Test : \u001B[31m");
        CitizenFactory test = new CitizenFactory();
        test.createNewCitizen("e");
        CitizenFactory test1 = new CitizenFactory();
        test1.createNewCitizen("c");
        CitizenFactory test2 = new CitizenFactory();
        test2.createNewCitizen("r");
        CitizenFactory test3 = new CitizenFactory();
        test3.createNewCitizen("i");

        //----------------------------------------------
    }// END MAIN METHOD
}
