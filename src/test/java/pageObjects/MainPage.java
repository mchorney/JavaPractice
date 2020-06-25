package pageObjects;

import org.openqa.selenium.*;
import seleniumTests.PlaylistTests;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isMain() {
        var list = driver.findElements(By.cssSelector("[class='fa fa-sign-out control']"));
        return list.size() == 1;
    }

    public void createPlaylist(String Playlist) {
//        getPlus().click();
        entryField().sendKeys("V_Pl3", Keys.ENTER);
    }

    public boolean checkPlaylist() {
        try {
            driver.findElement(By.xpath("//*[@href='#!/playlist/4853']"));
        } catch (NoSuchElementException error) {
            return false;
        }
        return true;
    }

    public WebElement getPlus() {
        return driver.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']"));
    }

    public WebElement entryField() {
        return driver.findElement(By.xpath("//*[@placeholder='↵ to save']"));
    }

    public WebElement playlist() {
        return driver.findElement(By.xpath("//*[@href='#!/playlist/4853']"));
    }

}