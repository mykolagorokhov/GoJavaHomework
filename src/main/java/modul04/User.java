package modul04;

/**
 * Created by MYKOLA.GOROKHOV on 16.02.2017.
 */
public class User {

    private long id;
    private String name;
    private double balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private Bank bank;

    public User(long id, String name, double balance, int monthsOfEmployment, String companyName, int salary, Bank bank) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.bank = bank;
    }

    @Override
    public String toString() {
        return "ID : '" + this.id +
                "', Name: '" + this.name +
                "', Balance: '" + this.balance +
                "', Months Of Employment: '" + this.monthsOfEmployment +
                "', Company Name: '" + this.companyName +
                "', Salary: '" + this.salary +
                "', Bank: '" + this.bank.bankCountry + "'";

    }


}
