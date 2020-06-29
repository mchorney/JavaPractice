package hw5RenamePlaylist;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests extends BaseTest{


    @Test
    public void createPlaylist(){
        String myPlaylistId = mainPage.createPlaylist("Jazz3");
        Assert.assertTrue(mainPage.checkPlaylist(myPlaylistId,"Jazz3"));
    }

    @Test
    public void renamePlaylist(){
        String myPlaylistId = mainPage.createPlaylist("Jazz5");
        mainPage.renamePlaylist(myPlaylistId,"Rock1");
        Assert.assertTrue(mainPage.checkPlaylist(myPlaylistId,"Rock1"));
    }
}
