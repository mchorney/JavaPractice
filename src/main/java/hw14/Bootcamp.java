package hw14;

import java.util.Arrays;

public class Bootcamp extends Camp{
    protected String name;
    protected Coach coach;
    protected Location [] location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public Location[] getLocation() {
        return location;
    }

    public void setLocation(Location[] location) {
        this.location = location;
    }

    public Bootcamp(String type, String duration, int cost, String name, Coach coach, Location[] location) {
        super(type, duration, cost);
        this.name = name;
        this.coach = coach;
        this.location = location;

    }
}
