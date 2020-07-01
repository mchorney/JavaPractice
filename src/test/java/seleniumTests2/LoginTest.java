package seleniumTests2;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects2.LoginPage;
import pageObjects2.MainPage;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest_CorrectCredentials_LoggedToApp(){
        LoginPage loginPage=new LoginPage(driver);
        MainPage mainPage=loginPage.loginToApp("testpro.user03@testpro.io","te$t$tudent");
        Assert.assertTrue(mainPage.isMain());
    }
    @Test
    public void loginTest_WrongCredentials_Error(){
        LoginPage loginPage=new LoginPage(driver);
        loginPage.loginToApp("testpro.user03@testpro.io","111111111");
        Assert.assertTrue(loginPage.isError());
    }
}
