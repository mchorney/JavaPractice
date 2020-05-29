package l11_1;

public class Person {
    public String name;
    public String lastName;
    public String year;

    public Person(String n, String l, int y){
        name = n;
        lastName = l;
        year = y;
    }

    public void printOut(){
        System.out.println("Name =" + name + "\+lastName = " +lastName+"\nYear=" +year);
    }
}
