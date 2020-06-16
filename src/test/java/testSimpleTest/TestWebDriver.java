package testSimpleTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class TestWebDriver {
    @Test
    public void simpleTest_ClickElephant() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://udemy.com");

        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[contains(@src,'762616')]")).click();
        String title = driver.getTitle();
        Assert.assertEquals(title, "The Complete SQL Bootcamp for the Manipulation and Analysis of Data | Udemy");

        Thread.sleep(3000);
        driver.quit();
    }

}
