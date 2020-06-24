package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver=driver;
    }


    public boolean isMain() {
        var list =driver.findElements(By.cssSelector("[class='fa fa-sign-out control']"));
        return list.size()==1;
    }

    public void createPlaylist(String name){
        LoginPage loginPage = new LoginPage(driver);
        MainPage mainPage = loginPage.loginToApp("testpro.user03@testpro.io","te$t$tudent");
        mainPage.createPlaylist("bz71");
        Assert.assertTrue(mainPage.checkPlaylist("bz71"));
    }
    public boolean checkPlaylist(String name){
        var bz71 = driver.findElements(By.xpath("//*[@id='playlists']/ul/li[7]"));
        return true;
    }
}