package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.util.concurrent.TimeUnit;


public class MainPage {

    private WebDriver driver;
    private WebElement getAddPlaylistButton() {
        return driver.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']"));
    }

    private WebElement getPlaylistNameField() {
        return driver.findElement(By.xpath("//*[@class='create'] //*[@type='text']"));
    }

    private WebElement getPlaylistName(String playlistName) {
        return driver.findElement(By.xpath("//*[contains(text(),'"+playlistName+"')][1]"));
    }
//*[contains(text(),'Hii my friend')][1]

    private WebElement getInputPlaylistName() {
        return driver.findElement(By.xpath("//*[@class='active']"));
    }

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isMain() {
       var list = driver.findElements(By.xpath("//*[@class='fa fa-sign-out control']"));
       return list.size()==1;
    }

    public void createPlaylist(String name) {
        Actions actions = new Actions(driver);
        actions.moveToElement(getAddPlaylistButton()).click().build().perform();
        getAddPlaylistButton().click();
        getPlaylistNameField().sendKeys(name);
        getPlaylistNameField().sendKeys(Keys.ENTER);
    }

    public boolean checkPlaylist(String name) {
        var list = driver.findElements(By.linkText(name));
        return (list.size()==1);
    }
    public void renamePlaylist(String oldName, String newName) {
        Actions actions = new Actions(driver);
        actions.doubleClick(getPlaylistName(oldName)).perform();
//        getPlaylistName(oldName).sendKeys(Keys.CONTROL + "a");
//        getPlaylistName(oldName).sendKeys(Keys.BACK_SPACE);
        actions.pause(1000).perform();
        actions.click().keyDown(Keys.CONTROL).sendKeys(Keys.chord("a")).keyUp(Keys.CONTROL).perform();
        actions.doubleClick().sendKeys(newName).sendKeys(Keys.ENTER).perform();
    }

}
