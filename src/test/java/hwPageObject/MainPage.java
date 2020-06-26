package hwPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class MainPage {
    private WebDriver driver;
    private FluentWait<WebDriver> fluentWait;


    public MainPage(WebDriver driver) {
        this.driver = driver;
        fluentWait = new FluentWait<>(driver)
            .withTimeout(Duration.ofSeconds(20))
            .pollingEvery(Duration.ofMillis(100));
    }


    public WebElement getButtonCreatePlaylist() {
        return driver.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']"));
    }

    public WebElement getWindowToSave() {
        return driver.findElement(By.xpath("//*[@class=\"create\"]"));
    }

    public WebElement getClickOnTop10() {
        return driver.findElement(By.xpath("//*[@href=\"#!/playlist/4843\"]"));
    }


    public void createPlaylist(String name) {

        getButtonCreatePlaylist().click();
        getWindowToSave().click();
        getClickOnTop10().click();


//        WebElement buttonWomen = driver.findElement(By.xpath("(//*[@href=\"http://automationpractice.com/index.php?id_category=3&controller=category\"])[2]"));
//        buttonWomen.click();

    }

    public boolean checkPlaylist(String name) {
        var isCheckPlaylist = driver.findElements(By.xpath("\"//*[@href=\\\"#!/playlist/4843\\\"]\""));
        return true;
    }

}
