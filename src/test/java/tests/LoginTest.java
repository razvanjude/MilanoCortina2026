package tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.LoginPage;
import sharedData.SharedData;

public class LoginTest extends SharedData {

    private static final Logger log = LoggerFactory.getLogger(LoginTest.class);

    @Test
    public void metodaLogin() {

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.acceptAllCookies();
        loginPage.clickLoginButton();
        loginPage.acceptCookies();
        loginPage.fillEmailAddress("jude.razvan+123@gmail.com");
        loginPage.clickContinue();
        loginPage.fillPassword("Pa$$word01.");
        loginPage.clickContinue();
        loginPage.acceptAllCookies();
        loginPage.clickLoginButton();
        //loginPage.clickLogoutButton();
    }
}
