package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LogInPage extends BasePage {

    public LogInPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getEmail() {
        fluentWait.until(x->x.findElement(By.xpath("//*[@type=\"email\"]")));
        return driver.findElement(By.xpath("//*[@type=\"email\"]"));
    }

    public WebElement getPassword() {
        return driver.findElement(By.xpath("//*[@type=\"password\"]"));
    }

    public WebElement getLoginButton() {
        return driver.findElement(By.xpath("//*[@type=\"submit\"]"));
    }



    public MainPage logInToApp(String username, String passcode){
       getEmail().sendKeys(username);
       getPassword().sendKeys(passcode);
       getLoginButton().click();
       return new MainPage(driver);
    }

    public WebElement getRedFrame(){ return driver.findElement(By.xpath("//*[@class=\"error\"]")); }

    public boolean isError() {
     return getRedFrame().isDisplayed();
    }
}
