package modul04;

/**
 * Created by MYKOLA.GOROKHOV on 16.02.2017.
 */
public class USBank extends Bank {

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

//    USBank: лимит снятия = 1000, если валюта - USD и 1000, если валюта - EUR
//    лимит пополнения - 10000, если EUR, и нет лимита, если USD
//    месячная ставка - 1% на USD и 2% на EUR
//    комиссия 5%, если USD и до 1000, 7%, если USD и больше 1000
//            6%, если EUR и до 1000 и 8%, если EUR и больше 1000


    public final int WITHDRAWALLIMIT_USD = 1000;
    public final int WITHDRAWALLIMIT_EUR = 1000;

    public final int FUNDINGLIMIT_USD = Integer.MAX_VALUE;
    public final int FUNDINGLIMIT_EUR = 10000;

    public final int MONTHLYRATE_USD = 0;
    public final int MONTHLYRATE_EUR = 1;

    public final int COMISSION_MIN_USD = 5;
    public final int COMISSION_MAX_USD = 7;

    public final int COMISSION_MIN_EUR = 6;
    public final int COMISSION_MAX_EUR = 8;
    public final int COMISSION_LIM = 1000;


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
