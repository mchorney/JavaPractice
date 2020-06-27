package seleniumTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class PlaylistTests extends BaseTest {

        private WebDriver driver;
        private FluentWait<WebDriver> fluentWait;

        @Test
        public void playlistTests_createPlaylist_playlistCreated(){
            var playlistId = mainPage.createPlaylist("Playlist TEST");
            Assert.assertTrue(mainPage.checkByUrl(playlistId));
        }

        @Test
        public void playlistTests_renamePlaylist_playlistRenamed(){
            mainPage.renamePlaylist("Playlist TEST","Renamed Playlist");
            Assert.assertTrue(mainPage.checkNewName("Renamed Playlist"));
        }


    }


