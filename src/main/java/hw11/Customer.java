package hw11;

public class Customer {
    private String name;
    private String lastName;
    private int age;
    private char gender;

    public Customer(){}


    public Customer(String n, String l, int a, char g){
        name=n;
        lastName=l;
        age=a;
        gender=g;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() { return age; }

    public char getGender() {return gender;}


    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public void setAge(int age) { this.age = age; }

    public void setGender(char gender) { this.gender = gender;}

    public void printOut(){
        System.out.println("Name = " + name + "\nLastName = "+lastName+"\nAge = "+age+"\nGender = "+gender);
    }
}







