package hw14;

public class CarService extends CarDealer{
    private String problem;


    public CarService(String firstname, String lastname, Insurances insurance, PayMethods payment, String dealername, String city, String hoursOfwork, Car car, String problem) {
        super(firstname, lastname, insurance, payment, dealername, city, hoursOfwork, car);
        this.problem = problem;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    @Override
    public void myInfo() {
        System.out.println("Service: {" +
                "Dealership =" + dealername +
                ", City =" + city +
                ", Work Hours =" + hoursOfwork +
                ", Vehicle =" + car +
                ", Problem =" + problem +
                ", Customer Name =" + firstname +
                ", Insurance =" + insurance +
                ", Payment Type =" + payment +
                '}');
    }
}
