package hw18;

public class Doctors {
    private String name;
	private String lastName;
	private Position position;

    public Doctors(String name, String lastName, Position position) {
        this.name = name;
        this.lastName = lastName;
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

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }


    public void printInfo() {
        System.out.println("Doctor: " +
                "name= " + name + '\'' +
                ", lastName= '" + lastName + '\'' +
                ", position= " + position +
                ';');
    }
}