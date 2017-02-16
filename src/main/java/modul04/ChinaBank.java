package modul04;

/**
 * Created by MYKOLA.GOROKHOV on 16.02.2017.
 */
public class ChinaBank extends Bank {


    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

//    ChinaBank: лимит снятия = 100, если валюта - USD и 150, если EUR
//    лимит пополнения - 5000, если EUR и 10000, если USD
//    месячная ставка - 1% на USD и 0% на EUR
//    комиссия 3%, если USD и до 1000, 5%, если USD и больше 1000
//            10%, если EUR и до 1000 и 11%, если EUR и больше 1000

    //------------------------------------

    int getLimitOfWithdrawal() {
        if (currency == Currency.USD) {
            return 100;
        } else {
            return 150;
        }

    }

    int getLimitOfFunding() {
        if (currency == Currency.USD) {
            return 10000;
        } else {
            return 5000;
        }
    }

    int getMonthlyRate() {
        if (currency == Currency.USD) {
            return 1;
        } else {
            return 0;
        }


    }

    int getCommission(int summ) {

        if (currency == Currency.USD) {
            if (summ < 1000){return 3;}else{return 5;}
        } else {
            if (summ < 1000){return 10;}else{return 11;}        }
    }

    double  moneyPaidMonthlyForSalary() {
        return avrSalaryOfEmployee*numberOfEmployees;
    }

// ----------------------------------------------------

}
