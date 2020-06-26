package UnitTests.PageObjects;

import UnitTests.PageObjects.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Base64;

    public class LoginPage {
        private WebDriver driver;
        WebDriverWait wait;

        public LoginPage(WebDriver driver, WebDriverWait wait) {
            this.driver = driver;
            this.wait = wait;
        }

        public MainPage login(String email, String password) throws InterruptedException {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']")));
            driver.findElement(By.xpath("//input[@type='email']")).sendKeys(email);
            driver.findElement(By.xpath("//input[@type='password']")).sendKeys(new String(Base64.getDecoder().decode(password)));
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            Thread.sleep(2000);
            return new MainPage(driver, wait);
        }

        public boolean isError(String email, String password) throws InterruptedException {
            login(email, password);
            WebElement klass = driver.findElement(By.xpath("//div[@class='login-wrapper']/form"));
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='login-wrapper']/form")));
            return klass.getAttribute("class").equals("error");
        }


    }
