package hwPageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) { super(driver);}


    public WebElement getButtonCreatePlaylist() {
        fluentWait.until(x->x.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']")).isDisplayed() );
        return driver.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']"));
    }
    public WebElement getWindowToSave() {
        return driver.findElement(By.xpath("//*[@class=\"create\"]"));
    }

    public String createPlaylist(String name) {

        getButtonCreatePlaylist().click();
        getWindowToSave().sendKeys(name);
        getWindowToSave().sendKeys(Keys.RETURN);
        String url = driver.getCurrentUrl();
        return url.split("/")[4];
    }
//    Actions action = new Actions(driver);
//
////    WebElement rename = driver.findElement(By.xpath("//*[@href='#!/playlist/5125'"));
//    WebElement renameWindow = driver.findElement(By.xpath("//*[@href='#!/playlist/5125'"));
//
//    public WebElement getReName_ClickOnTop10(){
//        fluentWait.until(x->x.findElement(By.xpath("//*[@href='#!/playlist/5125'")).isDisplayed() );
//        return driver.findElement(By.xpath("//*[@href='#!/playlist/5125'"));}
//
//        public void renameWindow(String name) {
//            getReName_ClickOnTop10().click();
//            action.doubleClick(renameWindow).build().perform();
//        }
//        public String ReName_ClickOnTop10(String name){
//
//        getReName_ClickOnTop10().click();
//         action.doubleClick(renameWindow).build().perform();
//
//         String url = driver.getCurrentUrl();
//         return url.split("/")[4];
//
//        }
//
//    public void setAction(Actions action) {
//        this.action = action;
//        action.doubleClick().build().perform();
//    }
//
//    public Actions getAction() {
//        return action;
//    }

    public boolean checkPlaylist(String id) {
        var list = driver.findElements(By.xpath("//*[@href='#!/playlist/"+id+"']"));
        return list.size()==1;
    }

}
