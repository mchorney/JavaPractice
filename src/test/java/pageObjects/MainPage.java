package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

public class MainPage {
    private WebDriver driver;
    private FluentWait<WebDriver> fluentWait;

    public MainPage(WebDriver driver,FluentWait<WebDriver> fluentWait) {

        this.driver = driver;
        this.fluentWait=fluentWait;
    }


    public boolean isMain() throws InterruptedException {
      fluentWait.until(x->x.findElement(By.xpath("[class='fa fa-sign-out control']")));
        var list = driver.findElements(By.xpath("[class='fa fa-sign-out control']"));
        return list.size() == 1;
    }

    public void createPlaylist(String name) throws InterruptedException {
        var by1= By.xpath("//i[@class='fa fa-plus-circle control create']");
        fluentWait.until(x->x.findElement(by1));
        WebElement addPlaylistNew = driver.findElement(by1);
        addPlaylistNew.click();

        var by2=By.xpath("//input[@placeholder='↵ to save']");
        fluentWait.until(x->x.findElement(by2));
        WebElement inputPlaylistNew = driver.findElement(by2);
        inputPlaylistNew.sendKeys(name);
        inputPlaylistNew.sendKeys("\n");

    }

    public boolean checkPlaylist(String name) {
        try {
            var by3=By.xpath("//*[@id=\"playlists\"]/ul/li/a[text()='" + name + "']");
            fluentWait.until(x->x.findElement(by3));
            var searchPlaylistNew = driver.findElement(by3);
            System.out.println("Found");
            return true;
        } catch (Exception e) {
            System.out.println("Not found");
            return false;
        }

    }
}
