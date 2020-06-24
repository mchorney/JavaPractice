package shw6_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KoelappMainPage {
        private WebDriver driver;

        public KoelappMainPage (WebDriver driver) {
            this.driver=driver;
        }

        public boolean isMain (){
            var list = driver.findElements(By.xpath("//*[@class='fa fa-sign-out control']"));
            return list.size()==1;

        }
}
