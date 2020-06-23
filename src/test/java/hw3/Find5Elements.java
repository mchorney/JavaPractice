package hw3;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Find5Elements {
    private WebDriver driver;
    private FluentWait<WebDriver> fluentWait;

    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(NoSuchElementException.class);
        driver.get("https://koelapp.testpro.io/");
        fluentWait.until(x->x.findElement(By.xpath("//*[@type='email']")));

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void findElements() {

        LoginPage lp = new LoginPage(driver);
        MainPage mp = lp.loginToApp("testpro.user03@testpro.io","te$t$tudent");
        fluentWait.until(x->x.findElement(By.xpath("//*[@class='fa fa-sign-out control']")));
        Assert.assertTrue(mp.isMain());

        var parent = driver.findElement(By.xpath("//section[@class='recent']/h1"));
        var grandParent = driver.findElement(By.xpath("//div[@id='playerControls']/span[@class='play control']/i"));
        var followSib = driver.findElement(By.xpath("//h1[contains(text(),\"Your Music\")]/following-sibling::ul[@class='menu']"));
        var farSib = driver.findElement(By.xpath("//div[@class='two-cols']/following-sibling::section[2]"));
        var prevSibl = driver.findElement(By.xpath("//div[@class='song-list-wrap main-scroll-wrap queue']/preceding-sibling::h1"));

        Assert.assertTrue(parent.isEnabled(),"I'm your father!");
        Assert.assertTrue(grandParent.isEnabled(),"I'm your GRANDfather!");
        Assert.assertTrue(followSib.isEnabled(),"I'm your brother!");
        Assert.assertTrue(farSib.isEnabled(),"I'm your cousin!");
        Assert.assertTrue(prevSibl.isEnabled(),"I'm your older cousin!");

    }

}
