package hw11;

public class Teacher {
    private String firstName;
    private String lastName;
    private String topic;

    public Teacher() {
    }

    public Teacher(String firstName, String lastName, String topic) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.topic = topic;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTopic() {
        return topic;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }


    public void printClass() {
        System.out.println("First name of the teacher: " + firstName + "\n" +
                "Last name of the teacher: " + lastName + "\n" +
                "Topic of the teacher: " + topic);
    }
}
