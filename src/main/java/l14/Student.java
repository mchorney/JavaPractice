package l14;

import java.util.Arrays;

public class Student extends Person{
    private int[] Grades;
    private int YearInCollege;

    public Student(String firstName, String lastName, String[] classes, int[] grades, int yearInCollege) {
        super(firstName, lastName, classes);
        Grades = grades;
        YearInCollege = yearInCollege;
    }

    public int getYearInCollege() {
        return YearInCollege;
    }

    public void setYearInCollege(int yearInCollege) {
        YearInCollege = yearInCollege;
    }

    public String[] getClasses() {
        return Classes;
    }

    public void setClasses(String[] classes) {
        Classes = classes;
    }

    public int[] getGrades() {
        return Grades;
    }

    public void setGrades(int[] grades) {
        Grades = grades;
    }

    @Override
    public void Info() {
        System.out.println("Full name: " + getFullName() + ".");
        System.out.println("Classes taken: " + Arrays.toString(getClasses()) + ".");
        System.out.println("Grades: " + Arrays.toString(getGrades()) + ".");
        switch (YearInCollege) {
            case 1:
                System.out.println("Hello freshman!!!");
                break;
            case 2:
                System.out.println("Howdy sophomore...");
                break;
            case 3:
                System.out.println("You are junior? Nice!");
                break;
            case 4:
                System.out.println("It's always nice to see a senior. Respect!!!");
                break;
        }
        System.out.println();
    }
}
