package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.NoSuchElementException;


public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getPlusButton()  {
//        wait.until((WebDriver dr1) -> dr1.findElement(By.xpath(MainPageSelectors.playListNameTextField)));
//        fluentWait.until(x->x.findElement(By.xpath(MainPageSelectors.plusButtonPlayListCreation)).isDisplayed());
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(MainPageSelectors.plusButtonPlayListCreation)));
//        long now = System.currentTimeMillis();
//        wait.until(ExpectedConditions
//                .elementToBeClickable(By.xpath(MainPageSelectors.plusButtonPlayListCreation)));
//        System.out.println("Elapsed time: " + (System.currentTimeMillis() - now));
//        System.out.println(driver.findElement(By.xpath(MainPageSelectors.plusButtonPlayListCreation)));

        // !!! Не один из типов Explicit waits (fluent and simply WebDriver wait) не работает - элемент находят,
        // но кликают мимо!!! Поэтому - ждем..
        //TODO: all used waits can found dynamic element "plus button", but can not wait until the page
        // loading - and in this acse the "side bar" element received the click.
        // That's why I put Thread.sleep(). It needs to be improve.

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(MainPageSelectors.plusButtonPlayListCreation)));
        return driver.findElement(By.xpath(MainPageSelectors.plusButtonPlayListCreation));
    }

    public WebElement getPlayListNameTextField() {
        return driver.findElement(By.xpath(MainPageSelectors.playListNameTextField));
    }

    public WebElement getCreatedPlayListName() {
        return driver.findElement(By.xpath(MainPageSelectors.createdPlaylist));
    }

    public WebElement getRemanedPlayListName() {
        return driver.findElement(By.xpath(MainPageSelectors.renamedPlaylistName));
    }


    public boolean isMain() {
        // wait until "SignOut" element will be clickable
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(MainPageSelectors.signOutControl)));
        // print the "SignOut" element
        WebElement signOut = driver.findElement(By.xpath(MainPageSelectors.signOutControl));
        System.out.println(signOut);
        // validation of "SignOut" element presence on the page
        try {
            driver.findElement(By.xpath(MainPageSelectors.signOutControl));
        } catch (NoSuchElementException e) {
            return false;
        }
        return true;
    }

    private String getOldPlaylistXpath(String name) {
        return "//a[text()='" + name + "']";
    }


    public String getPlaylistHeadingName(String playlistHeaderName) {
        return
                "//span[contains(.,'" + playlistHeaderName + "')]";
    }

    public String createPlayList(String playListName) {
        getPlusButton().click();
        getPlayListNameTextField().sendKeys(playListName);
        getPlayListNameTextField().sendKeys(Keys.ENTER);
        String url = driver.getCurrentUrl();

        return url.split("/")[5];
    }

    public boolean checkPlayList(String id) {
        List list = driver.findElements(By.xpath("//*[@href='#!/playlist/" + id + "']"));
        return list.size() == 1;
    }

    public boolean checkPlaylist(String id, String name) {
        List<WebElement> list = driver.findElements(By.xpath("//*[@href='#!/playlist/" + id + "']"));
        if (list.size() == 0) {
            return false;
        };        ;
        return name.equals(list.get(0).getText());
    }

    public void replacePlayList(String playlistId, String newName) {
        WebElement playlist = driver.findElement(By.xpath("//*[@href='#!/playlist/" + playlistId + "']"));
        Actions actions = new Actions(driver);
        actions.doubleClick(playlist).perform();
        WebElement editField = driver.findElement(By.xpath("//*[@class='playlist playlist editing']/input"));
        editField.sendKeys(Keys.CONTROL + "a");
        editField.sendKeys(newName);
        editField.sendKeys(Keys.RETURN);
    }
}









