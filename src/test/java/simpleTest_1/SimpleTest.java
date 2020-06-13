package simpleTest_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTest {
    @Test
    public void simpleTest_ClickElephant_PageOpened() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://udemy.com");
        Thread.sleep(5000);

        WebElement elephant = driver.findElement(By.xpath("//*[contains(@src,'762616')]"));
        elephant.click();

        String title = driver.getTitle();

        Assert.assertEquals(title, )




        Thread.sleep(5000);
        driver.quit();
    }
}
