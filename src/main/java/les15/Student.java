package les15;

public class Student implements Person{
    private String name;
    private String lastName;
    private int year;

    public Student(String name, String lastName, int year) {
        this.name = name;
        this.lastName = lastName;
        this.year = year;
    }

    @Override
    public void hello(String yourName){
        System.out.println("Hello "+yourName);
    }

    @Override
    public String myName(){
        return "My name is "+name+" "+lastName;
    }

    public void printFullInfo(){
        System.out.println("Name - "+name+" Las Name - "+lastName+
                " Year - "+year);
    }



}
