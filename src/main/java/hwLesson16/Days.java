package hwLesson16;

public class Days {
    private int dayOfWeek;
    private boolean isThereABussToday;

    public Days(int dayOfWeek, boolean isThereABussToday) {
        this.dayOfWeek = dayOfWeek;
        this.isThereABussToday = isThereABussToday;
    }

    public int dayOfWeek() {
        return dayOfWeek;
    }

    public boolean isThereABussToday() {
        return isThereABussToday;
    }

    public void printOut() {
        System.out.println("Days{" +
                "dayOfWeek=" + dayOfWeek +
                ", isThereABussToday=" + isThereABussToday +
                '}');
    }
}
