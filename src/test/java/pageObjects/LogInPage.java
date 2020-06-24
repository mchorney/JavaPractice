package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {
    private WebDriver driver;

    public WebElement getEmail() {
        return driver.findElement(By.xpath("//*[@type=\"email\"]"));
    }

    public WebElement getPassword() {
        return driver.findElement(By.xpath("//*[@type=\"password\"]"));
    }

    public WebElement getLoginButton() {
        return driver.findElement(By.xpath("//*[@type=\"submit\"]"));
    }

    public LogInPage(WebDriver driver) {
        this.driver = driver;
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
