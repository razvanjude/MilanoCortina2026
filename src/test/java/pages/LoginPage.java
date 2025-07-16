package pages;

import helperMethods.ElementHelper;
import org.openqa.selenium.WebDriver;
import pageLocators.LoginLocators;

public class LoginPage {

    private WebDriver driver;
    private ElementHelper elementHelper;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
    }

    public void clickLoginButton() {
        elementHelper.clickJsLocator(LoginLocators.loginButton);
    }

    public void fillEmailAddress(String emailValue) {
        elementHelper.fillLocator(LoginLocators.insertEmailField,emailValue);
    }

    public void fillPassword(String passwordValue) {
        elementHelper.fillLocator(LoginLocators.insertPasswordField,passwordValue);
    }

    public void acceptAllCookies() {
        elementHelper.clickLocator(LoginLocators.acceptAllCookies);
    }

    public void acceptCookies() {
        elementHelper.clickJsLocator(LoginLocators.acceptCookies);
    }

    public void confirmAgeandPolicy() {
        elementHelper.clickJsLocator(LoginLocators.confirmAgeCheckbox);
        elementHelper.clickJsLocator(LoginLocators.confirmIOCTerms);
    }
    public void clickContinue() {
        elementHelper.clickJsLocator(LoginLocators.continueButton);
    }

    public void clickLogoutButton() {
        elementHelper.clickJsLocator(LoginLocators.logoutButton);
    }
}
