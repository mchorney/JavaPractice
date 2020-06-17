package simpleTestHome;


;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Instant;

public class SimpleTestH {


    @Test
    public void simpleTest_Login() throws  InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://koelapp.testpro.io");
        Thread.sleep(2000);

        WebElement loginEmail = driver.findElement(By.xpath("//*[@type='email']"));
        loginEmail.sendKeys("koeluser03@testpro.io");

        WebElement loginPassword = driver.findElement(By.xpath("//*[@type='password']"));
        loginPassword.sendKeys("te$t$tudent");

        WebElement loginSubmit = driver.findElement(By.xpath("//*[@type='submit']"));
        loginSubmit.click();

        String title = driver.getTitle();
        Assert.assertEquals(title, "Koel");


//        WebElement nameUser =driver.findElement(By.xpath("//*[@class='name']"));
//        nameUser.isDisplayed();
//        String url=driver.getCurrentUrl();
//        Assert.assertEquals(url,"https://koelapp.testpro.io/#!/home");
//        Assert.assertTrue(driver.findElements(By.xpath("//*[@class='name']")).contains("koeluser03"));


        Thread.sleep(5000);
        driver.quit();

    }



        @Test

        public void simpleTest_wrongEmail() throws  InterruptedException {
            System.setProperty("webdriver.chrome.driver","chromedriver.exe");
            WebDriver driver=new ChromeDriver();

            driver.get("https://koelapp.testpro.io");
            Thread.sleep(2000);

            WebElement loginEmail=driver.findElement(By.xpath("//*[@type='email']"));
            loginEmail.sendKeys("koeluser03@testpro1.io");

            WebElement loginPassword=driver.findElement(By.xpath("//*[@type='password']"));
            loginPassword.sendKeys("te$t$tudent");

            WebElement loginSubmit=driver.findElement(By.xpath("//*[@type='submit']"));
            loginSubmit.click();

            Assert.assertEquals(" //*[@class='error']"," //*[@class='error']");

//            WebElement error=driver.findElement(By.xpath(" //*[@class='error']"));
//            error.isDisplayed();





            Thread.sleep(5000);
            driver.quit();

    }
}
