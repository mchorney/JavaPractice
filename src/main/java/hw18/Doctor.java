package hw18;

public class Doctor {
    private String name;
    private String lastName;
    private Position position;
    private static int doctorCount;

    public Doctor() {
    }

    public Doctor(String name, String lastName, Position position) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;
        doctorCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public static int getDoctorCount() {
        return doctorCount;
    }

    public static void setDoctorCount(int doctorCount) {
        Doctor.doctorCount = doctorCount;
    }

    public String getObjectDoctor() {
        return "Doctor's Name: " + name + " " + lastName + " " + " Doctor's specialisation: " + position;
    }
}
