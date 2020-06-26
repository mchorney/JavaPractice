package UnitTests.Tests;

import UnitTests.PageObjects.LoginPage;
import UnitTests.PageObjects.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;


public class Login {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void startDriver(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://koelapp.testpro.io");
        wait = new WebDriverWait(driver, 10);
    }

    @AfterMethod
    public void endTest(){
        driver.quit();
    }

    @Test
    public void testLogin() throws InterruptedException {
        LoginPage login = new LoginPage(driver, wait);
        MainPage main = login.login("koeluser03@testpro.io", "dGUkdCR0dWRlbnQ=");
        Assert.assertTrue(main.isMain());
    }

    @Test
    public void login_error() throws InterruptedException {
        LoginPage login = new LoginPage(driver, wait);
        Assert.assertTrue(login.isError("koeluser03@testpro.io", "dGUkdCR0dasrtd"));
    }

    @Test
    public void testRelatives() throws InterruptedException {
        LoginPage login = new LoginPage(driver, wait);
        MainPage main = login.login("koeluser03@testpro.io", "dGUkdCR0dWRlbnQ=");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userBadge")));
        System.out.println(main.findByParent());
        System.out.println(main.findByGrandparent());
        System.out.println(main.findByFollowingSibling());
        System.out.println(main.findByPrevSibling());
        System.out.println(main.findBySibling());


    }

}
