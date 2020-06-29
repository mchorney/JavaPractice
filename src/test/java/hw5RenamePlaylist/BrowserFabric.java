package hw5RenamePlaylist;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BrowserFabric {
    public static WebDriver getDriver(Browsers browser) throws NoSuchFieldException{
        switch(browser) {
            case CHROME:
                return getChromeDriver();
            case OPERA:
                return getOperaDriver();
            case FIREFOX:
                return getFirefoxDriver();
            default:
                throw new NoSuchFieldException("No such browser");
        }
    }

    private static WebDriver getChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        return new ChromeDriver();
    }

    private static WebDriver getFirefoxDriver() {
        System.setProperty("webdriver.opera.driver", "chromedriver.exe");
        return new FirefoxDriver();
    }

    private static WebDriver getOperaDriver() {
        System.setProperty("webdriver.gecko.driver", "chromedriver.exe");
        return new OperaDriver();
    }
}
