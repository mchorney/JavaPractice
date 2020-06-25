package hw4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.util.concurrent.TimeUnit;

public class MainPage {
    private WebDriver driver;
    private FluentWait<WebDriver> fluentWait;

    public MainPage(WebDriver driver) {
        this.driver=driver;
    }

    public MainPage(FluentWait<WebDriver> fluentWait) {
        this.fluentWait = fluentWait;
    }

    public boolean isMain (){
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        var list = driver.findElements(By.xpath("//*[@class='fa fa-sign-out control']"));

        return list.size()==1;
    }

    public void createPlaylist (String name) {
        driver.findElement(By.xpath("//i[@class='fa fa-plus-circle control create']")).click();
        driver.findElement(By.xpath("//form[@class='create']/input")).sendKeys(name);
        driver.findElement(By.xpath("//form[@class='create']/input")).sendKeys("\n");

    }

    public boolean checkPlaylist () {
        driver.findElement(By.xpath("//section[@id='playlistWrapper']/div[@class='none']")).isEnabled();
        return true;
    }

}
