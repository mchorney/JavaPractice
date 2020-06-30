package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver=driver;
    }


    public boolean isMain() {
        var list =driver.findElements(By.cssSelector("[class='fa fa-sign-out control']"));
        return list.size()==1;
    }

    public WebElement setNewPlaylist() {
        return driver.findElement(By.xpath("//*[@id=\"playlists\"]/form/input"));
    }



    public void createPlaylist(String name)throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,5);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='fa fa-plus-circle control create']")));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='fa fa-plus-circle control create']")));
        var createPlaylist = driver.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']"));
        Thread.sleep(3000);
        createPlaylist.click();
        var setNewPlaylist = driver.findElement(By.xpath("//*[@id=\"playlists\"]/form/input"));
        setNewPlaylist.sendKeys("val77");
        setNewPlaylist().sendKeys(Keys.ENTER);



    }
    public boolean checkPlaylist(String name){
        return true;
    }
}
