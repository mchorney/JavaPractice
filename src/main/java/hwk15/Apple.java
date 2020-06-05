package hwk15;

public class Apple extends TreeFruits{
    private String name;

    public Apple(String name) {
        super(TreeFruitTypes.APPLE);
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getVitamins() {
        System.out.println("Apples have lots of vitamin B");
    }


}
