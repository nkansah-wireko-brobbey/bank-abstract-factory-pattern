package bank.factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FactoryProvider {
     public static BankFactory getFactory() {
        Properties props = new Properties();
        try {
            props.load(new FileInputStream("config.properties"));
            String environment = props.getProperty("environment", "production");
            
            if ("test".equalsIgnoreCase(environment)) {
                return new TestBankFactory();
            } else {
                return new ProductionBankFactory();
            }
        } catch (IOException e) {
            System.err.println("Error reading config file, using production environment");
            return new ProductionBankFactory();
        }
    }
}
