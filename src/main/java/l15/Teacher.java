package l15;

public class Teacher implements Person {

    private String name;
    private String academicDegree;
    private int studentsPass;
    private int studentsAttendToPass;

    public Teacher(String name, String academicDegree, int studentsPass, int studentsAttendToPass) {
        this.name = name;
        this.academicDegree = academicDegree;
        this.studentsPass = studentsPass;
        this.studentsAttendToPass = studentsAttendToPass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    public int getStudentsPass() {
        return studentsPass;
    }

    public void setStudentsPass(int studentsPass) {
        this.studentsPass = studentsPass;
    }

    public int getStudentsAttendToPass() {
        return studentsAttendToPass;
    }

    public void setStudentsAttendToPass(int studentsAttendToPass) {
        this.studentsAttendToPass = studentsAttendToPass;
    }

    @Override
    public void info() {
        System.out.println("Teacher name is " + getName());
        System.out.println("Teacher academic degree is " + getAcademicDegree());
        System.out.println("This class attempt to pass " + getStudentsAttendToPass() + " students.");
        System.out.println("But passed this class only " + getStudentsPass() + " students.");
    }

    @Override
    public int averageScore() {
        return getStudentsAttendToPass() - getStudentsPass();
    }
}
