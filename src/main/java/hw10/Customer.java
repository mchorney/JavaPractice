package hw10;

public class Customer {

    public String name;
    public String lastName;
    public int age;

    public void customerInfo(){
        System.out.println("Customer name is "+name);
        System.out.println("Last name is = "+lastName);
        System.out.println("Customer age is " + age);
    }
    public void hello(){
        System.out.println("Hello, my name is "+name + ", I am "+age +"!");
    }
}