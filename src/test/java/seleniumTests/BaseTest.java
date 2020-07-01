package seleniumTests;


import enumsO.Browsers;
import helpersO.BrowserFabric;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageObjects.LogInPage;
import pageObjects.MainPage;

public class BaseTest {
    protected WebDriver driver;
    protected MainPage mainPage;
    @BeforeMethod
    public void startUp() throws NoSuchFieldException {
        driver = BrowserFabric.getDriver(Browsers.CHROME);
        driver.get("https://koelapp.testpro.io");
        driver.manage().window().maximize();
        LogInPage logInPage = new LogInPage(driver);
        mainPage = logInPage.logInToApp("testpro.user03@testpro.io","te$t$tudent");
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
