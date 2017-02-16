package modul04;

/**
 * Created by MYKOLA.GOROKHOV on 16.02.2017.
 */
public class USBank extends Bank {

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }


//    USBank: лимит снятия = 1000, если валюта - USD и 1200, если валюта - EUR
//    лимит пополнения - 10000, если EUR, и нет лимита, если USD
//    месячная ставка - 1% на USD и 2% на EUR
//    комиссия 5%, если USD и до 1000, 7%, если USD и больше 1000
//            6%, если EUR и до 1000 и 8%, если EUR и больше 1000

    //------------------------------------

    int getLimitOfWithdrawal() {
        if (currency == Currency.USD) {
            return 1000;
        } else {
            return 1200;
        }

    }

    int getLimitOfFunding() {
        if (currency == Currency.USD) {
            return Integer.MAX_VALUE;
        } else {
            return 10000;
        }
    }

    int getMonthlyRate() {
        if (currency == Currency.USD) {
            return 1;
        } else {
            return 2;
        }
    }

    int getCommission(int summ) {

        if (currency == Currency.USD) {
            if (summ < 1000){return 5;}else{return 7;}
        } else {
            if (summ < 1000){return 6;}else{return 8;}        }
    }

    double  moneyPaidMonthlyForSalary() {
        return avrSalaryOfEmployee*numberOfEmployees;
    }

// ----------------------------------------------------







}
