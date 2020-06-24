package UnitTests.ObjectTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Base64;

public class LoginPage {
    private WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public MainPage login(String email, String password, WebDriverWait wait) throws InterruptedException {
        //wait = new WebDriverWait(driver, 5);
        this.wait = wait;
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']")));
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(new String(Base64.getDecoder().decode(password)));
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userBadge")));
        return new MainPage(driver, wait);
    }

    public boolean isError(String email, String password, WebDriverWait wait) throws InterruptedException {
        login(email, password, wait);
        WebElement klass = driver.findElement(By.xpath("//div[@class='login-wrapper']/form"));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='login-wrapper']/form")));
        Assert.assertEquals(klass.getCssValue("border-color"), "rgb(142, 73, 71)");
        Assert.assertEquals(klass.getAttribute("class"), "error");

        return true;
    }

}



