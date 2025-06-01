package model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CreditAccount extends Account{
    private BigDecimal creditBalance;
    public CreditAccount(BigDecimal initialBalance) {
        if (initialBalance == null) {
            initialBalance = BigDecimal.ZERO;
        }
        this.creditBalance = initialBalance;
        setBalance(initialBalance);
    }
    @Override
    public void deposit(BigDecimal amount){
        System.out.println("=".repeat(20));
        creditBalance = creditBalance.add(amount);
        setBalance(creditBalance);
        System.out.println("Deposited: " + amount + " to Credit Account");
        this.addHistory("Deposited: " + amount + " to Credit Account");
    }
    @Override
    public void withdraw(BigDecimal amount){
        System.out.println("=".repeat(20));
        if (amount.compareTo(creditBalance) <= 0) {
            creditBalance = creditBalance.subtract(amount);
            setBalance(creditBalance);
            System.out.println("Withdrawn: " + amount + " from Credit Account");
            this.addHistory("Withdrawn: " + amount + " from Credit Account");
        } else {
            System.out.println("Insufficient balance.");
        }
    }
    @Override
    public void showBalance(){
        System.out.println("Credit Balance:" + getBalance());
    }
    @Override
    public void transfer(Account account, BigDecimal amount) {
        System.out.println("=".repeat(20));
        if (account == this) {
            System.out.println("Cannot transfer to the same account.");
            return;
        }
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            System.out.println("Transfer amount must be greater than 0.");
            return;
        }
        if (this.getBalance().compareTo(amount) >= 0) {
            this.setBalance(this.getBalance().subtract(amount));
            account.setBalance(account.getBalance().add(amount));
            System.out.println("Transferred " + amount + " from " + this.getName() + " to " + account.getName());
            this.addHistory("Transferred " + amount + " from " + this.getName() + " to " + account.getName());
        } else {
            System.out.println("Insufficient funds in " + this.getName() + "'s account.");
        }
    }
}
