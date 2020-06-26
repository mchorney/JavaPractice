package shw8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class MainPage {
    private WebDriver driver;
    private FluentWait<WebDriver> fluentWait;


    public MainPage(WebDriver driver) {
        this.driver = driver;
        fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofMillis(100));
    }

    public boolean isMain() {
        var list =driver.findElements(By.cssSelector("[class='fa fa-sign-out control']"));
        return list.size()==1;
    }

    public WebElement getPlusButton() {
        fluentWait.until(x->x.findElements(By.xpath("//*[@class='fa fa-plus-circle control create']")));
        return driver.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']"));
    }
    public WebElement getNewPlaylistBox(){
        return driver.findElement(By.xpath("//*[@placeholder=\"↵ to save\"]"));
    }

    public void createPlaylist(String name){
        getPlusButton().click();
        getNewPlaylistBox().sendKeys(name);
        getNewPlaylistBox().sendKeys(Keys.RETURN);
        fluentWait.until(x->x.findElements(By.xpath("//div[@class='success show']"))
        String url = driver.getCurrentUrl());
        return url.split("/")[5];


    }

    public boolean checkPlaylist(String id) {
       var list = driver.findElements(By.xpath("//*[@href=\"#!/playlist/"+id+"']"));
        return list.size()==1;
    }
}
