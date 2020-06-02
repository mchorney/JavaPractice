package hwk12;

public class Dog {
    private String name;
    private int age;
    private DogBreed breed;

    public Dog(){

    }

    public Dog(int age, DogBreed breed){
        this.age = age;
        this.breed=breed;
    }

    public int getAge() {
        return age;
    }

    public DogBreed getBreed() {
        return breed;
    }

    public String getName() {
        if(name==null) {
            return breed.getName();
        } else{
            return this.name;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(DogBreed breed) {
        this.breed = breed;
    }
}
