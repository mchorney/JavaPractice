package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,5);
    }

    public void waitForPage(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='fa fa-plus-circle control create']")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='youtube']")));
    }

    private void waitBeforeClick(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public WebElement playListButton() {
        return driver.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']"));
    }

    public WebElement playListNameField() {
        return driver.findElement(By.xpath("//form[@class='create']/input[@type='text']"));
    }

    public WebElement summerHitsPlaylist() {
        return driver.findElement(By.xpath("//*[@class='playlist playlist']/*[contains(text(), \"Summer Hits\")]"));
    }

    public boolean isMain() {
        var list = driver.findElements(By.cssSelector("[class='fa fa-sign-out control']"));
        return list.size() == 1;
    }

    public void createPlaylist(String name) {
        waitBeforeClick(playListButton());
        playListButton().click();
        playListNameField().sendKeys(name);
        playListNameField().sendKeys(Keys.ENTER);
//        Actions action = new Actions(driver);
//        action.sendKeys(Keys.ENTER).build().perform();
    }

    public boolean checkPlaylist(String name) {
        boolean result = false;
        if(summerHitsPlaylist().getText().equals(name)){
            result = true;
        }
        return result;
    }
}
