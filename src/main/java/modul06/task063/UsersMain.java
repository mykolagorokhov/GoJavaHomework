package modul06.task063;

/**
 * Created by MYKOLA.GOROKHOV on 04.03.2017.
 */
public class UsersMain {
    public static void main(String[] args) {
//        User Utils Test
//--------------------------------------------------

    //    UserUtils userUtils = new UserUtils();
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
        users = UserUtils.deleteEmptyUsers(users);

        System.out.println("\u001B[32m");
        UserUtils.uniqueUsers(users);
        System.out.println("\u001B[33m");
        UserUtils.usersWithContitionalBalance(users, 50);
        System.out.println("\u001B[31m");
        UserUtils.paySalaryToUsers(users);

        System.out.println("\u001B[32m");
        UserUtils.getUsersId(users);


    }// END MAIN METHOD
}
