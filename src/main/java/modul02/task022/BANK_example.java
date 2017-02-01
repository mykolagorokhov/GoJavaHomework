package modul02.task022;

/**
 * Created by MYKOLA.GOROKHOV on 31.01.2017.
 * Continue with BANK example
 * 2.1 Write method which withdraw money from account and takes commision 5% of the transaction.
 * Print OK + commision + balance after withdrawal. Print NO is withdrawal is not possible.
 */
public class BANK_example {
    public static void main(String[] args) {

        double balance = 100;
        double withdrawal = 99;

        BANK_example bankClass = new BANK_example();

        bankClass.calculation(balance, withdrawal);
    }

    public void calculation(double balance, double withdrawal) {
        double commision = withdrawal / 100 * 5;
        double remain = balance - withdrawal - commision;

        if (remain < 0) {
            System.out.println("NO");
        } else {
            System.out.println("OK " + commision + " " + remain);
        }
    }
}
