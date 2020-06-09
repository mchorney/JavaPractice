package homework18;

public class Doctor {
    private String name;
    private String last_name;
    private Position position;

    public Doctor(String name, String last_name, Position position) {
        this.name = name;
        this.last_name = last_name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", position=" + position +
                '}';
    }
}





