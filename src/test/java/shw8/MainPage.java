package shw8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isMain() {
        var list =driver.findElements(By.cssSelector("[class='fa fa-sign-out control']"));
        return list.size()==1;
    }

    public WebElement getButtonCreatePlaylist() {
        return driver.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']"));
    }

    public WebElement getButtonToSave() {
        return driver.findElement(By.xpath("//*[@class=\"create\"]"));
    }

    public WebElement getClickOnHeyYou() {
        return driver.findElement(By.xpath("//*[@href=\"#!/playlist/4938\"]\"]"));
    }
    public void createPlaylist(String HeyYou){


    }

    public boolean checkPlaylist(String HeyYou) {
       driver.findElements(By.xpath("\"//*[@href=\"#!/playlist/4938\\\"]\""));
        return true;
    }
}
