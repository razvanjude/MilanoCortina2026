package pageLocators;

import org.openqa.selenium.By;

public class LoginLocators {

    public static final By loginButton = By.xpath("//a[@id='loginText']");
    public static final By acceptCookies = By.xpath("//button[@id='onetrust-accept-btn-handler']");
    public static final By insertEmailField = By.xpath("//input[@id='email']");
    public static final By insertPasswordField = By.xpath("//input[@id='password']");
    public static final By continueButton = By.xpath("//button[normalize-space()='Continue']");
    public static final By confirmAgeCheckbox = By.xpath("//div[@data-testid='checkbox-consentAge']//span[@class='checkmark']");
    public static final By confirmIOCTerms = By.xpath("//div[@data-testid='checkbox-consentTerms']//span[@class='checkmark']");
}
