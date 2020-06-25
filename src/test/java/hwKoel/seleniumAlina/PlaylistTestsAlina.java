package hwKoel.seleniumAlina;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import hwKoel.pageObjects.LoginPageAlina;
import  hwKoel.pageObjects.MainPageAlina;

import java.util.concurrent.TimeUnit;

public class PlaylistTestsAlina {
    WebDriver driver;
    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://koelapp.testpro.io");
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
    @Test
    public void playlistTests_createPlaylist_PlaylistCreated() throws InterruptedException {
        LoginPageAlina loginPage = new LoginPageAlina(driver);
        MainPageAlina mainPage = loginPage.loginToApp("testpro.user03@testpro.io","te$t$tudent");
        Thread.sleep(2000);
        mainPage.createPlaylistAK("AK22");

        Assert.assertTrue(mainPage.checkPlaylist ("AK22"));
    }
}
