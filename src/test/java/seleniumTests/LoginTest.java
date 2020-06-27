package seleniumTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

import java.util.concurrent.TimeUnit;

public class LoginTest extends BaseTest{

    @Test
    public void loginTest_CorrectCredentials_LoggedToApp(){
        Assert.assertTrue(mainPage.isMain());
    }
    @Test
    public void loginTest_WrongCredentials_Error(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToApp("testpro.user03@testpro.io","1111111");
        Assert.assertTrue(loginPage.isError());

    }
}
