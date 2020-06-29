package lessons.enums.seleniumTests;

import lessons.enums.Browsers;
import lessons.enums.helpers.BrowserFabric;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import lessons.enums.pageObjects.LoginPage;
import lessons.enums.pageObjects.MainPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver driver;
    protected MainPage mainPage;
    @BeforeMethod
    public void startUp() throws NoSuchFieldException {

        driver= BrowserFabric.getDriver(Browsers.OPERA);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://koelapp.testpro.io");
        LoginPage loginPage = new LoginPage(driver);
        mainPage = loginPage.loginToApp("testpro.user03@testpro.io","te$t$tudent");
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
