package hw4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class LoginPage {
    private WebDriver driver;
    private FluentWait<WebDriver> fluentWait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void MainPage(WebDriver driver) {
        this.driver=driver;
        fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(20));
    }

    public WebElement getEmail() {
        return driver.findElement(By.xpath("//*[@type='email']"));
    }

    public WebElement getPassword() {
        return driver.findElement(By.xpath("//*[@type='password']"));
    }

    public WebElement getLoginButton() {
        return driver.findElement(By.xpath("//*[@type='submit']"));
    }


    public MainPage loginToApp (String login, String password){
        getEmail().sendKeys(login);
        getPassword().sendKeys(password);
        getLoginButton().click();
        return new MainPage(driver);
    }
    public boolean isError(String login, String password){
        getEmail().sendKeys(login);
        getPassword().sendKeys(password);
        getLoginButton().click();
        WebElement check = driver.findElement(By.xpath("//*[@class='error']"));
        check.isEnabled();
        return true;
    }

}
