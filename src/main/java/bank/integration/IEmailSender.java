package bank.integration;

import bank.domain.Customer;

public interface IEmailSender {
    void sendEmail(Customer customer);
}
