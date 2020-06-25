package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public MainPage loginToApp(String email, String password){
        getEmail().sendKeys(email);
        getPassword().sendKeys(password);
        getLoginButton().click();
        return new MainPage(driver);
    }

    public boolean isError(){

        //Place some logic
        WebElement errorBorder = driver.findElement(By.xpath("//*[@data-v-e0457900][@class=\"error\"]"));
        String rgbBorder = errorBorder.getCssValue("border-color");
        System.out.println(rgbBorder);

//         Assert.assertFalse((rgbBorder == "rgb(142, 73, 71)"),"THE BORDER IS RED");
//         Assert.assertFalse(rgbBorder.isBlank());
        if ((rgbBorder.equals("rgb(142, 73, 71)")))
            return  true;

        else
            return false;
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
