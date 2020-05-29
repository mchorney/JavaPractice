package H11;

public class Animal {
    private String name;
    private String lastName;
    private String color;
    private int age;


    public Animal() {};

    public Animal(String n, String l, String c, int a){
        name=n;
        lastName=l;
        color=c;
        age=a;
    }

    public Animal(String n, int a){
        name=n;
        age=a;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void printOut(){
        System.out.println("Name = " + name + "\nlastName =" +lastName +"\nColor = "+color+"\nAge= "+age);
    }
}
