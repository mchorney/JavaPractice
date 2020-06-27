package pageObjects;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;


public class MainPage {
    private WebDriver driver;
    private FluentWait<WebDriver> fluentWait;
    public MainPage(WebDriver driver){
        this.driver = driver;
    }
    public boolean isMain(){
        var list = driver.findElements(By.xpath("//*[@class='fa fa-sign-out control'"));
        return list.size()==1;
    }


    public void clickPlusButton(){
        fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofMillis(100))
//                .ignoring(ElementClickInterceptedException.class)
//                .ignoring(StaleElementReferenceException.class)
                .ignoring(NoSuchElementException.class);
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String plusX = "//*[@class='fa fa-plus-circle control create']";
        By byPlus = By.xpath(plusX);
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        fluentWait.until(x->x.findElement(byPlus));
        var plusButton = driver.findElement(byPlus);
        plusButton.click();
    }
    private void sendNewPlaylistName(String nameNewList) {
        var textNewPlaylist = driver.findElement(By.xpath("//*[@type='text'][1]"));
        textNewPlaylist.sendKeys(nameNewList);
        textNewPlaylist.sendKeys(Keys.ENTER);
    }
    public void renamePlaylist(String oldName, String newName) throws InterruptedException {
        var oldNamePlaylist = driver.findElement(By.xpath("//*[text()='"+oldName+"']"));
        Actions actions = new Actions(driver);
        //var elementLocator = driver.findElement(By.id("ID"));
        actions.doubleClick(oldNamePlaylist).perform();
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='playlist playlist editing']")));
        var oldToNew = driver.findElement(By.xpath("//*[@type='text']"));
        oldToNew.sendKeys(newName);
        oldToNew.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
    }
    public void renameAllPlaylists(){
        List oldName = driver.findElements(By.xpath("//*[@class='playlist playlist']"));
        for (int i=0; i<oldName.size(); i++){
            Actions actions = new Actions(driver);
            actions.doubleClick((WebElement) oldName.get(i)).perform();
            var oldToNew = driver.findElement(By.xpath("//*[@type='text']"));
            //oldToNew.sendKeys(actions.);
            oldToNew.sendKeys("newNameList"+i);
            oldToNew.sendKeys(Keys.ENTER);
        }
    }
    public void deleteAllPlaylists(){
        List oldName = driver.findElements(By.xpath("//*[@class='playlist playlist']"));
        WebElement old;
        WebElement deleteList;
        for (int i=0; i<oldName.size(); i++){
//            Actions actions = new Actions(driver);
//            actions.doubleClick((WebElement) oldName.get(i)).perform();
            old = (WebElement) oldName.get(i);
            old.click();
            try {
                deleteList = driver.findElement(By.xpath("//*[@class='fa fa-times']"));
                deleteList.click();
                //deleteList.sendKeys(Keys.ENTER);
            } catch (Exception e){

            }

//            deleteList.sendKeys("newNameList"+i);
//            deleteList.sendKeys(Keys.ENTER);
        }
    }
    public  void createPlayList (String name){
        clickPlusButton();
        sendNewPlaylistName(name);
    }
    public boolean checkPlaylist(String name){
        return true;
    }
}
