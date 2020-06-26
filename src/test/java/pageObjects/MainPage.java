package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class MainPage {
    private WebDriver driver;
    private FluentWait<WebDriver> fluentWait;

    public MainPage(WebDriver driver) {
        this.driver=driver;
        fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(StaleElementReferenceException.class)
                .ignoring(NoSuchElementException.class);
    }


    public boolean isMain() {
        var list =driver.findElements(By.cssSelector("[class='fa fa-sign-out control']"));
        return list.size()==1;
    }
    public WebElement getPlus(){
        fluentWait.until(x->x.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']")));
        return driver.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']"));
    }
    public WebElement getEntryFild(){
        return driver.findElement(By.xpath("//*[@placeholder='↵ to save']"));
    }
    public WebElement getPlaylist(){
        return driver.findElement(By.xpath("//*[@href='#!/playlist/4865']"));
    }


    public void createPlaylist(String name) throws InterruptedException {
        Thread.sleep(3000);
        getPlus().click();
        getEntryFild().sendKeys(name);
        getPlaylist().sendKeys(Keys.RETURN);
//        String url=driver.getCurrentUrl();
//        return url.split("/")[5];


    }
    public boolean checkPlaylist(String name){

        return true;
    }
}




