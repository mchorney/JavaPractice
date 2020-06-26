package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getPlusButtonPlayListCreation() {
        return driver.findElement(By.xpath(MainPageSelectors.plusButtonPlayListCreation));
    }

    public WebElement getPlayListNameTextField() {
        return driver.findElement(By.xpath(MainPageSelectors.playListNameTextField));
    }

    public WebElement getCreatedPlayListName() {
        return driver.findElement(By.xpath(MainPageSelectors.createdPlaylist));
    }

    public boolean isMain() {
        List list = driver.findElements(By.xpath(MainPageSelectors.signOutControl));
        return list.size() == 1;
    }

    public void createPlayList(String name) {
        getPlusButtonPlayListCreation().click();
        String playlistName = name;
        getPlayListNameTextField().sendKeys(playlistName);
        getPlayListNameTextField().sendKeys(Keys.ENTER);
    }

    public boolean checkPlayList(String name) {
        String actualName = getCreatedPlayListName().getText();
        System.out.println(actualName);
        String expectedName = name;
        return expectedName.equals(actualName);
//        //String realNameOfCreatedPlayList =//
//        //Assert.assertEquals(createdPlaylistName, );
//     List list = driver.findElements(By.xpath(MainPageSelectors.createdPlaylist));
//        System.out.println();
////     System.out.println(list); // печатает все обьекты плейлистов//
//     // дальше в цикле пробежаться по элементам ArrayList и вытащить тот - у которого название "PlayList3"
//        // или по ID
//       //Assert.assertTrue(a, ..);
    }
}


