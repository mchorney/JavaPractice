package seleniumTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PlaylistTests extends BaseTest{

    @Test
    public void playlistTests_createPlaylist_PlaylistCreated(){
        String playlistId = mainPage.createPlaylist("xxxxx");
        Assert.assertTrue(mainPage.checkPlaylist(playlistId));
    }
    @Test
    public void playlistTests_renamePlaylist_PlaylistRenamed(){
        String playlistId = mainPage.createPlaylist("xxxxx1");
        mainPage.renamePlaylist(playlistId,"newName1");
        Assert.assertTrue(mainPage.checkPlaylist(playlistId,"newName1"));
    }
}
