package simpleTestMy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTest {
    @Test
    public void simpleTest_ClickElephant_PageOpened() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://udemy.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        WebElement elephant = driver.findElement(By.xpath("//*[contains(@src\"762616\")]"));
        elephant.click();

        String title = driver.getTitle();

        Assert.assertEquals(title,"The Complete SQL Bootcamp 2020: Go from Zero to Hero");


        Thread.sleep(5000);
        driver.quit();
    }
    @Test
    public void searchTest_ClickElephant_PageOpened() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://udemy.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        WebElement searchField = driver.findElement(By.xpath("//*[@id='search-field-home']"));
        searchField.sendKeys("Java");
//        WebElement searchButton = driver.findElement(By.xpath("//*[@class='udi udi-search'][3]"));
//        searchButton.click();
        searchField.sendKeys(Keys.ENTER);

//        String title = driver.getTitle();
//
//        Assert.assertEquals(title, "The Complete SQL Bootcamp 2020: Go from Zero to Hero");


        Thread.sleep(5000);
        driver.quit();
    }
}
