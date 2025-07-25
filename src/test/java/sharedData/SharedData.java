package sharedData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class SharedData {

    private WebDriver driver;

    @BeforeMethod
    public void prepareEnvironment() {
        driver = new ChromeDriver();

        driver.get("https://milanocortina2026.olympics.com/en");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void clearEnvironemnt() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
