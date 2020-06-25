package pageObjectsHome;

import org.openqa.selenium.*;

public class Mainpage {
    private WebDriver driver;
//    private WebElement logout;
    public Mainpage(WebDriver driver) {
        this.driver=driver;
    }


    public boolean isMain() {
        var list=driver.findElements(By.xpath("//*[@class='fa fa-sign-out control']"));
        return list.size()==1;
    }


    public WebElement getPlus(){
        return driver.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']"));
    }
    public WebElement getEntryFild(){
        return driver.findElement(By.xpath("//*[@placeholder='↵ to save']"));
    }
    public WebElement getPlaylist(){
        return driver.findElement(By.xpath("//*[@href='#!/playlist/4865']"));
    }


    public void createPlaylist(String name){
        getPlus().click();
        getEntryFild().sendKeys(name);
        getPlaylist().sendKeys(Keys.ENTER);

    }
    public boolean checkPlaylist(String name){
        try{
            driver.findElement(By.xpath("//*[@href='#!/playlist/4865']"));
        }catch (NoSuchElementException error){
            return false;
        }

        return true;
    }
}
