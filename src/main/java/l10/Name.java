package l10;

public class Name {

    public String firstName;
    public String lastName;

    public void fullName() {
        System.out.println("The full name is: " + firstName + " " + lastName);
    }

    public void greatings() {
        System.out.println("Hello my dear friend " + firstName);
    }

    public String matrix() {
        return "You are the chosen one, mrs " + lastName;
    }
}
