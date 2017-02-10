package modul02.task023;

/**
 * Created by MYKOLA.GOROKHOV on 31.01.2017.
 * <p>
 * You need to write method which withdraw money of particular account owner if he/she can.
 * Print name + NO of withdrawal fs not possible and name + sum of withdrawal + balance after withdrawal in other case.
 * Commision is 5% for all cases.
 */


public class WithdrawMoney {
    public static void main(String[] args) {

        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        String ownerName = "Oww";
        double withdrawal = 100;

        WithdrawMoney withdrawClass = new WithdrawMoney();

        withdrawClass.WithdrawPrinting(balances, ownerNames, ownerName, withdrawal);
    }

    public void WithdrawPrinting(int[] balances, String[] ownerNames, String ownerName, double withdrawal) {
        int ownerIndex = -1;

        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i] == ownerName) {
                ownerIndex = i;
                break;
            }
        }
        if (ownerIndex == -1) {
            System.out.println("Wrong Name");
        } else {
            double commision = withdrawal / 100 * 5;
            double remain = balances[ownerIndex] - withdrawal - commision;

            if (remain < 0) {
                System.out.println(ownerNames[ownerIndex] + " NO");
            } else {
                System.out.println(ownerNames[ownerIndex] + " " + withdrawal + " " + remain);
            }
        }
    }
}
