package wk4;

import java.util.Date;

class Account {
    private int id;
    private double balance;
    private double annualInterestRate = 0;
    private Date dateCreated;

    public Account() {
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    void deposit(double deposit) {
        this.balance += deposit;
    }

    void withdraw(double withdrawal) {
        this.balance -= withdrawal;
    }
}

class CheckingAccount extends Account{
    @Override
    void withdraw(double withdrawal) {
        super.withdraw(withdrawal);
    }
}

