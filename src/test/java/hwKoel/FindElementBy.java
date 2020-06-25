package hwKoel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FindElementBy {
    private WebDriver driver;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--no-sandbox");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }


    @Test
    public void FindArtistByParent() throws InterruptedException {
        driver.get("https://koelapp.testpro.io/");
        Thread.sleep(3000);


        WebElement email = driver.findElement(By.cssSelector("[type='email']"));
        WebElement password = driver.findElement(By.cssSelector("[type='password']"));
        WebElement loginButton = driver.findElement(By.xpath("//*[contains(@type,'subm')]"));

        email.sendKeys("testpro.user03@testpro.io");
        password.sendKeys("te$t$tudent");
        loginButton.click();

        String title = driver.getTitle();
        Assert.assertEquals(title,"Koel");

        Assert.assertEquals("//*[@class = 'error']", "//*[@class = 'error']");

//        WebElement home = driver.findElement(By.xpath("//*[@class='home active']"));
//        home.click();
        Thread.sleep(4000);

        WebElement artistByParent = driver.findElement(By.xpath("//*[@class='header clear']/*[@class ='artist']"));
        artistByParent.click();
        Thread.sleep(4000);

    }

    @Test
    public void FindArtistByFolSibling() throws InterruptedException {
        driver.get("https://koelapp.testpro.io/");
        Thread.sleep(2000);


        var email = driver.findElement(By.cssSelector("[type='email']"));
        var password = driver.findElement(By.cssSelector("[type='password']"));
        var loginButton = driver.findElement(By.xpath("//*[contains(@type,'subm')]"));


        email.sendKeys("testpro.user03@testpro.io");
        password.sendKeys("te$t$tudent");
        loginButton.click();
        String title = driver.getTitle();
        Assert.assertEquals(title, "Koel");

        Assert.assertEquals("//*[@class = 'error']", "//*[@class = 'error']");
        Thread.sleep(4000);

        var artistByFollowingSibling = driver.findElement(By.xpath("//*[@class ='lyrics active'] /following-sibling::a [contains(text(), 'Artist')]"));
        artistByFollowingSibling.click();
        Thread.sleep(4000);
        }


        @Test
        public void FindArtistByPreSibling() throws InterruptedException {
            driver.get("https://koelapp.testpro.io/");
            Thread.sleep(2000);


            var email = driver.findElement(By.cssSelector("[type='email']"));
            var password = driver.findElement(By.cssSelector("[type='password']"));
            var loginButton = driver.findElement(By.xpath("//*[contains(@type,'subm')]"));


            email.sendKeys("testpro.user03@testpro.io");
            password.sendKeys("te$t$tudent");
            loginButton.click();
            String title = driver.getTitle();
            Assert.assertEquals(title, "Koel");

            Assert.assertEquals("//*[@class = 'error']", "//*[@class = 'error']");
            Thread.sleep(4000);

            var artistByPrecidingSibling = driver.findElement(By.xpath("//*[@class ='album'] /preceding-sibling::a [contains(text(), 'Artist')]"));
            artistByPrecidingSibling.click();
            Thread.sleep(4000);

    }

    @Test
    public void FindArtistByFarSibling() throws InterruptedException {
        driver.get("https://koelapp.testpro.io/");
        Thread.sleep(2000);


        var email = driver.findElement(By.cssSelector("[type='email']"));
        var password = driver.findElement(By.cssSelector("[type='password']"));
        var loginButton = driver.findElement(By.xpath("//*[contains(@type,'subm')]"));


        email.sendKeys("testpro.user03@testpro.io");
        password.sendKeys("te$t$tudent");
        loginButton.click();
        String title = driver.getTitle();
        Assert.assertEquals(title, "Koel");

        Assert.assertEquals("//*[@class = 'error']", "//*[@class = 'error']");
        Thread.sleep(4000);

        var artistByFarSibling = driver.findElement(By.xpath("//*[@class ='youtube'] /preceding-sibling::a [contains(text(), 'Artist')]"));
        artistByFarSibling.click();
        Thread.sleep(4000);


    }






    }
