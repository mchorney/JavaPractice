package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class correctCredentials {
    @Test
    public void udemyTest_ClickElephant_PageOpened() throws InterruptedException {

        //Arrange
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://udemy.com");
        Thread.sleep(2000);

        //Act
        WebElement elephant = driver.findElement(By.xpath("//*[contains(@src,'1242800')]"));
        elephant.click();
        String title = driver.getTitle();

        //Assert
        Assert.assertEquals(title, "The Complete SQL Bootcamp for the Manipulation and Analysis of Data | Udemy");

        Thread.sleep(5000);
        driver.quit();

    }
}
