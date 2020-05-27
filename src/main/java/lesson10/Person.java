package lesson10;

public class Person {

    // fields:

    public String name;
    public String lastName;
    public int year_of_birth;

    public void printMe(){
        System.out.println("name = " + name);
        System.out.println("last name = " + lastName);
        System.out.println("year of birth = " + year_of_birth);
    }
    public void hello(String pp){
        System.out.println("Hello, " + pp + " my name is " + name + " Nice to meet you!");
    }
}
