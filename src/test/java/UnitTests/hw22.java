package UnitTests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class hw22 {
    private WebElement error1;

    @Test
    public void simpleTest3() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://koelapp.testpro.io/");
        Thread.sleep(2000);
        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys("testpro.user03@testpro.io");
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("te$t$tedent");
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        Thread.sleep(7000);
//        WebElement logOut = driver.findElement(By.xpath("//i[@class='fa fa-sign-out control']"));
//        loginButton.click();
//        Thread.sleep(7000);
        //try{
//            xx.get(5);
//            //throw ex;
//        } catch (Exception ex){
//            System.out.println(ex);
//        } finally {
//            System.out.printf("anyway");
//        }
        boolean result;
        try {
            error1 = driver.findElement(By.xpath("//*[@class='error']"));
            result = false;
        } finally {

        }


        Assert.assertEquals(result, true);

        driver.quit();
    }
}
