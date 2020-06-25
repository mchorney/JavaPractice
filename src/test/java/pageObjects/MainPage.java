package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver=driver;
    }

    public class MainPageSelectors{
        public static final String homeButtonXpath = "//*[@class='home active']";
        public static final String plusButtonCssSelector = ".fa.fa-plus-circle";
        public static final String newPlaylistFieldXpath = "//*[contains(@class,'create')]";
        public static final String newPlaylistNameEnter = "//*[@type='text']";
        public static final String createdPlayList = "//*[@id='playlists']";
    }

    public boolean isMain() {
        var list =driver.findElements(By.cssSelector("[class='fa fa-sign-out control']"));
        return list.size()==1;
    }

    public void createPlaylist(String name) throws InterruptedException {
        WebElement createNew = driver.findElement(By.xpath(MainPageSelectors.newPlaylistFieldXpath));

//        WebDriverWait wait = new WebDriverWait(driver,60);

//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class,'create')]")));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@class,'create')]")));
//        WebElement createNew = driver.findElement(By.cssSelector(".fa.fa-plus-circle"));
        Thread.sleep(5000);
        createNew.click();
        Thread.sleep(5000);
        WebElement playlistName = driver.findElement(By.xpath(MainPageSelectors.newPlaylistNameEnter));
        playlistName.sendKeys("qwerty");
        Thread.sleep(5000);
        playlistName.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
    }
    public boolean checkPlaylist(String name){
        List<WebElement> newList = driver.findElements(By.xpath("//*[@class='menu']//*[contains(text(),'qwerty')]"));
        return newList.size()>=1;
    }
}
