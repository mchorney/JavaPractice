package mySeleniumTests;

import myPageObjects.LoginPageMy;
import myPageObjects.MainPageMy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

public class LoginTest {
    WebDriver driver;
    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://koelapp.testpro.io");
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
    @Test
    public void loginTest_CorrectCredentials_LoggedToApp(){
        LoginPageMy loginPage = new LoginPageMy(driver);
        MainPageMy mainPage = loginPage.loginToApp("testpro.user03@testpro.io","te$t$tudent");
        Assert.assertTrue(mainPage.isMain());
    }
    @Test
    public void loginTest_WrongCredentials_Error(){
        LoginPageMy loginPage = new LoginPageMy(driver);
        loginPage.loginToApp("testpro.user03@testpro.io","1111111");
        Assert.assertTrue(loginPage.isError());

    }
}
