package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class MainPage {
    private WebDriver driver;
    private FluentWait<WebDriver>fluentWait;

    public MainPage(WebDriver driver) {
        this.driver=driver;
        fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofMillis(100));
    }


    public boolean isMain() {
        var list =driver.findElements(By.cssSelector("[class='fa fa-sign-out control']"));
        return list.size()==1;
    }
    public WebElement getPlusButton(){
        fluentWait.until(x->x.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']")).isDisplayed());
        return driver.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']"));
    }

    public void createPlaylist(String name){
        getPlusButton().click();

    }
    public boolean checkPlaylist(String name){
        return true;
    }
}
