package seleniumTests2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PlaylistTests extends BaseTest {

    @Test
    public void playlistTests_createPlaylist_PlaylistCreated(){
        String playlistId = mainPage.createPlaylist("Best");
//        Assert.assertTrue(mainPage.checkPlaylist(playlistId));
    }
    @Test
    public void playlistTests_renamePlaylist_PlaylistRenamed(){
        String playlistId = mainPage.createPlaylist("xxxxx");
        mainPage.renamePlaylist(playlistId,"newName");
        Assert.assertTrue(mainPage.checkPlaylist(playlistId,"newName"));
    }
}
