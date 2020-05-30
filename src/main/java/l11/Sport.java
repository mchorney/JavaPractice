package l11;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sport {

    private String sportName;
    private String[] playersName;
    private double accuracy;
    private int[] yearChampion;

    public Sport() {
        System.out.println("Default constructor created");
    }

    public Sport(String sportName, String[] playersName, double accuracy, int[] yearChampion) {
        this.sportName = sportName;
        this.playersName = playersName;
        this.accuracy = accuracy;
        this.yearChampion = yearChampion;
        System.out.println("Thank you for full info.");
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }
    public String getSportName() {
        return sportName;
    }

    public void setPlayersName(String[] playersName) {
        this.playersName = playersName;
    }
    public String[] getPlayersName() {
        return playersName;
    }

    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }
    public double getAccuracy() {
        return accuracy;
    }

    public void setYearChampion(int[] yearChampion) {
        this.yearChampion = yearChampion;
    }
    public int[] getYearChampion() {
        return yearChampion;
    }

    public void printClass() {
        if(getSportName() != null) System.out.println(sportName + ":");
        if(getPlayersName() != null) System.out.println("Name of the players is: " + Arrays.toString(getPlayersName()));
        if(getAccuracy() != 0.0) System.out.println("Accuracy percentage: " + accuracy + "%");
        if(getYearChampion() != null) System.out.println("Champion year: " + Arrays.toString(getYearChampion()));
        System.out.println();
    }
}
