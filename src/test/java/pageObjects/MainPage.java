package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver=driver;
    }

    WebElement homeButton = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/section[1]/ul/li[1]/a"));
    WebElement mostPlayedTitle = driver.findElement(By.xpath("//div[@class=\"two-cols\"]/section[1]/h1"));
    WebElement lyricsTab = driver.findElement(By.xpath("//div[@class=\"header clear\"]/a[1]"));
    WebElement playButton = driver.findElement(By.xpath("//span[@class=\"play control\"]/i"));
    WebElement volumeIcon = driver.findElement(By.xpath("//nav[@id=\"sidebar\"]/section[2]/h1/i"));

    public boolean isMain() {
        var list = driver.findElements(By.xpath("//*[@class='fa fa-sign-out control']"));
        return list.size()==1;
    }
}
