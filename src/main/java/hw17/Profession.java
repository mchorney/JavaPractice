package hw17;

public class Profession {
    private String prof;
    private boolean bachelorDegree;
    private int yearsOfExperience;

    public Profession(String prof, boolean bachelorDegree, int yearsOfExperience) {
        this.prof = prof;
        this.bachelorDegree = bachelorDegree;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getProf() {
        return prof;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }

    public boolean isBachelorDegree() {
        return bachelorDegree;
    }

    public void setBachelorDegree(boolean bachelorDegree) {
        this.bachelorDegree = bachelorDegree;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public String toString() {
        return "Profession{" +
                "Profession='" + prof + '\'' +
                ", Bachelor Degree=" + bachelorDegree +
                ", Years Of Experience=" + yearsOfExperience +
                '}';
    }
}
