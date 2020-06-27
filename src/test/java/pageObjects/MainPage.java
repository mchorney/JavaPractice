package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;


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

    public void renamePlaylist(){
        var playlist = driver.findElement(By.xpath("//*[@href='#!/playlist/5208']"));
        Actions actions = new Actions(driver);
        actions.doubleClick(playlist).perform();
         var editField = driver.findElement(By.xpath("//*[@class='playlist playlist editing']/input"));
         editField.sendKeys(Keys.CONTROL+"a");
         editField.sendKeys("Victoria_New");
         editField.sendKeys(Keys.ENTER);
    }


    public boolean checkPlaylist() {
        try {
            driver.findElement(By.xpath("//*[@href='#!/playlist/5208']"));
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

        return driver.findElement(By.xpath("//*[@href='#!/playlist/5208']"));
    }

}