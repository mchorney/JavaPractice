package pageObjects;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

class BasePage {
    protected WebDriver driver;
    protected FluentWait<WebDriver> fluentWait;

    public BasePage(WebDriver driver) {
        fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(NoSuchElementException.class);
        this.driver = driver;
    }

}