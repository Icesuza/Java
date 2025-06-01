package model;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
//concrete class
public class Account implements BankingServices{
    private Integer id;
    private String uuid;
    private String name;
    private BigDecimal balance;
    private LocalDate createDate;
    private LocalDate expDate;
    private List<String> history= new ArrayList();

    @Override
    public void deposit(BigDecimal amount){
        balance = balance.add(new BigDecimal("amount"));
        System.out.println("Deposited: " + amount);
    }

    @Override
    public void withdraw(BigDecimal amount) {
        if (amount.compareTo(balance) >0) {
            amount.subtract(balance);
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    @Override
    public void showBalance() {
        System.out.println("Your Balance:" + balance);
    }

    @Override
    public void transfer(Account account, BigDecimal amount) {}

    @Override
    public void addHistory(String entry) {
        history.add(LocalDate.now() + "-" + entry);
    }
    @Override
    public void transitionHistory() {
        System.out.println("=".repeat(20));
        System.out.println("[+] Transition history [+]");
        for(String entry:history){
            System.out.println(entry);
        }
    }
}
