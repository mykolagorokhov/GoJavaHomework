package modul02.task024;

/**
 * Created by MYKOLA.GOROKHOV on 31.01.2017.
 * You need to write method which will fund (пополнение) balance of particular user.
 * Print name + balance after funding
 */
public class BalanceFound {
    public static void main(String[] args) {

        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        String ownerName = "Lane";
        double withdrawal = 100;

        BalanceFound balanceClass = new BalanceFound();

        balanceClass.NewBalanceCalculation(balances, ownerNames, ownerName, withdrawal);
    }

    public void NewBalanceCalculation(int[] balances, String[] ownerNames, String ownerName, double withdrawal) {
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
            System.out.println(ownerName + " " + (balances[ownerIndex] + withdrawal));
        }
    }

}
