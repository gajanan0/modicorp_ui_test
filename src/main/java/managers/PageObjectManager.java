package managers;

import org.openqa.selenium.WebDriver;
import pages.CustomerRegistrationPage;

public class PageObjectManager {

    private WebDriver driver;
    private CustomerRegistrationPage customerRegistrationPage;

    public PageObjectManager(WebDriver driver) {

        this.driver = driver;

    }

    public CustomerRegistrationPage getCustomerRegistrationPage(){
        return (customerRegistrationPage == null) ? customerRegistrationPage = new CustomerRegistrationPage(driver) : customerRegistrationPage;
    }

}

