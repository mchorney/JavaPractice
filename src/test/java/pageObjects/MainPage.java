package pageObjects;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;


public class MainPage {
    private WebDriver driver;
    private FluentWait<WebDriver> fluentWait;
    public MainPage(WebDriver driver){
        this.driver = driver;
    }
    public boolean isMain(){
        var list = driver.findElements(By.xpath("//*[@class='fa fa-sign-out control'"));
        return list.size()==1;
    }
    public  void createPlayList (String name){
        fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofMillis(100))
//                .ignoring(ElementClickInterceptedException.class)
//                .ignoring(StaleElementReferenceException.class)
                .ignoring(NoSuchElementException.class);
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String plusX = "//*[@class='fa fa-plus-circle control create']";
        By plusBy = By.xpath(plusX);
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        fluentWait.until(x->x.findElement(plusBy));
        var plusButton = driver.findElement(plusBy);
        plusButton.click();
        var textNewPlaylist = driver.findElement(By.xpath("//*[@type='text'][1]"));
        textNewPlaylist.sendKeys(name);
        textNewPlaylist.sendKeys(Keys.ENTER);

    }
    public boolean checkPlaylist(String name){
        return true;
    }
}
