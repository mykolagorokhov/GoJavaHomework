package modul04;

/**
 * Created by MYKOLA.GOROKHOV on 16.02.2017.
 */
public class EUBank extends Bank {

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }
//    EUBank: лимит снятия = 2000, если валюта - USD и 2200, если EUR
//    лимит пополнения - 20000, если EUR и 10000, если USD
//    месячная ставка - 0% на USD и 1% на EUR
//    комиссия 5%, если USD и до 1000, 7%, если USD и больше 1000
//            2%, если EUR и до 1000 и 4%, если EUR и больше 1000

    //------------------------------------

    int getLimitOfWithdrawal() {
        if (currency == Currency.USD) {
            return 2000;
        } else {
            return 2200;
        }

    }

    int getLimitOfFunding() {
        if (currency == Currency.USD) {
            return 10000;
        } else {
            return 20000;
        }
    }

    int getMonthlyRate() {
        if (currency == Currency.USD) {
            return 0;
        } else {
            return 1;
        }


    }

    int getCommission(int summ) {

        if (currency == Currency.USD) {
            if (summ < 1000){return 5;}else{return 7;}
        } else {
            if (summ < 1000){return 2;}else{return 4;}        }
    }

    double  moneyPaidMonthlyForSalary() {
        return avrSalaryOfEmployee*numberOfEmployees;
    }

// ----------------------------------------------------



}
