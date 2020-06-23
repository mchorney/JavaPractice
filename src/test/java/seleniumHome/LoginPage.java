package seleniumHome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjectsHome.Loginpage;
import pageObjectsHome.Mainpage;

import java.util.concurrent.TimeUnit;

public class LoginPage {
    WebDriver driver;
    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://koelapp.testpro.io/");
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
    @Test
    public void loginTest_CorrectCredentials(){

        Loginpage loginPage=new Loginpage(driver);
        Mainpage mainpage=loginPage.loginToApp("koeluser03@testpro.io","te$t$tudent");
        Assert.assertTrue(mainpage.isMain());
    }
    @Test
    public void loginTest_WrongCredentials(){

        Loginpage loginPage=new Loginpage(driver);
        Mainpage mainpage=loginPage.loginToApp("koeluser03@testpro.io","te$t$tudent1");
        Assert.assertTrue(loginPage.isError());
    }

}
