package shw6_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KoelappLoginPage {
    private WebDriver driver;

    public KoelappLoginPage (WebDriver driver) {
        this.driver = driver;
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

    public KoelappMainPage loginToApp (String login, String password){
        getEmail().sendKeys(login);
        getPassword().sendKeys(password);
        getLoginButton().click();
        return new KoelappMainPage (driver);
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
