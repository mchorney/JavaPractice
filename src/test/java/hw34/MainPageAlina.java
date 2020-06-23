package hw34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPageAlina {
    private WebDriver driver;

    public MainPageAlina(WebDriver driver) {
        this.driver=driver;
    }


    public boolean isMain() {
        var list =driver.findElements(By.xpath("//*[@class='fa fa-sign-out control']"));
        return list.size()==1;








    }


}
