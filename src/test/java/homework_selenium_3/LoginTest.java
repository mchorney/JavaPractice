package homework_selenium_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LoginTest {
    WebDriver driver;
    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://koelapp.testpro.io");
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
    @Test
    public void loginTest_CorrectCredentials_LoggedToApp() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);
        MainPage mainPage = loginPage.loginToApp("testpro.user03@testpro.io","te$t$tudent");
        //pageObjects
        Assert.assertTrue(mainPage.isMain());

        WebElement allSongs = driver.findElement(By.xpath("//*[contains(@class,'active')]"));
        allSongs.click();

        //siblings: find 5 elements using - parent , grand parent, prev sibling, follow sibling, far sibling
        //define isError method in LoginPage

        //parent
        List<WebElement> isFound = driver.findElements(By.xpath("//tr[@item-index='0']//*[contains(text(),'Opening')]"));
        Assert.assertEquals(isFound.size(), 1);

        //grand parent
        isFound = driver.findElements(By.xpath("//*[@class='items']//*[contains(text(),'Opening')]"));
        Assert.assertEquals(isFound.size(), 1);

        //following sibling
        isFound = driver.findElements(By.xpath("//tr[@item-index='0']//*[contains(text(),'Opening')]/following-sibling::*[1]"));
        Assert.assertEquals(isFound.size(), 1);

        //preceding sibling
        isFound = driver.findElements(By.xpath("//*[@class='items']//*[contains(text(),'Opening')]/preceding-sibling::*[1]"));
        Assert.assertEquals(isFound.size(), 1);

        //far sibling
        isFound = driver.findElements(By.xpath("//*[@class='items']//*[contains(text(),'Opening')]/following-sibling::*[@class='album']"));
        Assert.assertEquals(isFound.size(), 1);
        //Assert.assertTrue(loginPage.isError(isFound));
    }

}
