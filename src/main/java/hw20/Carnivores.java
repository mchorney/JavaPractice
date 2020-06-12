package hw20;

public abstract class Carnivores implements Mammals {
    protected String name;
    protected String type;

    public Carnivores(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public abstract String myName();

    public void printInfo(){
        System.out.println("i am "+ name + ".  my type is " + type + ", and i am living");
        ibreath();
        ihavevertebrate();
        ieatmilk();
    }
}
