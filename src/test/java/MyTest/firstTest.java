package MyTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.JsonOutput;
import org.testng.Assert;
import org.testng.annotations.Test;

public class firstTest {
    @Test
    public void loginToKotlin() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://koelapp.testpro.io/");
        //positive login into koelapp site
       // WebElement email = driver.findElement(By.xpath("//*[@id=\"app\"]/div/form/input[@type='email']"));
        //*[@id="app"]/div/form
        //*[@id="app"]/div/form/input[@type="email"]
        //*[@id="app"]/div/form/input[1]
        //*[@type="email"]
        Thread.sleep(2000);
        WebElement email = driver.findElement(By.xpath("//*[@type=\"email\"]"));
        email.click();
        email.sendKeys("testpro.user03@testpro.io");
        WebElement password = driver.findElement(By.xpath("//*[@type=\"password\"]"));
        password.sendKeys("te$t$tudent");
        WebElement button = driver.findElement(By.xpath("//*/form/button"));
        button.click();
        //*[@id="sidebar"]/section[1]/h1
        String title = driver.getTitle();
        Assert.assertEquals(title,"Koel");



        Thread.sleep(8000);
        driver.quit();

    }

    public void incorrectLogin() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://koelapp.testpro.io/");
        //positive login into koelapp site
        // WebElement email = driver.findElement(By.xpath("//*[@id=\"app\"]/div/form/input[@type='email']"));
        //*[@id="app"]/div/form
        //*[@id="app"]/div/form/input[@type="email"]
        //*[@id="app"]/div/form/input[1]
        //*[@type="email"]
        Thread.sleep(2000);
        WebElement email = driver.findElement(By.xpath("//*[@type=\"email\"]"));
        email.click();
        email.sendKeys("testpro.user03@testpro.io");
        WebElement password = driver.findElement(By.xpath("//*[@type=\"password\"]"));
        password.sendKeys("te");
        WebElement button = driver.findElement(By.xpath("//*/form/button"));
        button.click();
  //      WebElement error = driver.findElement(By.className("error"));
        Thread.sleep(1000);
        WebElement errorBorder = driver.findElement(By.xpath("//*[@data-v-e0457900][@class=\"error\"]"));
        String rgbBorder = errorBorder.getCssValue("border-color");
        System.out.println(rgbBorder);
        //expected border-color: #8e4947

        Assert.assertEquals(rgbBorder,"rgb(142, 73, 71)");

    }
}
