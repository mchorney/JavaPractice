package hw14;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Location extends Bootcamp {
    private String room_number;

    public Location(String type, String duration, int cost, String name, Coach coach, Location[] location, String room_number) {
        super(type, duration, cost, name, coach, location);
        this.room_number = room_number;
    }

    public String getRoom_number() {
        return room_number;
    }

    public void setRoom_number(String room_number) {
        this.room_number = room_number;
    }


    public void printlocation() {
        System.out.println("Location{" +

                "Location{" +
                "room_number='" + room_number + '\'' +
                ", name='" + name + '\'' +
                ", coach=" + coach +
                ", location=" + Arrays.toString(location) +
                ", type='" + type + '\'' +
                ", duration='" + duration + '\'' +
                ", cost=" + cost +
                '}');

    }
}


