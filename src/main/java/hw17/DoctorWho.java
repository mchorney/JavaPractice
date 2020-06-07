package hw17;

public class DoctorWho {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public DoctorWho(int number) {
        this.number = number;
    }


    public String toString() {
        return "DoctorWho {" +
                "number=" + number +
                "} - ";
    }
}
