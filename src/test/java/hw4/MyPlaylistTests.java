package hw4;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class MyPlaylistTests {
    private WebDriver driver;
    private FluentWait<WebDriver> fluentWait;

    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(NoSuchElementException.class);

        driver.get("https://koelapp.testpro.io/");

    }
    @AfterMethod
    public void tearDown() throws InterruptedException{
        Thread.sleep(5000);driver.quit();
    }

    @Test

    public void createPlaylist() throws InterruptedException {

        LoginPage lp = new LoginPage(driver);
        MainPage mp = lp.loginToApp("testpro.user03@testpro.io","te$t$tudent");

        Assert.assertTrue(mp.isMain());
        Thread.sleep(2000);

        mp.createPlaylist("Yahoo1");
        Assert.assertTrue(mp.checkPlaylist());
    }

}

