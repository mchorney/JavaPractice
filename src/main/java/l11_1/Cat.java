package l11_1;

public class Cat {
    private String name;
    private String breed;
    private int age;

    public Cat(String name, String breed, int age){
        this.name=name;
        this.breed = breed;
        this.age=age;
    }

    public Cat(String name){

        this.name=name;
    }

    public void setName(String name){

        this.name = name;
    }

    public void  setBreed(String b){

        this.breed = b;
    }
    public void setAge(int a){

        this.age=a;
    }

    public String getName(){

        return this.name;
    }

    public String getBreed(){

        return breed;
    }

    public int getAge(){

        return this.age;
    }


    public void printOut(){

        System.out.println("Name = " + name + "\nBreed = "+this.breed+"\nAge= "+this.age);
    }
}
