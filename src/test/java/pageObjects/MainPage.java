package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver=driver;
    }


    public boolean isMain() {
        var list = driver.findElements(By.xpath("//*[@class =\"fa fa-sign-out control\"]"));
        return list.size()!=0;
    }
}
