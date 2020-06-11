package finalProject;

public class Wolf extends Carnivores {
    private String name;

    public Wolf(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public void flesh() {
        System.out.println("zombie flesh");
    }

    @Override
    public void voice() {
        System.out.println("my name is "+getName());
    }

    @Override
    public void food() {
        System.out.println("meat!");
    }

    @Override
    public void canMove() {
        System.out.println("Yes, i can Move.");
    }
}
