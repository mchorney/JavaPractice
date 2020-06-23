//package SimpleTest;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class simpleTest {
//    @Test
//    public void simpleClick_Elephant() throws InterruptedException {
//       System.setProperty("webdriver.chrome.driver","chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        //Arrange
//        driver.get("https://www.udemy.com/");
//        Thread.sleep(3000);
//        //Act
//        WebElement elephant = driver.findElement(By.xpath("//img[contains(@src,'762616_7693_3')]"));
//        elephant.click();
//        String title = driver.getTitle();
//        //Assert
//        Assert.assertEquals(title, "The Complete SQL Bootcamp for the Manipulation and Analysis of Data | Udemy");
//
//        Thread.sleep(3000);
//        driver.quit();
//    }@Test
//    public void simpleClick_Elephant_ExpectedFail() throws InterruptedException {
//       System.setProperty("webdriver.chrome.driver","chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        //Arrange
//        driver.get("https://www.udemy.com/");
//        Thread.sleep(3000);
//        //Act
//        WebElement elephant = driver.findElement(By.xpath("//img[contains(@src,'762616_7693_3')]"));
//        elephant.click();
//        String title = driver.getTitle();
//        //Assert
//        Assert.assertEquals(title, "Udemy");
//
//        Thread.sleep(3000);
//        driver.quit();
//    }
//
//
//}
