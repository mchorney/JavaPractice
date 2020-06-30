package SeleniumTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PlayListTests extends BaseTest {

    @Test
    public void createPlayList_PlayListCreated() {
        String playlistId = mainPage.createPlayList("Playlist1");
        //Assert.assertTrue(mainPage.checkPlayList(playlistId));
    }

    @Test
    public void replacePlayList_PlayListCreated()  {
        String playlistId = mainPage.createPlayList("Playlist7");
        mainPage.replacePlayList(playlistId, "newName");
        Assert.assertTrue(mainPage.checkPlayList(playlistId), "newName");
    }
}

