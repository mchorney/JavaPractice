package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver=driver;
    }


    public boolean isMain() {
        var list = driver.findElements(By.xpath("//*[@class =\"fa fa-sign-out control\"]"));
        return list.size()!=0;
    }

    public class HomePageSelectors {
        public static final String homeButtonXpath = "//*[@class='home active']";
        public static final String plusButtonCssSelector = ".fa.fa-plus-circle";
        public static final String newPlaylistFieldXpath = "//*[contains(@placeholder,'to save')]";
        public static final String playlistsSideBarCss = "[id=playlists]";
    }
    public void createPlaylist(String name){
        var addButton = driver.findElement(By.cssSelector(HomePageSelectors.plusButtonCssSelector));
        Actions actions = new Actions(driver);              //------------------------------------------------------------------
        actions.moveToElement(addButton).click().perform(); //| I was constantly getting the exception,                          |
                                                            //| that the element "addButton"is not clickable,                   |
                                                            //| that's why I used this "Actions" method, that I found in Google.|
                                                            //------------------------------------------------------------------
        addButton.click();
        var playlistNameField = driver.findElement(By.xpath(HomePageSelectors.newPlaylistFieldXpath));

        playlistNameField.click();
        playlistNameField.sendKeys(name);
        playlistNameField.sendKeys(Keys.ENTER);

    }

    public boolean checkPlaylist(String name){
        var playlistsSideBar = driver.findElement(By.cssSelector(HomePageSelectors.playlistsSideBarCss));
        var allPlaylists = playlistsSideBar.getText();
        return allPlaylists.contains(name);
    }

}
