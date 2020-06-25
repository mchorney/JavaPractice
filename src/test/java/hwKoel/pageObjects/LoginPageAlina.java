package hwKoel.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.MainPage;

import java.util.ArrayList;
import java.util.List;

public class LoginPageAlina<listOfErrors> {
    private WebDriver driver;

    public LoginPageAlina(WebDriver driver) {
        this.driver = driver;
    }

    public MainPageAlina loginToApp(String email, String password) {
        getEmail().sendKeys(email);
        getPassword().sendKeys(password);
        getLoginButton().click();
        return new MainPageAlina(driver);
    }

    public boolean isError() {

        List<WebElement> listOfErrors = new ArrayList<>();
        listOfErrors = driver.findElements(By.cssSelector(".error"));

            if (listOfErrors.isEmpty())
            {
                // element doesn't exist
                return false;
            }
            else
            {
                // element exists, check for visibility
                return listOfErrors.get(0).isDisplayed();
            }
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


}
