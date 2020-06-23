package pageObjectsHome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
    private WebDriver driver;
    WebElement email;
    WebElement password;
    WebElement loginButton;

    public WebElement getEmail() {
        return driver.findElement(By.xpath("//*[@type='email']"));
    }

    public WebElement getPassword() {
        return driver.findElement(By.xpath("//*[@type='password']"));
    }

    public WebElement getLoginButton() {
        return driver.findElement(By.xpath("//*[@type='submit']"));
    }

    public Loginpage(WebDriver driver) {
        this.driver = driver;




    }
    public Mainpage loginToApp(String email,String password){
       getEmail().sendKeys(email);
       getPassword().sendKeys(password);
       getLoginButton().click();
       return new Mainpage(driver);
    }
    public boolean isError(){
        WebElement error=driver.findElement(By.xpath("//*[@class='error']"));
        error.isEnabled();
        return true;
    }

}
