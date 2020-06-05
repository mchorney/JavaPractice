package l15;

public class Student extends Person {

    public Student(String name, String lastName, int year) {
        super(name, lastName, year);
    }


    public String myName(){
        return "My name is "+name+" "+ lastName;
    }

    public void printFullInfo(){
        System.out.println(name + " " + lastName+" " +year);
    }
}
