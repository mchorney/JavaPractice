package hw16;


public class Weather{
    private String dayName;
    private int date;
    boolean sunny;

    public Weather(String dayName, int date, boolean sunny) {
        this.dayName = dayName;
        this.date = date;
        this.sunny = sunny;

    }

    public String getDayName() {
        return dayName;
    }

    public void setDayName(String dayName) {
        this.dayName = dayName;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public boolean isSunny() {
        return sunny;
    }

    public void setSunny(boolean sunny) {
        this.sunny = sunny;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "dayName='" + dayName + '\'' +
                ", date=" + date +
                ", sunny=" + sunny +
                '}';
    }
}

