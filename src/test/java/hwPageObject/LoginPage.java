package hwPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {
    private WebDriver driver;


    public WebElement getButtonCreatePlaylist() {
        return driver.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']"));
    }

    public WebElement getWindowToSave() {
        return driver.findElement(By.xpath("//*[@class=\"create\"]"));
    }

    public WebElement getClickOnTop10() {
        return driver.findElement(By.xpath("//*[@href=\"#!/playlist/4843\"]"));
    }

    public LoginPage(WebDriver driver) {
        this.driver = driver;

    }

    public void createPlaylist(String name) {

        getButtonCreatePlaylist().click();
        getWindowToSave().click();
        getClickOnTop10().click();
    }

    public boolean checkPlaylist(String name) {
        getButtonCreatePlaylist().click();
        getWindowToSave().click();
        getClickOnTop10().click();
        return true;
    }
}
