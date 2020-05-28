package hmw10;

public class Car {
    public String make;
    public String model;
    public int year;

    public void getCar(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void speed(int value){
        System.out.println("Car is going " + value + " mi/hr");
    }

    public void fullSpeed(){
        System.out.println("Car is going full speed");
    }

    public void breaking(){
        System.out.println("Car has stopped");
    }

    public void getCarDetails(){
        System.out.println("Car make is " + make + "\n" + "Car model is " + model + "\n" + "Car year is " + year + ";");
    }

    public String getModel(){
        return this.model;
    }

    public String getMake(){
        return this.make;
    }

    public int getYear(){
        return this.year;
    }
}
