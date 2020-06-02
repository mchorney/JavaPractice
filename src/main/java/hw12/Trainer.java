package hw12;


public class Trainer {
    private String name;
    private int rate;
    private double rating;
    private WorkoutType[] workoutType;


    public Trainer(String name, int rate, double rating, WorkoutType[] workoutType) {
        this.name = name;
        this.rate = rate;
        this.rating = rating;
        this.workoutType = workoutType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void printOut() {
        System.out.println("Trainer " + name + " who have rating  " + rating + " with hourly rate of " +rate+" for "+workoutType+" training.");
    }
}
