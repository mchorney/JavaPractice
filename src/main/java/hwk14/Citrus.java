package hwk14;

public class Citrus extends Fruit{
    private Type type;
    private CitrusFamily citrusFamily;

    public Citrus(String name, String color, Taste taste, boolean seeds, SugarLevel sugarlevel, Type type, CitrusFamily citrusFamily) {
        super(name, color, taste, seeds, sugarlevel);
        this.type = type;
        this.citrusFamily = citrusFamily;
    }

    public Type getType() {
        return type;
    }

    public CitrusFamily getCitrusFamily() {
        return citrusFamily;
    }

    @Override
    public void printFruit(){
        System.out.println("Citrus{" +
                "type=" + type.name() +
                ", family=" + citrusFamily.name() +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", taste=" + taste.name() +
                ", seeds=" + seeds +
                ", sugarlevel=" + sugarlevel.name() +
                '}');
    }
}
