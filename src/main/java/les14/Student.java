package les14;

public class Student extends Person{
    private University university;
    private Subject major;

    public Student(String name, String lastName, int year, University university, Subject major) {
        super(name,lastName,year);
        this.university = university;
        this.major = major;
    }


    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public Subject getMajor() {
        return major;
    }

    public void setMajor(Subject major) {
        this.major = major;
    }


    public void myInfo(){
        System.out.println(
            "name='" + name + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", year=" + year +
                    ", university=" + university +
                    ", major=" + major );
    }
}
