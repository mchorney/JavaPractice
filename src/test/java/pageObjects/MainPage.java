package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public boolean isMain() {
        var list = driver.findElements(By.xpath(btSignOut));
        return list.size()==1;
    }

    public static final String btSignOut = "//*[@class='fa fa-sign-out control']";
    public static final String btCreatePlayList = "//*[@class='fa fa-plus-circle control create']";
    public static final String fdEnterPlayListName = "//*[@placeholder='↵ to save']";


    public void createPlaylist(String name) throws InterruptedException {
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(btCreatePlayList)));
        //fluentWait.until(x->x.findElement(By.xpath(btCreatePlayList)).isSelected());
        clickPlusButton();
//        driver.findElement(By.xpath(btCreatePlayList)).click();
//        driver.findElement(By.xpath(fdEnterPlayListName)).sendKeys(name);
    }

    public boolean checkPlaylist(String name) {
        return true;
    }

    public void clickPlusButton(){
        while(true) {
            try {
                driver.findElement(By.cssSelector(".fa.fa-plus-circle")).click();
                return;
            } catch (ElementClickInterceptedException error) {

            }
        }
        //fluentWait.until(x->x.findElement(By.cssSelector(".fa.fa-plus-circle")).isEnabled());
        //wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".fa.fa-plus-circle")));
    }
}
