package seleniumTest;

import org.testng.Assert;
import org.testng.annotations.*;

public class PlayListTest extends RefactoringOverallMethods {

    @Test
    public void playlistTests_createPlaylist_PlaylistCreated() {

        mainPage.createPlaylist("dgsreger");
        Assert.assertTrue(mainPage.checkPlaylist("dgsreger"));
    }

    @Test
    public void renamePlaylist_toTest() throws InterruptedException {
        mainPage.renamePlayList("dgsreger", "newestOne");
        Assert.assertTrue(mainPage.checkPlaylist("newestOne"));
    }

    @Test
    public void playlistTests_createPlaylist_PlaylistCreated1() {

        mainPage.createPlaylist("dgsreger");
        Assert.assertTrue(mainPage.checkPlaylist("dgsreger"));
    }

    @Test
    public void renamePlaylist_toTest1() throws InterruptedException {
        mainPage.renamePlayList("dgsreger", "newestOneMore");
        Assert.assertTrue(mainPage.checkPlaylist("newestOneMore"));
    }

    public static class LoginTest extends RefactoringOverallMethods {

        @Test
        public void loginTest_CorrectCredentials_LoggedToApp() {
            Assert.assertTrue(mainPage.isMain());
        }
        /*@Test
        public void loginTest_WrongCredentials_Error() {
            LoginPage loginPage = new LoginPage(driver);
            loginPage.loginToApp("testpro.user03@testpro.io", "1111111");
            Assert.assertTrue(loginPage.isError());
        }*/
        @Test
        public void loginTest_CorrectCredentials_LoggedToApp1() {
            Assert.assertTrue(mainPage.isMain());
        }
        @Test
        public void loginTest_CorrectCredentials_LoggedToApp2() {
            Assert.assertTrue(mainPage.isMain());
        }
        @Test
        public void loginTest_CorrectCredentials_LoggedToApp3() {
            Assert.assertTrue(mainPage.isMain());
        }
    }
}
