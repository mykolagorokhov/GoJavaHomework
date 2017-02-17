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
    static final double COMIITION_MIN = 5; // 5%
    static final double COMIITION_MAX = 10; //10%
    static final double DELIMITER = 1000;


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
        System.out.println("снимает деньги с баланса (Если можно) с комиссией 5%, если сумма < 1000 и комиссией 10% в других случаях");
        System.out.println("withdraw = "+ summ);

        int a;
        if (summ < DELIMITER) {
            a = (int) Math.round((summ * COMIITION_MIN / 100) + summ);
        } else {
            a = (int) Math.round((summ * COMIITION_MAX / 100) + summ);
        }

        if (a > this.balance) {
            System.out.println("Out of Balance. Balance not change");
        } else {
            balance = balance - a;
        }
        System.out.println("New ballance = " + this.getBalance());
    }

    public void companyNameLenght() {//companyNameLenght - вычисляет длину имя компании
        System.out.println("companyNameLenght - вычисляет длину имя компании");
        System.out.println("companyNameLenght = " + this.getCompanyName().length());
    }

    public void monthIncreaser(int addMonth) { // - увеличивает monthsOfEmployment на addMonth
        System.out.println("увеличивает monthsOfEmployment на addMonth");
        System.out.println("addMonth = "+addMonth);
        this.setMonthsOfEmployment(this.getMonthsOfEmployment() + addMonth);
        System.out.println("monthIncreaser = " + this.getMonthsOfEmployment());
    }

    //******************MAIN******************************
    public static void main(String[] args) {
        User user1 = new User("User1", 10000, 10, "Google", 20, "USD");

        System.out.println("-------PaySalary-----");
        System.out.println("BalanceBefore = " + user1.getBalance());
        System.out.println("Salary = " + user1.salary);
        user1.paySalary();
        System.out.println();

        System.out.println("-------withdraw-----");
        System.out.println("BalanceBefore = " + user1.getBalance());
        user1.withdraw(101);
        System.out.println();

        System.out.println("-------companyNameLenght-----");
        System.out.println("CompanyName = " + user1.companyName);
        user1.companyNameLenght();
        System.out.println();

        System.out.println("-------monthIncreaser-----");
        System.out.println("MonthBefore = " + user1.getMonthsOfEmployment());
        user1.monthIncreaser(2);
    }
    //******************MAIN******************************

}
