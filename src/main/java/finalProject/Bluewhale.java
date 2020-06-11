package finalProject;

public class Bluewhale extends Carnivores{

    private String name;
    private double wight;

    public Bluewhale(String name, double wight) {
        this.name = name;
        this.wight = wight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    @Override
    public void flesh() {
        System.out.println("nah");

    }

    @Override
    public void voice() {
        System.out.println("wooooow my name is" +getName()+"and i am the heivest living thing in world my wight could come too"+getWight());
    }

    @Override
    public void food() {
        System.out.println("plancton smallest thing ever exist");
    }

    @Override
    public void canMove() {
        System.out.println("buy tail");
    }
}
