package H14;

public class Engine {
    protected String name;
    protected String type;

    public Engine(){

    }

    public Engine(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public void sayHi(){
        System.out.println("Engine say 'HELLO, BOSS'");
    }
}
