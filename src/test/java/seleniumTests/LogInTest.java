package seleniumTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LogInPage;
import pageObjects.MainPage;

import java.util.concurrent.TimeUnit;

public class LogInTest {
    private WebDriver driver;

    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://koelapp.testpro.io");
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void loginTest_CorrectCredentials_LoggedToApp(){

        LogInPage logInPage = new LogInPage(driver);
        MainPage mainPage = logInPage.logInToApp("testpro.user03@testpro.io","te$t$tudent");
        Assert.assertTrue(mainPage.isMain());
    }

    @Test
    public void loginTest_WrongCredentials_Error(){

        LogInPage logInPage = new LogInPage(driver);
        MainPage mainPage = logInPage.logInToApp("testpro.user03@testpro.io","uihgiuiu");
        Assert.assertTrue(logInPage.isError());

    }

    // do check of empty fields
}
