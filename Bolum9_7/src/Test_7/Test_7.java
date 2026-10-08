package Test_7;

import tr.edu.istiklal.Account;

public class Test_7 {

    public static void main(String[] args) {
        Account act = new Account(1122, 20000);
        act.setAnnualInterestRate(4.5);

        act.withdraw(2500);
        act.deposit(3000);

        System.out.println( act.getBalance());
        System.out.println( act.getMonthlyInterest());
        System.out.println( act.getDateCreated());
    }
}