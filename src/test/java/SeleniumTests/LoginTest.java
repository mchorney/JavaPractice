package SeleniumTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    WebDriver driver;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://koelapp.testpro.io/");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(6000);
        driver.quit();
    }

    @Test
    public void loginTestCorrectCredentialsLoggedToApp() {
        LoginPage loginPage = new LoginPage(driver);
        MainPage mainPage = loginPage.loginToApp("koeluser21@testpro.io", "te$t$tudent");
        Assert.assertTrue(mainPage.isMain());

    }

    @Test
    public void loginTestInvalidCredentialsNoLogIn() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToApp("koelllluser21@testpro.io", "testStudent");
        Assert.assertTrue(loginPage.isError());
    }
}
