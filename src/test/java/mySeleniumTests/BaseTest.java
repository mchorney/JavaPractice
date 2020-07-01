package mySeleniumTests;

import myEnums.Browsers;
import myHelpers.BrowserFabric;
import myPageObjects.LoginPageMy;
import myPageObjects.MainPageMy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;


public class BaseTest {
    protected WebDriver driver;
    protected MainPageMy mainPageMy;
    @BeforeMethod
    public void startUp() throws NoSuchFieldException {
        driver = BrowserFabric.getDriver(Browsers.FIREFOX);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://koelapp.testpro.io");
        LoginPageMy loginPage = new LoginPageMy(driver);
        mainPageMy = loginPage.loginToApp("testpro.user03@testpro.io", "te$t$tudent");
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
