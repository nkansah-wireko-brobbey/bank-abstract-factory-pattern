package bank.factory;

import bank.dao.IAccountDAO;
import bank.integration.IEmailSender;

public interface BankFactory {
    IAccountDAO geAccountDAO();
    IEmailSender getEmailSender();
}
