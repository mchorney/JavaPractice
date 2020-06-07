package l17;

public class PersonalInformation {
    private String firstName;
    private String lastName;
    private int employNumber;

    public PersonalInformation(String firstName, String lastName, int employNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employNumber = employNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmployNumber() {
        return employNumber;
    }

    public void setEmployNumber(int employNumber) {
        this.employNumber = employNumber;
    }

    public String EmployInfo() {
        return getFirstName() + " " + getLastName() + " " + getEmployNumber();
    }
}
