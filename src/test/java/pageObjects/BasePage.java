package pageObjects;

<<<<<<< HEAD
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

class BasePage {
=======
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import java.time.Duration;

public abstract class BasePage {
>>>>>>> remotes/origin/master
    protected WebDriver driver;
    protected FluentWait<WebDriver> fluentWait;

    public BasePage(WebDriver driver) {
<<<<<<< HEAD
        fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(NoSuchElementException.class);
        this.driver = driver;
    }

=======
        this.driver = driver;
        this.fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofMillis(100));
    }
>>>>>>> remotes/origin/master
}
