package hw14;


public class App {
    public static void main(String[] args) {


        Address address1 = new Address(123, "Academy", City.New_York_City, State.NY,12121);



         address1.printInfo();


         Bank wf = new Bank(432,"First",City.Atlantic_City,State.NJ,34354,BankName.Wells_Fargo,4.7);

         wf.printInfo();

    }

}
