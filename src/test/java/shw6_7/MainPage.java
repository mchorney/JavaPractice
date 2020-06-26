package shw6_7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MainPage {

    private WebDriver driver;
    private WebElement getAddPlaylistButton() {
        return driver.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']"));
    }

    private WebElement getPlaylistNameField() {
        return driver.findElement(By.xpath("//*[@class='create'] //*[@type='text']"));
    }

    private WebElement getPlaylistName(String playlistName) {
        return driver.findElement(By.linkText("//*[contains(text(),'"+playlistName+"'][1]"));
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
}
