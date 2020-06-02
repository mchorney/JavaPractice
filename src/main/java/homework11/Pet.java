package homework11;

public class Pet {
    private String type;
    private String name;
    private String breed;
    public Pet(){}
    public Pet(String type, String name, String breed){
        this.type=type;
        this.name=name;
        this.breed=breed;
    }
    public void setName(String name){
        this.name = name;
    }
    public void  setBreed(String breed){
        this.breed = breed;
    }
    public void setType(String type){
        this.type=type;
    }
    public String getType (){
        return type;
    }
    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }
    public void printClass(){
        System.out.println("Type = "+type + "\nName = " + name + "\nBreed = "+breed);

    }
}
