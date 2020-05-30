package l13;

public class Name {
    private String Name;
    private String lastName;

    public Name(String name, String lastName) {
        this.Name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
