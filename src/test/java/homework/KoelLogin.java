package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class KoelLogin {
//    @Test
//    public void LoginWithValidCredentials() throws InterruptedException {
//        //Arrange
//        System.setProperty("webdriver.chrome.driver", "chromedriver");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://koelapp.testpro.io/");
//        Thread.sleep(1000);
//        driver.manage().window().maximize();
//        //Act
//        WebElement email_field = driver.findElement(By.xpath("//*[@type='email']"));
//        email_field.sendKeys("koeluser21@testpro.io");
//        WebElement password_field = driver.findElement(By.xpath("//*[@type='password']"));
//        password_field.sendKeys("te$t$tudent");
//        WebElement login_button = driver.findElement(By.xpath("//*[@type='submit']"));
//        login_button.sendKeys(Keys.ENTER);
//        //Assertion
//        String title = driver.getTitle();
//        Assert.assertEquals(title, "Koel");
//        driver.quit();
//    }
    @Test
    public void LoginWithInvalidCredentials() throws InterruptedException {
        //Arrange
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://koelapp.testpro.io/");
        Thread.sleep(1000);
        //Act
        WebElement email_field = driver.findElement(By.xpath("//*[@type='email']"));
        email_field.sendKeys("koellluser21@testpro.io");
        WebElement password_field = driver.findElement(By.xpath("//*[@type='password']"));
        password_field.sendKeys("teststudent");
        WebElement login_button = driver.findElement(By.xpath("//*[@type='submit']"));
        login_button.sendKeys(Keys.ENTER);
        //Assertion

        // ? почему-то не могу достать class="error" value - и с использованием ClassName, и с Xpath
        //List<WebElement> errors_elements = driver.findElements(By.xpath("//*[@class='error']"));
        List<WebElement> errors_elements = driver.findElements(By.className("error"));
        System.out.println(errors_elements.size());
        Assert.assertEquals(errors_elements.size(), 1);

        // ? так просто не находит элемент
        //WebElement element1 = driver.findElement(By.className("error"));
        //System.out.println(element1);
        driver.quit();
    }
}


