package home10;

public class Family {
    public String name;
    public String lastName;
    public String hairColor;
    public int age;

    public void printMe(){
        System.out.println("name= "+ name);
        System.out.println("Lastname= "+lastName);
    }

    public void hello(){
        System.out.println(("Hello, my name is "+name+" my age "+age));
    }
}
