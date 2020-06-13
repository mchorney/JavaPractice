package l10;

public class Person {
    public String name;
    public String lastName;
    public int year;

    public void printMe(){
        System.out.println("name = "+name);
        System.out.println("Last name = "+lastName);
        System.out.println("Year = " + year);
    }
    public void hello(String pp){
        System.out.println("Hello," +pp+ " my name is "+name + " nice to meet you!");
    }
}
