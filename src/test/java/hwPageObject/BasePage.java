package hwPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public abstract class BasePage {
    protected WebDriver driver;
    protected FluentWait<WebDriver> fluentWait;
    Actions actions = new Actions(driver);
    WebElement rpl = driver.findElement(By.xpath("//*[@href='#!/playlist/5125'"));

    public  BasePage(WebDriver driver) {
        this.actions = new Actions(driver)
            .doubleClick(rpl);
        actions.doubleClick(rpl).perform();
        System.out.println("button double clicked");
        this.driver = driver;
        this.fluentWait = new FluentWait<WebDriver>(driver)
            .withTimeout(Duration.ofSeconds(20))
            .pollingEvery(Duration.ofMillis(100));
    }



}
