package finalProjectOOP;

public class BlueWhale extends Whales {

    private String name;
    private int age;
    private String sex;

    public BlueWhale(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public void swimming() {
        System.out.println("I can swim.");
    }

    @Override
    public void voice() {
        if (getAge() < 5) System.out.println("I'm young whale");
        else if (getAge() < 20) System.out.println("I'm in my prime! I can dive sooooooooo dip!!!!!");
        else System.out.println("I'm old. I'm going to die soon.");
    }

    @Override
    public void food() {
        System.out.println("I like plankton");
    }

    @Override
    public void evolution() {
        System.out.println("I was a fish... Now I'm " + getSex() + " whale. My name is " + getName() + " and I'm " + getAge() + " years old." );
    }

    @Override
    public void canBreath() {
        System.out.println("I can inhale 5 000 litres of air and keep my breath up to 60 minutes.");

    }
}
