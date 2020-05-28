package l10;

public class Hobby {

    public String hobby;
    public double hours;

    public void info() {
        if (hours < 5.0) System.out.println("You don't really have tine for " + hobby + ". You spend only " + hours + " per week.");
        if (hours >= 5.0) System.out.println("You are fire!!! You are really in to " + hobby + " and you have a lot of free time, if you can spend " + hours + " every week.");
    }
}
