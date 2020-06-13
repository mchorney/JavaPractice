package l11;

public class Person {
    public String name;
    public String lastName;
    public int year;

    public Person(){}

    public Person(int y){
        year=y;
    }

    public Person(int y, String n){
        year=y;
        name=n;
    }

    public Person(String n, String l){
        name=n;
        lastName=l;
    }


    public Person(String n, String l, int y){
        name=n;
        lastName=l;
        year=y;
    }

    public void printOut(){
        System.out.println("Name = " + name + "\nLastName = "+lastName+"\nYear= "+year);
    }
}
