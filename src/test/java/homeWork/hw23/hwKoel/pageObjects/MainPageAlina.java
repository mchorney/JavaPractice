package homeWork.hw23.hwKoel.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class MainPageAlina {
    private WebDriver driver;

    public MainPageAlina(WebDriver driver) {
        this.driver=driver;
    }


    public boolean isMain() {
        var list =driver.findElements(By.xpath("//*[@class='fa fa-sign-out control']"));
        return list.size()==1;

    }



    public void createPlaylistAK(String name) throws InterruptedException {
        var plusButton = driver.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']"));
        plusButton.click();
        var inputField = driver.findElement(By.xpath("//*[@placeholder= '↵ to save'] "));
        Thread.sleep(2000);
        inputField.sendKeys("AK22");
        Thread.sleep(2000);
        inputField.sendKeys(Keys.ENTER);

//        var PlaylistAK22 = driver.findElement(By.xpath("//*[@href=\"#!/playlist/4864\"]"));
//        PlaylistAK22.click();
//        Thread.sleep(4000);
//    }


//    public WebElement getPlaylistAK22 () {return driver.findElement((By.xpath("//*[@href=\"#!/playlist/4864\"]"))); }



        }


    public boolean checkPlaylist(String name) {

        List<WebElement> AK22 = new ArrayList<>();
        AK22 = driver.findElements(By.xpath("//a[contains(text(),'" + name + "')]"));

        if (AK22.isEmpty()) {
            // element doesn't exist
            return false;
        } else {
            // element exists, check for visibility
            return true;
        }
    }

}




