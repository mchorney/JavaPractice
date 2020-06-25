package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

public class LoginPage {
    private WebDriver driver;
    private FluentWait<WebDriver> fluentWait;

    public LoginPage(WebDriver driver, FluentWait<WebDriver> fluentWait) {
        this.driver = driver;
        this.fluentWait=fluentWait;
    }

    public MainPage loginToApp(String email, String password){
        getEmail().sendKeys(email);
        getPassword().sendKeys(password);
        getLoginButton().click();
        return new MainPage(driver, fluentWait);
    }

    public boolean isError(){
//        var errors = driver.findElements(By.xpath("//*[@class='error']"));
//        return errors.size()==1;
        try {
            fluentWait.until(x->x.findElement(By.xpath("//*[@class='error']")));
            driver.findElement(By.xpath("//*[@class='error']"));
        } catch (NoSuchElementException error){
            return false;
        }
        return true;
    }
    public WebElement getEmail() {
        fluentWait.until(x->x.findElement(By.xpath("//*[@type='email']")));
        return

                driver.findElement(By.xpath("//*[@type='email']"));
    }

    public WebElement getPassword() {
        fluentWait.until(x->x.findElement(By.xpath("//*[@type='password']")));
        return driver.findElement(By.xpath("//*[@type='password']"));
    }

    public WebElement getLoginButton() {
        fluentWait.until(x->x.findElement(By.xpath("//*[@type='submit']")));

        return driver.findElement(By.xpath("//*[@type='submit']"));
    }


}
