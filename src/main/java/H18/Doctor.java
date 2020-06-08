package H18;

public class Doctor {
    private String name;
    private String lastName;
    private Position position;

    public Doctor() {
    }

    public Doctor(String name, String lastname, Position position) {
        this.name = name;
        this.lastName = lastname;
        this.position = position;
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

    public void setLastname(String lastname) {
        this.lastName = lastname;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void printDoc(){
        System.out.println("Doctor's name is "+name+", lastname is "+lastName+", position is "+position);
    }

}
