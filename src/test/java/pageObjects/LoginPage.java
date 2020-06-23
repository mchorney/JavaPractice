package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;
    WebElement email;
    WebElement password;
    WebElement loginButton;
    WebElement error;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getEmail() {
        return driver.findElement(By.xpath("//*[@type='email']"));
    }
    public WebElement getPassword() {
        return driver.findElement(By.xpath("//*[@type='password']"));
    }
    public WebElement getError() {
        return driver.findElement(By.className("error"));
    }
    public WebElement getLoginButton() {
        return driver.findElement(By.xpath("//*[@type='submit']"));
    }
    public MainPage loginToApp(String email, String password) {
        getEmail().sendKeys(email);
        getPassword().sendKeys(password);
        getLoginButton().click();
        return new MainPage(driver);
    }
    public boolean isError() {
        String border_color = getError().getCssValue("border-color");
        String expected_border_color = "rgb(142, 73, 71)";
        return expected_border_color.equals(border_color);
    }
}
