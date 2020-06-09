package hwLesson17;

public class Car {
    private String carModel;
    private String carPrice;

    public Car(String carModel, String carPrice) {
        this.carModel = carModel;
        this.carPrice = carPrice;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(String carPrice) {
        this.carPrice = carPrice;
    }


    public void printOut() {
        System.out.println("Car{" +
                "carModel='" + carModel + '\'' +
                ", carPrice='" + carPrice + '\'' +
                '}');
    }
}
