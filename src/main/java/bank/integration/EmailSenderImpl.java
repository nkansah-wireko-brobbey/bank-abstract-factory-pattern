package bank.integration;

import bank.domain.Customer;

public class EmailSenderImpl implements IEmailSender {

    private static volatile EmailSenderImpl instance;

    private EmailSenderImpl(){

    }

    @Override
    public void sendEmail(Customer customer) {
        System.out.println("Hi "+customer.getName()+", Changes has been made to your account.");
    }

    public static EmailSenderImpl getInstance(){
        if (instance == null){
            instance = new EmailSenderImpl();
        }

        return instance;
    }
    
}
