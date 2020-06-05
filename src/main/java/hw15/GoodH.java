package hw15;

public class GoodH implements TypeOfH {
    protected String name;

    public GoodH(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println("dosent matter what your name"+name+"it always will be bad");

    }

    @Override
    public void finish() {
        System.out.println("but at the end of the way you always will be wining");

    }
}
