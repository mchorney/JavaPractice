package l11;

public class Dog {
    public String name;
    public String breed;
    public int age;

    public Dog(String name, String breed, int age){
        this.name=name;
        this.breed = breed;
        this.age=age;
    }
    public Dog(){};

    public void printOut(){
        System.out.println("Name = " + name + "\nBreed = "+this.breed+"\nAge= "+this.age);
    }
}
