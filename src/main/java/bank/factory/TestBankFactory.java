package bank.factory;

import bank.dao.IAccountDAO;
import bank.dao.MockAccountDAO;
import bank.integration.IEmailSender;
import bank.integration.MockEmailSender;

public class TestBankFactory implements BankFactory {

    @Override
    public IAccountDAO geAccountDAO() {
       return new MockAccountDAO();
    }

    @Override
    public IEmailSender getEmailSender() {
        return new MockEmailSender();
    }
    
}
