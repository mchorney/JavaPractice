package hw17;

public class Job {
    private String position;
    private int wage;


    public Job(String position, int wage) {
        this.position = position;
        this.wage = wage;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public String jobInfo(){
        return getPosition() + " " + getWage();
    }

}
