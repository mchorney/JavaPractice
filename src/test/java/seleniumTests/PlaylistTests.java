package seleniumTests;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class PlaylistTests extends BasedTest {
    @Test
    public void playlistTests_createPlaylist_PlaylistCreated()throws InterruptedException{
        Thread.sleep(1000);
        var id=mainPage.createPlaylist("New");
        System.out.println("My list id="+id);
        Assert.assertTrue(mainPage.checkPlaylist(id));
    }
    @Test
    public void playListTests_renamePlayList() throws InterruptedException {
        Thread.sleep(1000);
        var id=mainPage.createPlaylist("Ilona");
        System.out.println("new list id:"+id);
        mainPage.renamePlaylist(id, "SuperNew");
        mainPage.checkPlaylistName(id,"SuperNew");
    }

}
