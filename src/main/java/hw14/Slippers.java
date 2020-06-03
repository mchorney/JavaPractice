package hw14;

public class Slippers extends Shoes{
   private TypeOfSlippers typeOfSlippers;

    public Slippers(String brand, Size size, ForWho gender, Season season, int price, TypeOfSlippers typeOfSlippers) {
        super(brand, size, gender, season, price);
        this.typeOfSlippers = typeOfSlippers;
    }

    public TypeOfSlippers getTypeOfSlippers() {
        return typeOfSlippers;
    }

    public void setTypeOfSlippers(TypeOfSlippers typeOfSlippers) {
        this.typeOfSlippers = typeOfSlippers;
    }

    @Override
    public void printMe() {
        System.out.println("Slippers{" +
                "typeOfSlippers=" + typeOfSlippers +
                ", Brand='" + Brand + '\'' +
                ", size=" + size +
                ", gender=" + gender +
                ", season=" + season +
                ", price=$" + price +
                '}');
    }
}
