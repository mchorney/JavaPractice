package hw15;

public class SoftDrinks implements Beverage{
    private String name;
    private boolean weatherHot;
    private boolean alco;
    private TypesOfMilk typesOfMilk;
    private boolean addLemon;

    public SoftDrinks(String name, boolean addLemon, boolean weatherHot, boolean alco, TypesOfMilk typesOfMilk) {
        this.name = name;
        this.weatherHot = weatherHot;
        this.alco = alco;
        this.typesOfMilk = typesOfMilk;
        this.addLemon=addLemon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isWeatherHot() {
        return weatherHot;
    }

    public void setWeatherHot(boolean weatherHot) {
        this.weatherHot = weatherHot;
    }

    public boolean isAlco() {
        return alco;
    }

    public void setAlco(boolean alco) {
        this.alco = alco;
    }

    public TypesOfMilk getTypesOfMilk() {
        return typesOfMilk;
    }

    public void setTypesOfMilk(TypesOfMilk typesOfMilk) {
        this.typesOfMilk = typesOfMilk;
    }

    @Override
    public void tempOfBev() {
        System.out.println(name+" is so cold and refreshing in this weather!");
    }

    @Override
    public boolean ice() {
        if (weatherHot){
            return true;}
        else return false;
    }

    @Override
    public void alcoAndAge() {
        if(alco){
            System.out.println("You have to be over 21 to have this, may I see your ID?");
        }
        else{
            System.out.println("This beverage does not contain any alcohol.");
        }
    }

    @Override
    public boolean lactose() {
        if(typesOfMilk==TypesOfMilk.REGULAR||typesOfMilk==TypesOfMilk.SKIM){
            return true;}
        else return false;
    }

    @Override
    public void printInfo() {
        System.out.println("SoftDrinks{" +
                "Name = '" + name + '\'' +
                ", It is Hot Outside = " + weatherHot +
                ", Contains Alcohol = " + alco +
                ", Lactose = " + typesOfMilk +
                '}');
    }
}
