package simpleTestMy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class SimpleTest {
    private WebDriver driver;

    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException{
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void simpleTest_ClickElephant_PageOpened() throws InterruptedException {
        //startUp();
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
        //startUp();
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

    @Test
    public void login_ToKoel_LoggedToApp() throws InterruptedException {
        //startUp();
        driver.get("https://koelapp.testpro.io");
        // driver.manage().window().maximize();
        Thread.sleep(3000);

        WebElement login = driver.findElement(By.xpath("//*[@type=\"email\"]"));
        login.click();
        login.sendKeys("testpro.user03@testpro.io");

        WebElement password = driver.findElement(By.xpath("//*[@type=\"password\"]"));
        password.click();
        password.sendKeys("te$t$tudent");

        WebElement logInButton = driver.findElement(By.xpath("//*[@type=\"submit\"]"));
        logInButton.click();

        Thread.sleep(3000);

        List<WebElement> list = new ArrayList<>();
        list = driver.findElements(By.xpath("//*[@class =\"fa fa-sign-out control\"]"));

        Assert.assertNotEquals(list.size(),0);
        driver.quit();

    }

    @Test
    public void login_ToKoel_WrongCredentials() throws InterruptedException {
        //startUp();
     //        System.setProperty("webdriver.chrome.driver", "chromedriver");
     //       WebDriver driver = new ChromeDriver();
             driver.get("https://koelapp.testpro.io");
        // driver.manage().window().maximize();
        Thread.sleep(3000);

        WebElement login = driver.findElement(By.xpath("//*[@type=\"email\"]"));
        login.click();
        login.sendKeys("testpro.user03@testpro.io");

        WebElement password = driver.findElement(By.cssSelector("[type=\"password\"]"));
        password.click();
        password.sendKeys("0te$t$tudent");

        WebElement logInButton = driver.findElement(By.cssSelector("[type=\"submit\"]"));
        logInButton.click();

        Thread.sleep(3000);

        List<WebElement> listOfErrors = new ArrayList<>();
        listOfErrors = driver.findElements(By.cssSelector(".error"));

        Assert.assertEquals(listOfErrors.size(),1);
        //driver.quit();

    }
}
