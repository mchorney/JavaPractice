package UnitTests.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Base64;

    public class LoginPage extends BasePage{

        public LoginPage(WebDriver driver) {
            this.driver = driver;
            wait = new WebDriverWait(driver, 10);
        }

        public MainPage login(String email, String password){
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']")));
            driver.findElement(By.xpath("//input[@type='email']")).sendKeys(email);
            driver.findElement(By.xpath("//input[@type='password']")).sendKeys(new String(Base64.getDecoder().decode(password)));
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            return new MainPage(driver);
        }

        public boolean isError(String email, String password){
            login(email, password);
            WebElement klass = driver.findElement(By.xpath("//div[@class='login-wrapper']/form"));
            wait.until(ExpectedConditions.attributeToBeNotEmpty(klass,"class"));
            return klass.getAttribute("class").equals("error");
        }


    }
