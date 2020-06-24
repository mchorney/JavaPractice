package UnitTests.ObjectTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    WebDriver driver;
    WebDriverWait wait ;
    WebElement element;

    public MainPage(WebDriver driver, WebDriverWait wait) {
        this.driver=driver;
        this.wait=wait;
    }

    public boolean isMain(){
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userBadge")));
       return driver.getCurrentUrl().equals("https://koelapp.testpro.io/#!/home");
    }

    public String findByParent(){
        wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//section[@id='playlists']/h1")));
        element = driver.findElement(By.xpath("//section[@id='playlists']/h1"));
        return element.getText().trim();
    }

    public String findByGrandparent(){
        wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//section[@id='playlists']/h1")));
        element = driver.findElement(By.xpath("//nav[@id='sidebar']//h1"));
        return element.getText().trim();
    }

    public String findByPrevSibling(){
        element = driver.findElement(By.xpath("//div[@class='header clear']/a[3]/preceding-sibling::a"));
        return element.getText().trim();
    }

    public String findByFollowingSibling(){
        element = driver.findElement(By.xpath("//section[@class='music']/h1/following-sibling::ul/li[1]/following-sibling::li[1]"));
        return element.getText().trim();
    }

    public String findBySibling(){
        element = driver.findElement(By.xpath("//section[@class='music']/h1/following-sibling::ul/li[1]/following-sibling::li[4]"));
        return element.getText().trim();
    }
}
