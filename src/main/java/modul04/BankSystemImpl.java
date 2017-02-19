package modul04;

/**
 * Created by MYKOLA.GOROKHOV on 16.02.2017.
 */
public class BankSystemImpl implements BankSystem {

    public void withdrawOfUser(User user, int amount) {
        System.out.println(user.getName() + " balance before withdraw = " + user.getBalance());
        if (user.getBank().getLimitOfWithdrawal() > amount) {
            user.setBalance(user.getBalance() - amount - amount * user.getBank().getCommission(amount) / 100);
            System.out.println(user.getName() + " balance after " + amount + " " + user.getBank().getCurrency() + " withdraw = " + user.getBalance());
        } else {
            System.out.println("ERROR - LimitOfWithdrawal");
        }
    }

    public void fundUser(User user, int amount) {
        System.out.println(user.getName() + " balance before Funding = " + user.getBalance());
        if (user.getBank().getLimitOfFunding() < amount) {
            System.out.println("ERROR - LimitOfFunding");
        } else {
            user.setBalance(user.getBalance() + amount);
        }
        System.out.println(user.getName() + " balance after " + amount + " " + user.getBank().getCurrency() + " Fund = " + user.getBalance());
    }

    public void transferMoney(User fromUser, User toUser, int amount) {
        System.out.println(fromUser.getName() + " balance = " + fromUser.getBalance());
        System.out.println(toUser.getName() + " balance = " + toUser.getBalance());
        System.out.println("amount = " + amount);
        if (fromUser.getBalance() >= amount) {
            toUser.setBalance(toUser.getBalance() + amount);
            fromUser.setBalance(fromUser.getBalance() - amount);
            System.out.println("transferMoney performed:");
            System.out.println(fromUser.getName() + " balance = " + fromUser.getBalance());
            System.out.println(toUser.getName() + " balance = " + toUser.getBalance());
        } else {
            System.out.println("ERROR - transferMoney");
        }
    }

    public void paySalary(User user) {
        System.out.println(user.getName() + " balance before salary = " + user.getBalance());
        System.out.println(user.getName() + " monthsOfEmployment = " + user.getMonthsOfEmployment());
        user.setBalance(user.getBalance() + user.getSalary());
        user.setMonthsOfEmployment(user.getMonthsOfEmployment() + 1);
        System.out.println("Salary was payed");
        System.out.println(user.getName() + " balance after salary = " + user.getBalance());
        System.out.println(user.getName() + " monthsOfEmployment = " + user.getMonthsOfEmployment());

    }
}
