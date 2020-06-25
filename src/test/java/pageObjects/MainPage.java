package pageObjects;

import org.openqa.selenium.*;

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
        getPlus().click();
        entryField().sendKeys("Michael_JS_1", Keys.ENTER);
    }

    public boolean checkPlaylist(String xxxxx) {
        try {
            driver.findElement(By.xpath("//*[@href='#!/playlist/4861']"));
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
        return driver.findElement(By.xpath("//*[@href='#!/playlist/4861']"));
    }


}
