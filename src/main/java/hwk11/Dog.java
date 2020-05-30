package hwk11;

public class Dog {
    private String color;
    private String breed;
    private String name;
    private double age;

    public Dog(){
    }

    public Dog(String name, String breed, String color, double age){
        this.name=name;
        this.breed = breed;
        this.color = color;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public void setAge(double text){
        age = text;
    }

    public String getName(){
        return name;
    }

    public double getAge(){
        return age;
    }

    public String getBreed(){
        return breed;
    }

    public String getColor(){
        return color;
    }

    public void printClass(){
        System.out.println("Dog info: \n " + "name: " + this.name + ", breed: " + this.breed + ", color: " + this.color + ", age: " + age);
    }


}

