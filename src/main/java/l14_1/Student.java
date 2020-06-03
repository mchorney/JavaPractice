package l14_1;

public class Student extends Person{
//    private String name;
//    private String lastName;
//    private int year;
    private Universaty universaty;
    private Subject major;

    public Student(String name, String lastName, int year, Universaty universaty, Subject najor) {
//        this.name = name;
//        this.lastName = lastName;
//        this.year = year;
        
        this.universaty = universaty;
        this.major = major;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//    public void setYear(int year) {
//        this.year = year;
//    }

    public Universaty getUniversaty() {
        return universaty;
    }

    public void setUniversaty(Universaty universaty) {
        this.universaty = universaty;
    }

    public Subject getMajor() {
        return major;
    }

    public void setNajor(Subject major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", year=" + year +
                ", universaty=" + universaty +
                ", najor=" + major +
                '}';
    }

    public void myInfo(){
        System.out.println("Student =" + );
    }
}
