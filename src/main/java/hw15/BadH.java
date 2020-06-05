package hw15;

public class BadH implements TypeOfH {
    protected String name;

    public BadH(String name) {
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
        System.out.println("with good name like: "+name+" it will be good start");
    }

    @Override
    public void finish() {
        System.out.println("at the end it always will be bad end");

    }
}
