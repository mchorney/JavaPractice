package hw11;

public class Dog {
    private String name;
    private String breed;
    private String[] hair_type;

    public Dog(String name, String breed, String[] hair_type) {
        this.name = name;
        this.breed = breed;
        this.hair_type = hair_type;
    }

    public Dog() {
    }

    ;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setHair_type(String[] hair_type) {
        this.hair_type = hair_type;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String[] getHair_type() {
        return hair_type;
    }

    public void printOut() {
        System.out.println("Name = " + this.name + "\nBreed = " + this.breed + "\nHair_type = " + this.hair_type);
        for (String v : hair_type) {
            System.out.println("possible hair_type" + v);
        }

    }
}

