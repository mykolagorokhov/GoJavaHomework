package modul03.task034;

/**
 * Created by MYKOLA.GOROKHOV on 10.02.2017.
 * <p>
 * Create User class with the following fields: String name, int balance, int monthsOfEmployment,
 * String companyName, int salary, String currency.
 * <p>
 * Create getters and setters and constructor with all fileds.
 * <p>
 * Write methods:
 * <p>
 * void paySalary() -  that add salary to the balance of the user
 * withdraw(int summ) - takes money from the balance with 5% commision if summ < 1000 and 10% commision in other cases
 * companyNameLenght - calculates name of the company name
 * monthIncreaser(int addMonth) - increase monthsOfEmployment by addMonth
 */
public class User {
    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;


    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    void paySalary() { //- добавляет заработную плату к балансу пользователя
        System.out.println("добавляет заработную плату к балансу пользователя");
        this.setBalance(getSalary() + this.getBalance());
        System.out.println("New balance =" + this.getBalance());
    }

    public void withdraw(int summ) {
        //- снимает деньги с баланса с комиссией 5%, если сумма < 1000 и комиссией 10% в других случаях
        if (summ < 1000) {
            this.setBalance((int) Math.round(this.getBalance() - (summ * 0.05)) - summ);
        } else {
            this.setBalance((int) Math.round(this.getBalance() - (summ * 0.1)) - summ);
        }

        System.out.println("снимает деньги с баланса с комиссией 5%, если сумма < 1000 и комиссией 10% в других случаях");
        System.out.println("New ballance = " + this.getBalance());
    }

    public void companyNameLenght() {//companyNameLenght - вычисляет длину имя компании
        System.out.println("companyNameLenght - вычисляет длину имя компании");
        System.out.println("companyNameLenght = " + this.getCompanyName().length());
    }

    public void monthIncreaser(int addMonth) { // - увеличивает monthsOfEmployment на addMonth
        System.out.println("увеличивает monthsOfEmployment на addMonth");
        this.setMonthsOfEmployment(this.getMonthsOfEmployment() + addMonth);
        System.out.println("monthIncreaser = " + this.getMonthsOfEmployment());
    }

    //******************MAIN******************************
    public static void main(String[] args) {
        User user1 = new User("User1", 10000, 10, "Google", 20, "USD");

        System.out.println("-------PaySalary-----");
        user1.paySalary();
        System.out.println();

        System.out.println("-------withdraw-----");
        user1.withdraw(1001);
        System.out.println();

        System.out.println("-------companyNameLenght-----");
        user1.companyNameLenght();
        System.out.println();

        System.out.println("-------monthIncreaser-----");
        user1.monthIncreaser(2);
    }
    //******************MAIN******************************

}
