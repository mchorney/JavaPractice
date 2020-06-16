package homework_selenium_1;
//1 - Create a test to Login Koel app using correct credentials
//Assert
//2 - Optional. Create a test to Login Koel app using incorrectcorrect credentials
//Assert red frame

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class selenium_1 {

    //Login with correct credentials
    @Test
    public void selenium_1_KoelLogIn_PageOpened() throws InterruptedException {
        //Arrange
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://koelapp.testpro.io");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        //Act
        WebElement searchFieldEmail = driver.findElement(By.xpath("(//*[@type='email'])"));
        searchFieldEmail.sendKeys("koeluser03@testpro.io");

        WebElement searchFieldPass = driver.findElement(By.xpath("(//*[@type='password'])"));
        searchFieldPass.sendKeys("te$t$tudent");

        WebElement searchButtonLogin = driver.findElement(By.xpath("(//*[@type='submit'])"));
        searchButtonLogin.click();

        String title = driver.getTitle();
//
//        //Assert - checking page title

        Assert.assertEquals(title,"Koel");
        Thread.sleep(5000);
        driver.quit();
    }

    //incorrect credentials
    @Test
    public void selenium_1_NegativeTest_PageOpened() throws InterruptedException {
        //Arrange
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://koelapp.testpro.io");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        //Act
        WebElement searchFieldEmail = driver.findElement(By.xpath("(//*[@type='email'])"));
        searchFieldEmail.sendKeys("koeluser03@testpro.io");

        WebElement searchFieldPass = driver.findElement(By.xpath("(//*[@type='password'])"));
        searchFieldPass.sendKeys("te$t$tudent1");
        searchFieldPass.sendKeys(Keys.ENTER);
        Thread.sleep(5000);

        //Assert - #8e4947

        WebElement form = driver.findElement(By.xpath("(//form[@class='error'])"));
        String color = form.getCssValue("border-color");
        System.out.println(color);

        //converting rgb format into hex
        String[] hexValue = color.replace("rgb(", "").replace(")", "").split(",");

        int hexValue1=Integer.parseInt(hexValue[0]);
        hexValue[1] = hexValue[1].trim();
        int hexValue2=Integer.parseInt(hexValue[1]);
        hexValue[2] = hexValue[2].trim();
        int hexValue3=Integer.parseInt(hexValue[2]);

        String actualColor = String.format("#%02x%02x%02x", hexValue1, hexValue2, hexValue3);

        Assert.assertEquals("#8e4947", actualColor);

        Thread.sleep(5000);
        driver.quit();
    }
}
