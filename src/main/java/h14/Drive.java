package h14;

public class Drive extends Engine{
    protected String typeDrive;

    public Drive(){

    }

    public Drive(String typeDrive) {
        this.typeDrive = typeDrive;
    }

    public Drive(String name, String type, String typeDrive) {
        super(name, type);
        this.typeDrive = typeDrive;
    }

    @Override
    public String toString() {
        return "Drive{" +
                "typeDrive='" + typeDrive + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
