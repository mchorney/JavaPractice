package hw9_10_11;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyLoginTestNew extends MyBaseTest {
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
}
