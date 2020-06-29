package hw5RenamePlaylist;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class MainPage extends BasePage{

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void plusButton() {
        for (int i = 0; i < 50; i++){
            try {
                driver.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']")).click();
                return;
            } catch (ElementClickInterceptedException err) {

            }
        }
        throw new ElementClickInterceptedException("Element not reachable");
    }

    public String createPlaylist(String name){
        plusButton();
        driver.findElement(By.xpath("//form[@class='create']/input")).sendKeys(name);
        driver.findElement(By.xpath("//form[@class='create']/input")).sendKeys(Keys.RETURN);
        fluentWait.until(x->x.findElement(By.xpath("//*[@class='alertify-logs top right']")));
        String url = driver.getCurrentUrl();
        return url.split("/")[5];
    }
    public boolean checkPlaylist(String id, String name){
        var list = driver.findElements(By.xpath("//*[@href='#!/playlist/"+id+"']"));
        if (list.size()==0){
            return false;
        }
        return name.equals(list.get(0).getText());
    }

    public void renamePlaylist(String myPlaylistId, String newName){

        var myPlaylist = driver.findElement(By.xpath("//*[@href='#!/playlist/"+myPlaylistId+"']"));
        Actions rename = new Actions(driver);
        rename.doubleClick(myPlaylist).perform();
        var addNewName = driver.findElement(By.xpath("//*[@class='playlist playlist editing']/input"));
        addNewName.sendKeys(Keys.CONTROL+"a");
        addNewName.sendKeys(newName);
        addNewName.sendKeys(Keys.ENTER);
    }


}
