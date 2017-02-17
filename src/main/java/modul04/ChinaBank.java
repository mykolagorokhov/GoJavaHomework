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


    public final int WITHDRAWALLIMIT_USD = 100;
    public final int WITHDRAWALLIMIT_EUR = 150;

    public final int FUNDINGLIMIT_USD = 10000;
    public final int FUNDINGLIMIT_EUR = 5000;

    public final int MONTHLYRATE_USD = 1;
    public final int MONTHLYRATE_EUR = 0;

    public final int COMISSION_MIN_USD = 3;
    public final int COMISSION_MAX_USD = 5;

    public final int COMISSION_MIN_EUR = 10;
    public final int COMISSION_MAX_EUR = 11;
    public final int COMISSION_LIM = 1000;

    // ---------------------------------------------------
    int getLimitOfWithdrawal() {
        if (currency == Currency.USD) {
            return WITHDRAWALLIMIT_USD;
        } else {
            return WITHDRAWALLIMIT_EUR;
        }
    }


    int getLimitOfFunding() {
        if (currency == Currency.USD) {
            return FUNDINGLIMIT_USD;
        } else {
            return FUNDINGLIMIT_EUR;
        }
    }

    int getMonthlyRate() {
        if (currency == Currency.USD) {
            return MONTHLYRATE_USD;
        } else {
            return MONTHLYRATE_EUR;
        }
    }

    int getCommission(int summ) {

        if (currency == Currency.USD) {
            if (summ < COMISSION_LIM) {
                return COMISSION_MIN_USD;
            } else {
                return COMISSION_MAX_USD;
            }
        } else {
            if (summ < COMISSION_LIM) {
                return COMISSION_MIN_EUR;
            } else {
                return COMISSION_MAX_EUR;
            }
        }
    }
// ---------------------------------------------------


}
