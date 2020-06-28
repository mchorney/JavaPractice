package pageObjects;

public class MainPageSelectors {
    public static final String signOutControl = "//*[@class='fa fa-sign-out control']";
    public static final String plusButtonPlayListCreation = "//h1/i[@class='fa fa-plus-circle control create']";
    public static final String playListNameTextField = "(//*[@type='text'])[1]";
    public static final String createdPlaylist = "//*[@class='active']";
    public static final String deletePlaylistButton = "//*[@title='Delete this playlist']";
    public static final String editingPlaylistName = "//*[@class='playlist playlist editing']/input";
    public static final String renamedPlaylistName = "//div[@class='success show']";
}
