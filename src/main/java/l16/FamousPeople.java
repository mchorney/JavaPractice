package l16;

public class FamousPeople {
    String firstName;
    String lastName;
    int age;
    String famousFor;

    public FamousPeople(String firstName, String lastName, int age, String famousFor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.famousFor = famousFor;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFamousFor() {
        return famousFor;
    }

    public void setFamousFor(String famousFor) {
        this.famousFor = famousFor;
    }

    public String info() {
        return getFirstName() + " " + getLastName() + " " + getFamousFor() + " age: " + getAge();
    }

}
