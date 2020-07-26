package wk3;

import java.text.SimpleDateFormat;
import java.util.Date;

class Account{

    // properties should be private

    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated = new Date();

    public Account() {

    }

    public Account(int id, double initialBalance) {
        this.id = id;
        this.balance = initialBalance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public String getDateCreated() {

        /**
         * use SimpleDateFormat to format Date()
         */
        String datePattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();

        return simpleDateFormat.format(dateCreated);
    }

    double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12;
    }

    double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    void withdraw(double withdrawal) {
        this.balance -= withdrawal;
    }

    void deposit(double deposit) {
        this.balance += deposit;
    }
}

public class Q5_Account {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000);

        System.out.println(account.getDateCreated());

        account.setAnnualInterestRate(4.5);
        System.out.println("current balance: = " + account.getBalance());

        account.withdraw(2500);
        System.out.println("after withdrawal = " + account.getBalance());
        account.deposit(3000);
        System.out.println("after deposit = " + account.getBalance());

        System.out.println("monthy interest = " + account.getMonthlyInterest());
    }
}
