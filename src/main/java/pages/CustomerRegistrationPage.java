package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utils.RandomEmailAddress;

public class CustomerRegistrationPage {

    @FindBy(how = How.XPATH, using = "//img[contains(text(),'logo')]")
    private WebElement logo;
    @FindBy(how = How.XPATH, using = "//text[contains(text(),'email')]")
    private WebElement emailAddressTextField;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Continue')]")
    private WebElement continueButton;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Wallet')]")
    private WebElement walletIcon;

    WebDriver driver;
    public CustomerRegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean displayLogo() {
        return logo.isDisplayed();
    }

    public void enterEmailAddress() {
        utils.Utils.waitForElementToBeInVisible(driver,emailAddressTextField);
        emailAddressTextField.sendKeys(RandomEmailAddress.getEmailAddress());
    }

    public void clickContinueButton() {
        utils.Utils.waitForElementToBeInVisible(driver,continueButton);
        continueButton.click();
    }

    public boolean walletDisplay() {
        utils.Utils.waitForElementToBeInVisible(driver,walletIcon);
        return walletIcon.isDisplayed();
    }

}

