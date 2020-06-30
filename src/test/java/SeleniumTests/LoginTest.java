package SeleniumTests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest {
    @Test
    public void loginTestCorrectCredentialsLoggedToApp() {
       Assert.assertTrue(mainPage.isMain());
    }
}

//    @Test
//    public void loginTestInvalidCredentialsNoLogIn() {
//        loginPage.loginToApp("koelllluser21@testpro.io", "testStudent");
//        Assert.assertTrue(loginPage.isError());
//   }
//}
