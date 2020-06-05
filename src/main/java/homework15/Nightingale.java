package homework15;

public class Nightingale extends Bird implements Flyable {

    public Nightingale(String species, String area_of_living, int age) {
        super(species, area_of_living, age);
    }

    @Override
    public void canSing() {
        System.out.println("I am a nightingale -  I can sing beautiful songs!!");
    }

    @Override
    public boolean canFly() {
        System.out.println("I am a nightingale and I can fly!");
        return true;
    }

    public String aboutMe() {
        return "Nightingale{" +
                "species='" + species + '\'' +
                ", area_of_living='" + area_of_living + '\'' +
                ", age=" + age +
                '}';
    }
}
