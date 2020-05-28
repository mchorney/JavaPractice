package hw10;

public class Sport {
    String type;
    String country;
    int year;
    boolean likes;
    boolean female;

    public void countrySport() {
        String what;
        if (likes) {
            what = "liked";
        } else {
            what = "disliked";
        }
        String who;
        if (female) {
            who = "women";
        } else {
            who = "men";
        }
        System.out.println(type + " in " + country + ". " + "The mostly it is " + what + " by " + who + ".");
    }

}
