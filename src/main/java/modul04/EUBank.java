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


    public static final int WITHDRAWALLIMIT_USD = 2000;
    public static final int WITHDRAWALLIMIT_EUR = 2200;

    public static final int FUNDINGLIMIT_USD = 10000;
    public static final int FUNDINGLIMIT_EUR = 20000;

    public static final int MONTHLYRATE_USD = 0;
    public static final int MONTHLYRATE_EUR = 1;

    public static final int COMISSION_MIN_USD = 5;
    public static final int COMISSION_MAX_USD = 7;

    public static final int COMISSION_MIN_EUR = 2;
    public static final int COMISSION_MAX_EUR = 4;
    public static final int COMISSION_LIM = 1000;

    // ---------------------------------------------------
    int getLimitOfWithdrawal() {
        if (getCurrency() == Currency.USD) {
            return WITHDRAWALLIMIT_USD;
        } else {
            return WITHDRAWALLIMIT_EUR;
        }
    }


    int getLimitOfFunding() {
        if (getCurrency() == Currency.USD) {
            return FUNDINGLIMIT_USD;
        } else {
            return FUNDINGLIMIT_EUR;
        }
    }

    int getMonthlyRate() {
        if (getCurrency() == Currency.USD) {
            return MONTHLYRATE_USD;
        } else {
            return MONTHLYRATE_EUR;
        }
    }

    int getCommission(int summ) {

        if (getCurrency() == Currency.USD) {
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
