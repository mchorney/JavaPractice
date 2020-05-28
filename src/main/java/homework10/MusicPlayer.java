package homework10;

public class MusicPlayer {
    static String[] all_songs = {
            "song1",
            "song2"
    };

    int volume = 0;

    public void playSong(String name) {
        for (String song_name : all_songs) {
            if (song_name.equals(name)) {
                System.out.println("Now playing " + name);
                return;
            }
        }
        System.out.println("Can't play " + name);
    }

    public void increase_volume() {
        if (volume == 100) {
            System.out.println("Volume is at max already");
            return;
        }
        volume++;
        System.out.println("Volume is now " + volume);
    }

    public void decrease_volume() {
        if (volume == 0) {
            System.out.println("Volume is at min already");
            return;
        }
        volume--;
        System.out.println("Volume is now " + volume);
    }
}
