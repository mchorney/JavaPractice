package home18;

public class Doctor {
    private String name;
    private String lastname;
    private Position position;

    public Doctor() {
    }

    public Doctor(String name, String lastname, Position position) {
        this.name = name;
        this.lastname = lastname;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void printDoc(){
        System.out.println("Doctor's name is "+name+", lastname is "+lastname+", position is "+position);
    }

}
