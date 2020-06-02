package hw12;

import java.util.Arrays;

public class Map {
    private Roads[] roads;
    private String name;

    public Map(Roads[] roads, String name) {
        this.roads = roads;
        this.name = name;
    }

    public Roads[] getRoads() {
        return roads;
    }

    public void setRoads(Roads[] roads) {
        this.roads = roads;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override    public String toString() {
        return "Traffic {" +
                "name='" + name + '\'' +
                ", roads=" + Arrays.toString(roads) +
                '}';
    }
}
