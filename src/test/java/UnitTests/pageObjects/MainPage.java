package UnitTests.pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class MainPage extends BasePage{
    JavascriptExecutor je;

    public MainPage(WebDriver driver) {
        this.driver=driver;
        wait = new WebDriverWait(driver, 10);
        je = (JavascriptExecutor) driver;
    }

    public boolean isMain(){
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='logout']")));
       return driver.getCurrentUrl().equals("https://koelapp.testpro.io/#!/home");
    }

    public String findByParent(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//section[@id='playlists']/h1")));
        element = driver.findElement(By.xpath("//section[@id='playlists']/h1"));
        return element.getText().trim();
    }

    public String findByGrandparent(){
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

    public String createPlaylist(String name){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class, 'create')]")));
        driver.findElement(By.xpath("//i[contains(@class, 'create')]")).click();
        element = driver.findElement(By.xpath("//form[@class='create']/input"));
        element.sendKeys(name);
        element.sendKeys(Keys.ENTER);
        System.out.println("Playlist created!");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='success show']")));
        return driver.getCurrentUrl().split("/")[5];
    }

    public boolean checkPlaylist(String name) {
        List<WebElement> list = driver.findElements(By.xpath("//*[@id='playlists']/ul[@class='menu']/li"));
        List<WebElement> playlists = new ArrayList<>();
        for (WebElement playlist : list) {
            if (playlist.getText().trim().equals(name)) {
                playlists.add(playlist);
                System.out.println("Playlist found: " + name);
            }
        }
        return playlists.size() > 0;
    }


    public boolean checkPlaylistByURL(String id) {
        List<WebElement> list = driver.findElements(By.xpath("//*[@id='playlists']/ul[@class='menu']/li"));
        List<WebElement> playlists = new ArrayList<>();
        for (WebElement playlist : list) {
            element = playlist.findElement(By.xpath("./a"));
            if (element.getAttribute("href").equals("https://koelapp.testpro.io/#!/playlist/" +id)){
                playlists.add(playlist);
                System.out.println("Playlist found: " + id);
            }
        }
        return playlists.size() == 1;
    }

    public String renamePlaylist(String id, String name){
        element = driver.findElement(By.xpath("//a[@href='#!/playlist/" +id+ "']"));
        je.executeScript("arguments[0].scrollIntoView(true);", element);
        Actions action = new Actions(driver);
        action.moveToElement(element).doubleClick(element).build().perform();
        WebElement input  = driver.findElement(By.xpath("//a[@href='#!/playlist/" +id+ "']/following-sibling::input"));
        input.sendKeys(Keys.CONTROL + "a");
        input.sendKeys(Keys.DELETE);
        input.sendKeys(name);
        input.sendKeys(Keys.ENTER);
        System.out.println(element.getText());

        return element.getText();


    }
}
