package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;

public class MainPage {
    private WebDriver driver;
    private WebElement plusButtonPlayListCreation;
    private WebElement playListNameTextField;


    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getPlusButtonPlayListCreation() {
        return driver.findElement(By.xpath(MainPageSelectors.plusButtonPlayListCreation));
    }

    public WebElement getPlayListNameTextField() {
        return driver.findElement(By.xpath(MainPageSelectors.playListNameTextField));
    }

    public boolean isMain() {
        List list = driver.findElements(By.xpath(MainPageSelectors.signOutControl));
        return list.size()==1;
    }
    public void createPlayList(String name){
        getPlusButtonPlayListCreation().click();
        String playlistName = name;
        getPlayListNameTextField().sendKeys(playlistName);
        getPlayListNameTextField().click();

    }
    public boolean checkPlayList() {
        return true;
    }
}
