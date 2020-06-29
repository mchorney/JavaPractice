package hw5RenamePlaylist;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver driver;
    protected MainPage mainPage;

    @BeforeMethod
    public void startUp() throws NoSuchFieldException{
        driver = BrowserFabric.getDriver(Browsers.CHROME);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://koelapp.testpro.io");
        LoginPage loginPage = new LoginPage(driver);
        mainPage = loginPage.loginToApp("testpro.user03@testpro.io","te$t$tudent");

    }

    @AfterMethod
    public void tearDown() throws InterruptedException{
        Thread.sleep(2000);
        driver.quit();
    }

}
