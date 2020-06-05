package homework15;

public class Hummingbird extends Bird implements Flyable {

    boolean can_drink_nektar;

    public Hummingbird(String species, String area_of_living, int age, boolean can_drink_nektar) {
        super(species, area_of_living, age);
        this.can_drink_nektar = can_drink_nektar;
    }

    @Override
    public void canSing() {
        System.out.println("I am a hummingbird - I can twitter, creak, whistle and buzz, but not sing such beautiful songs as nightingale!");
    }

    @Override
    public boolean canFly() {
        System.out.println("I am a hummingbird, I am small, but I can fly!");
        return true;
    }

    public String aboutMe() {
        return "Hummingbird{" +
                "can_drink_nektar=" + can_drink_nektar +
                ", species='" + species + '\'' +
                ", area_of_living='" + area_of_living + '\'' +
                ", age=" + age +
                '}';
    }
}
