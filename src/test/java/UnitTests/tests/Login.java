package UnitTests.tests;

import UnitTests.pageObjects.LoginPage;
import UnitTests.pageObjects.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class Login {
    WebDriver driver;

    @BeforeMethod
    public void startDriver(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://koelapp.testpro.io");
    }

    @AfterMethod
    public void endTest(){
        driver.quit();
    }

    @Test
    public void testLogin(){
        LoginPage login = new LoginPage(driver);
        MainPage main = login.login("koeluser03@testpro.io", "dGUkdCR0dWRlbnQ=");
        Assert.assertTrue(main.isMain());
    }

    @Test
    public void login_error(){
        LoginPage login = new LoginPage(driver);
        Assert.assertTrue(login.isError("koeluser03@testpro.io", "dGUkdCR0dasrtd"));
    }

    @Test
    public void testRelatives(){
        LoginPage login = new LoginPage(driver);
        MainPage main = login.login("koeluser03@testpro.io", "dGUkdCR0dWRlbnQ=");
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userBadge")));
        System.out.println(main.findByParent());
        System.out.println(main.findByGrandparent());
        System.out.println(main.findByFollowingSibling());
        System.out.println(main.findByPrevSibling());
        System.out.println(main.findBySibling());


    }

}
