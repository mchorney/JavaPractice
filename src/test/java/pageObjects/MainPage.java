package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver=driver;
    }


    public boolean isMain() {
        var list =driver.findElements(By.xpath("//*[@class='fa fa-sign-out control']"));
        return list.size()==1;
    }

    public void createPlayList(String name)throws InterruptedException{

        WebDriverWait wait = new WebDriverWait(driver,3);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='fa fa-plus-circle control create']")));
        var clickList = driver.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']"));
        clickList.click();
        var inputList = driver.findElement(By.xpath("//*[@class='create']/*[@type='text']"));
        inputList.click();
        inputList.sendKeys(name);
        inputList.sendKeys(Keys.ENTER);

    }
    public boolean checkPlaylist(String name){


        WebDriverWait wait = new WebDriverWait(driver,3);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='playlist playlist']/*[contains(text(),name)]")));
        var myPlaylist = driver.findElement((By.xpath("//*[@class='playlist playlist']/*[contains(text(),name)]")));
        System.out.println("PlayList Name is "+ name);

        try {
            return myPlaylist.isDisplayed();

        }catch (Exception e){

            System.out.println("The Playlist name doesn't match:\nExpected" + name +"\nActual:" + myPlaylist);
            return false;
        }

    }


}
