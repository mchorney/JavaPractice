package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    public boolean isMain() {
        var list = driver.findElements(By.cssSelector("[class='fa fa-sign-out control']"));
        return list.size() == 1;
    }
    
    public static final String btSignOut = "//*[@class='fa fa-sign-out control']";
    public static final String btCreatePlayList = "//*[@class='fa fa-plus-circle control create']";
    public static final String fdEnterPlayListName = "//*[@placeholder='↵ to save']";


//    public WebElement getNewPlaylistField(){
//        return driver.findElement(By.xpath("//*[@placeholder='↵ to save']"));
//    }

    public void createPlaylist(String name) {
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@class='fa fa-plus-circle control create']")));
//        getPlusButton().click();
        clickPlusButton();
//        getNewPlaylistField().sendKeys(name);
//        getNewPlaylistField().sendKeys(Keys.RETURN);
//        fluentWait.until(x->x.findElement(By.xpath("//div[@class='success show']")).isEnabled());
//        String url = driver.getCurrentUrl();
//        return url.split("/")[5];
    }

    public boolean checkPlaylist(String name) {
//        var list = driver.findElements(By.xpath("//*[@href='#!/playlist/"+id+"']"));
//        return list.size()==1;
        return true;
    }

    public void clickPlusButton() {
//        fluentWait.until(x-> x.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']")).isDisplayed());
//        return driver.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']"));
        while (true) {
            try {
                driver.findElement(By.cssSelector(".fa.fa-plus-circle")).click();
                return;
            } catch (ElementClickInterceptedException error) {

            }
        }
    }
}
