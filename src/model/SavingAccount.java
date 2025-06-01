package model;

import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
public class SavingAccount extends Account{
    private BigDecimal savingBalance;
    public SavingAccount(BigDecimal initialBalance) {
        if (initialBalance == null) {
            initialBalance = BigDecimal.ZERO;
        }
        this.savingBalance = initialBalance;
        setBalance(initialBalance);
    }
    @Override
    public void deposit(BigDecimal amount){
        System.out.println("=".repeat(20));
        savingBalance = savingBalance.add(amount);
        setBalance(savingBalance);
        System.out.println("Deposited: " + amount + " to Saving Account");
        this.addHistory("Deposited: " + amount + " to Saving Account");
    }
    @Override
    public void withdraw(BigDecimal amount){
        System.out.println("=".repeat(20));
        if (amount.compareTo(savingBalance) <=0) {
            savingBalance = savingBalance.subtract(amount);
            setBalance(savingBalance);
            System.out.println("Withdrawn: " + amount + " from Saving Account");
            this.addHistory("Withdrawn: " + amount + " from Saving Account");
        } else {
            System.out.println("Insufficient balance.");
        }
    }
    @Override
    public void showBalance(){
        System.out.println("Saving Balance:" + getBalance());
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
