package simpleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTest {
    /*
    @Test
    public void simpleTest_ClickElephant_PageOpened() throws InterruptedException {
        //Arrange
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://udemy.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        //Act
        WebElement elephant = driver.findElement(By.xpath("//*[contains(@src,'762616')]"));
        elephant.click();

        String title = driver.getTitle();

        //Assert
        Assert.assertEquals(title,"The Complete SQL Bootcamp for the Manipulation and Analysis of Data | Udemy");

        Thread.sleep(5000);
        driver.quit();
    }*/
    @Test
    public void simpleTest_SearchJava_PageOpened() throws InterruptedException {
        //Arrange
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://udemy.com");
//        driver.manage().window().maximize();
        Thread.sleep(2000);
        //Act
        WebElement searchField = driver.findElement(By.xpath("(//*[@name='q'])"));
        searchField.sendKeys("Java");
        searchField.sendKeys(Keys.ENTER);
//        WebElement searchButton = driver.findElement(By.xpath("(//*[@class='udi udi-search'])[3]"));
//        searchButton.click();


        String title = driver.getTitle();
//
//        //Assert

        Assert.assertEquals(title,"Online Courses - Anytime, Anywhere | Udemy");
        Thread.sleep(5000);
        driver.quit();
    }
}
