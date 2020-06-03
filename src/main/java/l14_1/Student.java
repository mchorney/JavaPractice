package l14_1;

public class Student extends Person{
    private Universaty university;
    private Subject major;

    public Student(String name, String lastName, int year, Universaty university, Subject major) {
        super(name,lastName,year);
        this.university = university;
        this.major = major;
    }

    public Universaty getUniversity() {
        return university;
    }

    public void setUniversity(Universaty university) {
        this.university = university;
    }

    public Subject getMajor() {
        return major;
    }

    public void setMajor(Subject major) {
        this.major = major;
    }

    public void myInfo(){
        System.out.println("Student " + "name='" + name + '\'' + ", lastName='" + lastName + '\'' + ", year=" + year + ", university=" + university +", major=" + major);
    }
}
