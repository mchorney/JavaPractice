package homework18;

public class Speciality {
    private String speciality;

    public Speciality(String speciality) {
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Speciality{" +
                "speciality='" + speciality + '\'' +
                '}';
    }
}
