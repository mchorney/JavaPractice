package seleniumTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageObjects.MainPage;

public class BaseTest {
    protected WebDriver driver;
    protected MainPage mainPage;
    @BeforeMethod
    public void startUp(){
//        System.setProperty("webdriver.chrome.driver", "chromedriver");
//        driver = new ChromeDriver();
        System.setProperty("webdriver.gecko.driver","geckodriver");
        driver = new FirefoxDriver();
        driver.get("https://koelapp.testpro.io");
        driver.manage().window().maximize();
        LogInPage logInPage = new LogInPage(driver);
        MainPage mainPage = logInPage.logInToApp("testpro.user03@testpro.io","te$t$tudent");
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
