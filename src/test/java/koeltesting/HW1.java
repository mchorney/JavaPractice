package koeltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HW1 {
    @Test
    public void hw1_putEmailPassword_openPage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://koelapp.testpro.io/");
        WebElement email = driver.findElement(By.xpath("//*[@type='email']"));
        WebElement password = driver.findElement(By.xpath("//*[@type=\"password\"]"));
        WebElement logIn = driver.findElement(By.xpath("//*[@type=\"submit\"]"));
        email.sendKeys("koeluser03@testpro.io");
        password.sendKeys("te$t$tudent");
        logIn.click();

        Thread.sleep(3000);

        String userName = driver.g
        Assert.assertEquals ("//span[@class=\"name\"]")
        Thread.sleep(5000);
        driver.quit();

    }
}
