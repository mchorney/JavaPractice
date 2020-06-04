package l11;

public class Person {
    public String name;
    public String lastName;
    public int year;

    public Person(){}
    public Person(String n, String l, int y){
    name=n;
    lastName=l;
    year=y;
    }

    public void printOut(){
        System.out.println("Name = " + name + "\nLast Name = " + lastName + "\nYear = " + year);
    }
}
