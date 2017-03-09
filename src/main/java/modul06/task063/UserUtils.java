package modul06.task063;


import java.util.Arrays;

/**
 * Created by MYKOLA.GOROKHOV on 04.03.2017.
 * <p>
 * Create сlass UserUtils with following methods
 * User[] uniqueUsers(User[] users) – finds and returns unique users (users are equal when all their field are equal)
 * User[] usersWithContitionalBalance(User[] users, int balance) - finds and returns the user whose balance is equal to given balance
 * User[] paySalaryToUsers(User[] users) – pay salary to each user balance
 * long[] getUsersId(User[] users) - returns an array of user IDs
 * User[] deleteEmptyUsers(User[] users) – finds and removes empty elements of the array (as a result returns a new array with smaller size)
 * <p>
 * Make sure paySalaryToUsers and getUsersId methods can’t be overriden in other classes.
 * <p>
 * Create UsersMain class with main method where create some test users and demonstrate how each method from UserUtils works.
 */
public class UserUtils {

    public User[] uniqueUsers(User[] users)
    //users are equal when all their field are equal
    {
        User[] uniqueUsers = new User[users.length];

        int count = 1;
        uniqueUsers[0] = users[0];
        boolean flag = false;

        for (int i = 1; i < users.length; i++) {
            flag = false;
            for (int j = 0; j < count; j++) {
                if (users[i].equals(uniqueUsers[j])) {
                    flag = true;
                }
            }
            if (!flag) {
                count++;
                uniqueUsers[count - 1] = users[i];
            }
        }
        uniqueUsers = Arrays.copyOf(uniqueUsers, count);
        System.out.println("uniqueUsers:");
        for (int i = 0; i < uniqueUsers.length; i++) {
            System.out.println(uniqueUsers[i].toString());
        }
        return users;
    }


    public User[] usersWithContitionalBalance(User[] users, int balance)
    //user’s balance == balance
    {
        System.out.println("usersWithContitionalBalance");
        User[] usersBalance = new User[users.length];
        int count = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getBalance() == balance) {
                usersBalance[count] = users[i];
                count++;
            }
        }
        if (usersBalance[0] == null) {
            System.out.println("User with " + balance + " on balance not found");
        } else {
            usersBalance = Arrays.copyOf(usersBalance, count);
            System.out.println("User with " + balance + " on balance was found");
            for (int i = 0; i < usersBalance.length; i++) {
                System.out.println(usersBalance[i].toString());
            }
        }
        return usersBalance;
    }

    public final User[] paySalaryToUsers(User[] users) {
        User[] newUsers = new User[users.length];
        System.out.println("paySalaryToUsers");
        for (int i = 0; i < users.length; i++) {
            newUsers[i] = new User(users[i].getId(), users[i].getFirstName(), users[i].getLastName(), users[i].getSalary(),
                    users[i].getBalance() + users[i].getSalary());

            System.out.println("Salary was payed: " + newUsers[i].toString());
        }
        return newUsers;
    }


    public final long[] getUsersId(User[] users) {
        long[] id = new long[users.length];
        System.out.println("getUsersId");
        for (int i = 0; i < users.length; i++) {
            id[i] = users[i].getId();
            System.out.println("ID: " + id[i]);
        }
        return id;
    }

    public User[] deleteEmptyUsers(User[] users) {
        User[] clearedUsers = new User[users.length];
        int count = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                clearedUsers[count] = users[i];
                count++;
            }
        }
        System.out.println("deleteEmptyUsers");
        for (int i = 0; i < count; i++) {
            System.out.println(clearedUsers[i].toString());
        }
        clearedUsers = Arrays.copyOf(clearedUsers, count);
        return clearedUsers;
    }

}
