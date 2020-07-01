package seleniumTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestNew extends BaseTest{

    @Test
    public void loginTest_CorrectCredentials_LoggedToApp(){
        Assert.assertTrue(mainPage.isMain());
    }

    @Test
    public void loginTest_CorrectCredentials_LoggedToApp1(){
        Assert.assertTrue(mainPage.isMain());
    }

    @Test
    public void loginTest_CorrectCredentials_LoggedToApp2(){
        Assert.assertTrue(mainPage.isMain());
    }

    @Test
    public void loginTest_CorrectCredentials_LoggedToApp3(){
        Assert.assertTrue(mainPage.isMain());
    }

    @Test
    public void loginTest_CorrectCredentials_LoggedToApp4(){
        Assert.assertTrue(mainPage.isMain());
    }
//    @Test
//    public void loginTest_WrongCredentials_Error(){
//        LogInPage loginPage = new LogInPage(driver);
//        loginPage.logInToApp("testpro.user03@testpro.io","1111111");
//        Assert.assertTrue(loginPage.isError());
//
//    }
}
