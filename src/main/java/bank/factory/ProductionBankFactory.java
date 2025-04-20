package bank.factory;

import bank.dao.AccountDAO;
import bank.dao.IAccountDAO;
import bank.integration.EmailSenderImpl;
import bank.integration.IEmailSender;

public class ProductionBankFactory implements BankFactory {

    @Override
    public IAccountDAO geAccountDAO() {
       return new AccountDAO();
    }

    @Override
    public IEmailSender getEmailSender() {
        return new EmailSenderImpl();
    }
    
}
