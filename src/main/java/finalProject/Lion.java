package finalProject;

public class Lion extends Carnivores{
    private String name;
    private String position;

    public Lion(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public void flesh() {
        System.out.println("i eat flesh");
    }

    @Override
    public void voice() {
        System.out.println("arrrrrrr my name arrr "+getName()+ " and my position "+ getPosition());
    }

    @Override
    public void food() {
        System.out.println("everthing that on my teritory");
    }

    @Override
    public void canMove() {
        System.out.println("i use all 4 leggs to move");
    }
}
