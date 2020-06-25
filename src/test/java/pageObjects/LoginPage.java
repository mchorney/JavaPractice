package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class LoginPage {
    private WebDriver driver;
    private FluentWait<WebDriver> fluentWait;

    public WebElement getEmail() {
        return driver.findElement(By.xpath("//input[@type='email']"));
    }
    public WebElement getPassword() {
        return driver.findElement(By.xpath("//input[@type='password']"));
    }
    public WebElement getLoginButton() {
        return driver.findElement(By.xpath("//button[@type='submit']"));
    }

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public MainPage loginToApp(String email, String password){
        fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofMillis(100))
//                .ignoring(ElementClickInterceptedException.class)
//                .ignoring(StaleElementReferenceException.class)
                .ignoring(NoSuchElementException.class);
        fluentWait.until(x->x.findElement(By.xpath("//input[@type='email']")));
        getEmail().sendKeys(email);
        getPassword().sendKeys(password);
        getLoginButton().click();
        return new MainPage(driver);
    }
    public boolean isError(){
        return true;
    }
}

