package l10;

public class Animals {

    public String name;
    public String type;
    public int age;

    public String ageCheck() {
        if (age < 4) return "You have young " + type;
        else if (age < 9) return "You have middle age " + type;
        else return "You have old " + type;
    }

    public void info() {
        System.out.println("Your " + type + " " + name + " is awesome!!! And just " + age + " years old.");
    }
}
