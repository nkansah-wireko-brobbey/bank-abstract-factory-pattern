package bank.dao;

import java.util.Collection;
import java.util.Date;

import bank.domain.Account;

public class AccountDAOLogger implements IAccountDAO {
    private final IAccountDAO decoratedDAO;

    public AccountDAOLogger(IAccountDAO accountDAO){
        this.decoratedDAO = accountDAO;}

private void log(String methodName, String message) {
        System.out.println(new Date() + " - [AccountDAO] " + methodName + " - " + message);
    }

    @Override
    public void saveAccount(Account account) {
        log("saveAccount", "Saving account: " + account.getAccountnumber());
        decoratedDAO.saveAccount(account);
        log("saveAccount", "Successfully saved account: " + account.getAccountnumber());
    }

    @Override
    public void updateAccount(Account account) {
        log("updateAccount", "Updating account: " + account.getAccountnumber());
        decoratedDAO.updateAccount(account);
        log("updateAccount", "Successfully updated account: " + account.getAccountnumber());
    }

    @Override
    public Account loadAccount(long accountnumber) {
        log("loadAccount", "Loading account: " + accountnumber);
        Account account = decoratedDAO.loadAccount(accountnumber);
        log("loadAccount", "Successfully loaded account: " + accountnumber);
        return account;
    }

    @Override
    public Collection<Account> getAccounts() {
        log("getAccounts", "Getting all accounts");
        Collection<Account> accounts = decoratedDAO.getAccounts();
        log("getAccounts", "Retrieved " + accounts.size() + " accounts");
        return accounts;
    }
    
}
