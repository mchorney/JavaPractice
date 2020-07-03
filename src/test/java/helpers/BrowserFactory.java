package helpers;

import enums.BROWSERS;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserFactory {
    public static WebDriver getDriver(BROWSERS browser) throws NoSuchFieldException {
        switch (browser) {
            case CHROME:
                return getChromeDriver();
            case FIREFOX:
                return getFirefoxDriver();
            case MICROSOFTEDGE:
                return getEdgeDriver();
            default:
                throw new NoSuchFieldException("No such browser");
        }
    }
    private static WebDriver getChromeDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=1400,1000");
        options.addArguments("--headless");
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        return new ChromeDriver(options);
    }
    private static WebDriver getFirefoxDriver() {
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("window-size=1400,1000");
        options.addArguments("--headless");
        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
        return new FirefoxDriver(options);
    }
    private static WebDriver getEdgeDriver() {
        EdgeOptions options = new EdgeOptions();
//        options.addArguments("window-size=1400,1000");
//        options..addArguments("--headless");
        System.setProperty("webdriver.msedge.driver", "msedgedriver.exe");
        return new EdgeDriver();
    }
}
