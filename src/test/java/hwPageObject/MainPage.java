package hwPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement getButtonCreatePlaylist() {
        return driver.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']"));
    }

    public WebElement getWindowToSave() {
        return driver.findElement(By.xpath("//*[@class=\"create\"]"));
    }

    public WebElement getClickOnTop10() {
        return driver.findElement(By.xpath("//*[@href=\"#!/playlist/4843\"]"));
    }


    public void createPlaylist(String Top10) {

      getButtonCreatePlaylist().click();
      getWindowToSave().click();
      getClickOnTop10().click();



//        WebElement buttonWomen = driver.findElement(By.xpath("(//*[@href=\"http://automationpractice.com/index.php?id_category=3&controller=category\"])[2]"));
//        buttonWomen.click();

    }

    public boolean checkPlaylist(String Top10) {
        var isCheckPlaylist = driver.findElements(By.xpath("\"//*[@href=\\\"#!/playlist/4843\\\"]\""));
        return true;
    }
}
