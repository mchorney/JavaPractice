package seleniumTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PlaylistTestsNew extends BaseTest{

    @Test
    public void playlistTests_createPlaylist_PlaylistCreated2(){
        String playlistId = mainPage.createPlaylist("xxxxx");
        Assert.assertTrue(mainPage.checkPlaylist(playlistId));
    }
    @Test
    public void playlistTests_renamePlaylist_PlaylistRenamed2(){
        String playlistId = mainPage.createPlaylist("xxxxx");
        mainPage.renamePlaylist(playlistId,"newName");
        Assert.assertTrue(mainPage.checkPlaylist(playlistId,"newName"));
    }
    @Test
    public void playlistTests_createPlaylist_PlaylistCreated3(){
        String playlistId = mainPage.createPlaylist("xxxxx");
        Assert.assertTrue(mainPage.checkPlaylist(playlistId));
    }
    @Test
    public void playlistTests_renamePlaylist_PlaylistRenamed3(){
        String playlistId = mainPage.createPlaylist("xxxxx");
        mainPage.renamePlaylist(playlistId,"newName");
        Assert.assertTrue(mainPage.checkPlaylist(playlistId,"newName"));
    }
}
