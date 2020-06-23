package pageObjectsHome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Mainpage {
    private WebDriver driver;
//    private WebElement logout;
    public Mainpage(WebDriver driver) {
        this.driver=driver;
    }

//    public WebElement getLogout() {
//        return driver.findElement(By.xpath("//*[@class='fa fa-sign-out control']"));
//    }

    public boolean isMain() {
        var list=driver.findElements(By.xpath("//*[@class='fa fa-sign-out control']"));
        return list.size()==1;
    }
}
