package l14;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Person {
    protected String FirstName;
    protected String LastName;
    protected String[] Classes;

    public Person(String firstName, String lastName, String[] classes) {
        FirstName = firstName;
        LastName = lastName;
        Classes = classes;
    }

    public Person(String firstName, String lastName) {
        FirstName = firstName;
        LastName = lastName;
    }

    public String[] getClasses() {
        return Classes;
    }

    public void setClasses(String[] classes) {
        Classes = classes;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFullName() {
        return getFirstName() + " " + getLastName();
    }

    public void Info() {
        System.out.println("Full name: " + getFullName() + ".");
        if(getClasses()!=null) System.out.println("Extra info: " + Arrays.toString(getClasses())+ ".");
        System.out.println();
    }
}
