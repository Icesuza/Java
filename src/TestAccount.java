import model.Account;
import model.CreditAccount;
import model.SavingAccount;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class TestAccount {
    public static void main(String[] args){
        Account creditAcc = new CreditAccount(new BigDecimal("0"));
        creditAcc.setId(1);
        creditAcc.setUuid(UUID.randomUUID().toString());
        creditAcc.setName("Jungkook");
        creditAcc.setCreateDate(LocalDate.now());
        creditAcc.setExpDate(LocalDate.of(2030,6,13));
        System.out.println(creditAcc);
        creditAcc.deposit(new BigDecimal("200"));
        creditAcc.showBalance();
        creditAcc.withdraw(new BigDecimal("100"));
        creditAcc.showBalance();
        creditAcc.transitionHistory();

        Account savingAcc = new SavingAccount(new BigDecimal("0"));
        savingAcc.setId(2);
        savingAcc.setUuid(UUID.randomUUID().toString());
        savingAcc.setName("Jin");
        savingAcc.setCreateDate(LocalDate.now());
        savingAcc.setExpDate(LocalDate.of(2030,6,13));
        System.out.println(savingAcc);
        savingAcc.deposit(new BigDecimal("1100"));
        savingAcc.showBalance();
        savingAcc.withdraw(new BigDecimal("100"));
        savingAcc.showBalance();
        savingAcc.transitionHistory();

        savingAcc.transfer(creditAcc,new BigDecimal("500"));
        creditAcc.transfer(savingAcc,new BigDecimal("50"));
    }
}
