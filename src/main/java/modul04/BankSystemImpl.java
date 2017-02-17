package modul04;

/**
 * Created by MYKOLA.GOROKHOV on 16.02.2017.
 */
public class BankSystemImpl implements BankSystem {

    public void withdrawOfUser(User user, int amount) {
        System.out.println(user.name + " balance before withdraw = " + user.balance);
        if ((user.bank).getLimitOfWithdrawal() > amount) {
            user.balance = user.balance - amount - amount * (user.bank).getCommission(amount) / 100;
            System.out.println(user.name + " balance after " + amount + " " + user.bank.getCurrency() + " withdraw = " + user.balance);
        } else {
            System.out.println("ERROR - LimitOfWithdrawal");
        }

    }

    public void fundUser(User user, int amount) {
        System.out.println(user.name + " balance before Funding = " + user.balance);
        if ((user.bank).getLimitOfFunding() < amount) {
            System.out.println("ERROR - LimitOfFunding");

        } else {
            user.balance += amount;
        }
        System.out.println(user.name + " balance after " + amount + " " + user.bank.getCurrency() + " Fund = " + user.balance);

    }

    public void transferMoney(User fromUser, User toUser, int amount) {
        System.out.println(fromUser.name + " balance = " + fromUser.balance);
        System.out.println(toUser.name + " balance = " + toUser.balance);
        System.out.println("amount = " + amount);
        if (fromUser.balance >= amount) {
            toUser.balance += amount;
            fromUser.balance -= amount;
            System.out.println("transferMoney performed:");
            System.out.println(fromUser.name + " balance = " + fromUser.balance);
            System.out.println(toUser.name + " balance = " + toUser.balance);
        } else {
            System.out.println("ERROR - transferMoney");
        }

    }

    public void paySalary(User user) {
        System.out.println(user.name + " balance before salary = " + user.balance);
        System.out.println(user.name + " monthsOfEmployment = " + user.monthsOfEmployment);
        user.balance += user.salary;
        user.monthsOfEmployment++;
        System.out.println("Salary was payed");
        System.out.println(user.name + " balance after salary = " + user.balance);
        System.out.println(user.name + " monthsOfEmployment = " + user.monthsOfEmployment);

    }
}
