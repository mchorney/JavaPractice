package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.NoSuchElementException;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getEmail() {
        return driver.findElement(By.xpath(LoginPageSelectors.email));
    }
    public WebElement getPassword() {
        return driver.findElement(By.xpath(LoginPageSelectors.password));
    }
       public WebElement getLoginButton() {
        return driver.findElement(By.xpath(LoginPageSelectors.loginButton);
    }

    public MainPage loginToApp(String email, String password) {
        getEmail().sendKeys(email);
        getPassword().sendKeys(password);
        getLoginButton().click();
        return new MainPage(driver);
    }
    public boolean isError() {
        // наличие "красной рамки"
//        String border_color = getError().getCssValue("border-color");
//        String expected_border_color = "rgb(142, 73, 71)";
//        return expected_border_color.equals(border_color);

//        размер массива с этими элементами равен 1
//        List errors = driver.findElements(By.xpath("//*[@class='error']"));
//        return errors.size()==1;

// лучше всего для подтверждения наличия/отсутсыия элемента на странице
        try{
            driver.findElement(By.xpath(LoginPageSelectors.errorElement));
        } catch(NoSuchElementException e) {
            return false;
        }
        return true;
    }
}
