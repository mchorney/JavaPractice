package hwk13;

public class Keyboard {
    private KeyboardType type;

    public Keyboard(KeyboardType type) {
        this.type = type;
    }

    public KeyboardType getType() {
        return type;
    }

    public void printInfo() {
        System.out.println("Keyboard{" +
                "type=" + type.name() +
                '}');
    }
}
