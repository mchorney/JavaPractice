package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class MainPage {
    private WebDriver driver;
    private FluentWait<WebDriver> fluentWait;
    private WebDriverWait wait;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        this.fluentWait = new FluentWait<WebDriver>(this.driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(ElementClickInterceptedException.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(NoSuchElementException.class);
        this.wait = new WebDriverWait(driver, 10, 2500L);
    }

    public WebElement getPlusButtonPlayListCreation() throws InterruptedException {
        //fluentWait.until(x->x.findElement(By.xpath(MainPageSelectors.plusButtonPlayListCreation)).isDisplayed());
        // !!! Не один из типов Explicit waits (fluent and simply WebDriver wait) не работает - элемент находят, но кликают мимо!!! Поэтому - ждем..
        Thread.sleep(3000);
        // wait.until(ExpectedConditions.elementToBeClickable(By.xpath(MainPageSelectors.plusButtonPlayListCreation)));
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(MainPageSelectors.plusButtonPlayListCreation)));
//        long now = System.currentTimeMillis();
//        wait.until(ExpectedConditions
//                .elementToBeClickable(By.xpath(MainPageSelectors.plusButtonPlayListCreation)));
//        System.out.println("Elapsed time: " + (System.currentTimeMillis() - now));
//        System.out.println(driver.findElement(By.xpath(MainPageSelectors.plusButtonPlayListCreation)));
        return driver.findElement(By.xpath(MainPageSelectors.plusButtonPlayListCreation));
    }

    public WebElement getPlayListNameTextField() {
        return driver.findElement(By.xpath(MainPageSelectors.playListNameTextField));
    }

    public WebElement getCreatedPlayListName() {
        return driver.findElement(By.xpath(MainPageSelectors.createdPlaylist));
    }
    public WebElement getRemanedPlayListName() {
        return driver.findElement(By.xpath(MainPageSelectors.renamedPlaylistName));
    }

    public boolean isMain() {
        List list = driver.findElements(By.xpath(MainPageSelectors.signOutControl));
        return list.size() == 1;
    }
    private String getOldPlaylistXpath(String name){
        return "//a[text()='"+name+"']";
    }

    public String createPlayList(String playListName) throws InterruptedException {
        getPlusButtonPlayListCreation().click();
        getPlayListNameTextField().sendKeys(playListName);
        getPlayListNameTextField().sendKeys(Keys.ENTER);
        fluentWait.until(x->x.findElement(By.xpath("//div[@class='success show']")).isDisplayed());
        String url = driver.getCurrentUrl();
        return url.split("/")[5];
    }

    public boolean checkPlayList(String id) {
        List list = driver.findElements(By.xpath("//*[@href='#!/playlist/"+id+"']"));
        return list.size()==1;
    }

    public String replacePlayList(String firstName, String secondName){
        WebElement playlist = driver.findElement(By.xpath(getOldPlaylistXpath(firstName)));
        Actions actions = new Actions(driver);
        actions.doubleClick(playlist).perform();
        WebElement textField = driver.findElement(By.xpath(MainPageSelectors.editingPlaylistName));
        textField.sendKeys(Keys.CONTROL + "a");
        textField.sendKeys(secondName);
        textField.sendKeys(Keys.ENTER);
        fluentWait.until(x->x.findElement(By.xpath(MainPageSelectors.renamedPlaylistName)).isDisplayed());
        // id))) , not name
        String createdplaylistName = getRemanedPlayListName().getText();
        return createdplaylistName;
        // get String from alert window)
    }
}









