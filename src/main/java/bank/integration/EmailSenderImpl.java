package bank.integration;

import bank.domain.Customer;

public class EmailSenderImpl implements IEmailSender {


    @Override
    public void sendEmail(Customer customer) {
        System.out.println("Hi "+customer.getName()+", Changes has been made to your account.");
    }
    
}
