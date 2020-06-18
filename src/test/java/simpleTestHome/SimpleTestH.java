package simpleTestHome;


;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class SimpleTestH {
    private WebDriver driver;

    @AfterMethod
    public void tearDown()throws  InterruptedException{
        Thread.sleep(5000);
        driver.quit();
    }
    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
    }


    @Test
    public void simpleTest_Login() throws  InterruptedException {


        driver.get("https://koelapp.testpro.io");
        Thread.sleep(2000);

        WebElement loginEmail = driver.findElement(By.xpath("//*[@type='email']"));
        loginEmail.sendKeys("koeluser03@testpro.io");

        WebElement loginPassword = driver.findElement(By.xpath("//*[@type='password']"));
        loginPassword.sendKeys("te$t$tudent");

        WebElement loginSubmit = driver.findElement(By.xpath("//*[@type='submit']"));
        loginSubmit.click();

        Thread.sleep(3000);

        List<WebElement> list=new ArrayList<>();
        list=driver.findElements(By.xpath("//*[@class='name']"));

        Assert.assertNotEquals(list.size(),0);

    }

        @Test
        public void simpleTest_wrongEmail() throws  InterruptedException {

            driver.get("https://koelapp.testpro.io");
            Thread.sleep(2000);

            WebElement loginEmail=driver.findElement(By.xpath("//*[@type='email']"));
            loginEmail.sendKeys("koeluser03@testpro1.io");

            WebElement loginPassword=driver.findElement(By.xpath("//*[@type='password']"));
            loginPassword.sendKeys("te$t$tudent");

            WebElement loginSubmit=driver.findElement(By.xpath("//*[@type='submit']"));
            loginSubmit.click();
            Thread.sleep(3000);

            List<WebElement> list=new ArrayList<>();
            list=driver.findElements(By.className("error"));

            Assert.assertEquals(list.size(),1);

//            Assert.assertEquals(" //*[@class='error']"," //*[@class='error']");

//            WebElement error=driver.findElement(By.xpath(" //*[@class='error']"));
//            error.isDisplayed();


    }
}
