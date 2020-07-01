package hw9_10_11;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyPlayListTests extends MyBaseTest{
    @Test
    public void playlistTests_createPlaylist_PlaylistCreated(){
        String playlistId = mainPage.createPlaylist("Michael_JS");
        Assert.assertTrue(mainPage.checkPlaylist(playlistId));
    }
    @Test
    public void playlistTests_renamePlaylist_PlaylistRenamed(){
        String playlistId = mainPage.createPlaylist("Michael_JS");
        mainPage.renamePlaylist(playlistId,"MICHAEL_js");
        Assert.assertTrue(mainPage.checkPlaylist(playlistId,"MICHAEL_js"));
    }
    @Test
    public void playlistTests_createPlaylist_PlaylistCreated1(){
        String playlistId = mainPage.createPlaylist("Michael_JS");
        Assert.assertTrue(mainPage.checkPlaylist(playlistId));
    }
    @Test
    public void playlistTests_renamePlaylist_PlaylistRenamed1(){
        String playlistId = mainPage.createPlaylist("Michael_JS");
        mainPage.renamePlaylist(playlistId,"MICHAEL_js");
        Assert.assertTrue(mainPage.checkPlaylist(playlistId,"MICHAEL_js"));
    }
}
