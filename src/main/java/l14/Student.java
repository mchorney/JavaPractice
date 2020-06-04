package l14;

public class Student extends Person{
    private University University;
    private Subject major;

    public Student(String name, String lastName, int year, l14.University university, Subject major) {
        super(name,lastName,year);
        University = university;
        this.major = major;
    }

    public l14.University getUniversity() {
        return University;
    }

    public void setUniversity(l14.University university) {
        University = university;
    }

    public Subject getMajor() {
        return major;
    }

    public void setMajor(Subject major) {
        this.major = major;
    }

    public void myInfo() {
        System.out.println("Student {" + name + "Last Name" + lastName +"}");
    }
}
