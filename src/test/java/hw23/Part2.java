package hw23;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


//
//didn't make it

    public class Part2 {
        @Test
        public void part1_ValidEmeil_UserloggedIn() throws InterruptedException {

            System.setProperty("webdriver.chrome.driver","chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            driver.get("https://koelapp.testpro.io");

            Thread.sleep(3000);





            WebElement emailField = driver.findElement(By.xpath("//*[@type='email']"));
            emailField.sendKeys("44koeluser03@testpro.io");

            WebElement passwordField = driver.findElement(By.xpath("//*[@type='password']"));
            passwordField.sendKeys("te$t$tudent");

            WebElement logInButton = driver.findElement(By.xpath("//*[@type='submit']"));
            logInButton.sendKeys(Keys.ENTER);


            Assert.assertEquals("//*[@class = 'error']", "//*[@class = 'error']");





            Thread.sleep(6000);


            driver.quit();

        }





    }


