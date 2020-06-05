package homework15;

public abstract class Bird {
    protected String species;
    protected String area_of_living;
    protected int age;


    public Bird(String species, String area_of_living, int age) {
        this.species = species;
        this.area_of_living = area_of_living;
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getArea_of_living() {
        return area_of_living;
    }

    public void setArea_of_living(String area_of_living) {
        this.area_of_living = area_of_living;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void canSing();

    @Override
    public String toString() {
        return "Bird{" +
                "species='" + species + '\'' +
                ", area_of_living='" + area_of_living + '\'' +
                ", age=" + age +
                '}';
    }
}
