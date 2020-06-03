package l14;

import java.util.Arrays;

public class Teachers extends Person {
     private String AcademicDegree;
     private int TotalStudents;

    public Teachers(String firstName, String lastName, String[] classes, String academicDegree, int totalStudents) {
        super(firstName, lastName, classes);
        AcademicDegree = academicDegree;
        TotalStudents = totalStudents;
    }

    public String getAcademicDegree() {
        return AcademicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        AcademicDegree = academicDegree;
    }

    public int getTotalStudents() {
        return TotalStudents;
    }

    public void setTotalStudents(int totalStudents) {
        TotalStudents = totalStudents;
    }

    @Override
    public void Info() {
        System.out.println("Full name: " + getFullName() + ".");
        System.out.println("Academic degree: " + getAcademicDegree() + ".");
        System.out.println("Speciality: " + Arrays.toString(getClasses()) + ".");
        System.out.println("Total students per year: " + getTotalStudents() + ".");
        System.out.println();
    }
}
