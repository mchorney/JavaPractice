package hmw10;

public class Dog {
    public String color;
    public String breed;
    private String name;
    public double age;

    public void getDog(String name, String breed, String color, double age){
        this.name=name;
        this.breed = breed;
        this.color = color;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void getAge(){
        if(this.age !=0 && this.age < 2){
            System.out.println(this.name +" is a puppy!");
        }else{
            System.out.println(this.name + " is adult!");
        }
    }

    public void bark(){
        System.out.println(this.name + " says: Whoof!");
    }

    public void playWithMaster(String username){
        System.out.println(this.name + " is playing with " + username);
    }

    public void getDogDetails(){
        System.out.println("Dog info: \n " + "name: " + this.name + ", breed: " + this.breed + ", color: " + this.color);
    }


}
