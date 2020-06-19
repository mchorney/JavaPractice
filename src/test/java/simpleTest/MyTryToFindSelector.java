package simpleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class MyTryToFindSelector {
    private WebDriver driver;
    @BeforeMethod
    public void startUp(){
        System.setProperty("webriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
    @Test
    public void searchForDress() {
        WebElement searchBox = driver.findElement(By.name("search_query"));
        searchBox.sendKeys("dress");
        WebElement searchButton = driver.findElement(By.name("submit_search"));
        searchButton.click();

        List<WebElement> list = driver.findElements(By.xpath("//*[@class='lighter' and contains(text(),'dress')]"));
        Assert.assertTrue(list.size()==1);
    }

    public void clickOnSecondSlider () {
    }
}
