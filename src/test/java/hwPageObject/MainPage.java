package hwPageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) { super(driver);}


    public WebElement getButtonCreatePlaylist() {
        fluentWait.until(x->x.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']")).isDisplayed() );
        return driver.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']"));
    }
    public WebElement getWindowToSave() {
        return driver.findElement(By.xpath("//*[@class=\"create\"]"));
    }

    public String createPlaylist(String name) {

        getButtonCreatePlaylist().click();
        getWindowToSave().sendKeys(name);
        getWindowToSave().sendKeys(Keys.RETURN);
        String url = driver.getCurrentUrl();
        return url.split("/")[4];
    }


    public boolean checkPlaylist(String id) {
        var list = driver.findElements(By.xpath("//*[@href='#!/playlist/"+id+"']"));
        return list.size()==1;
    }

}
