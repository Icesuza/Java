package model;

import java.math.BigDecimal;

public interface BankingServices {
    void deposit(BigDecimal amount);
    void withdraw(BigDecimal amount);
    void showBalance();
    void transfer(Account account, BigDecimal amount);
    void addHistory(String entry);
    void transitionHistory();
}
