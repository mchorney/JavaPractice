package UnitTests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

public class hw23 {
    private WebDriver driver;
    private WebElement error1;

    @BeforeMethod
    void startUp(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com");

    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void clickOnSecondSlider() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        var womenButton = driver.findElement(By.xpath("//*[contains(@title, 'You will find')]"));
        womenButton.click();
        Thread.sleep(3000);
//        var womenCheck = driver.findElement(By.xpath("//*[contains(@title, 'Women')]"));
//        String colorString = womenCheck.getCssValue("background-color");
//        //String[] arrColor = colorString.split("#");
//        //Assert.assertTrue(arrColor[1].equals("333333"));
//        System.out.println(colorString);
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "http://automationpractice.com/index.php?id_category=3&controller=category" );

    }

}