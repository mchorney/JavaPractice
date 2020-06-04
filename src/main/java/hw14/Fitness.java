package hw14;

import java.util.Arrays;

public class Fitness extends Camp{
    private int daysPerWeek;
    private Coach [] coach;

    public Fitness(String type, String duration, int cost, int daysPerWeek, Coach[] coach) {
        super(type, duration, cost);
        this.daysPerWeek = daysPerWeek;
        this.coach = coach;
    }

    public int getDaysPerWeek() {
        return daysPerWeek;
    }

    public void setDaysPerWeek(int daysPerWeek) {
        this.daysPerWeek = daysPerWeek;
    }

    public Coach[] getCoach() {
        return coach;
    }

    public void setCoach(Coach[] coach) {
        this.coach = coach;
    }

    @Override
    public String toString() {
        return "Fitness{" +
                "daysPerWeek=" + daysPerWeek +
                ", coach=" + Arrays.toString(coach) +
                ", type='" + type + '\'' +
                ", duration='" + duration + '\'' +
                ", cost=" + cost +
                '}';
    }
}
