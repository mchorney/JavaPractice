package hw14;

public class Bank extends Address {
    private BankName bank;
    private double bankRating;



    public Bank(int buildingNumber, String street, City city, State state, int zipcode, BankName bank, double bankRating) {
        super(buildingNumber, street, city, state, zipcode);
        this.bank = bank;
        this.bankRating = bankRating;
    }

    public BankName getBank() {
        return bank;
    }

    public void setBank(BankName bank) {
        this.bank = bank;
    }

    public double getBankRating() {
        return bankRating;
    }

    public void setBankRating(double bankRating) {
        this.bankRating = bankRating;
    }


    @Override
    public void printInfo() {
        System.out.println( "Bank{" +
                "bank=" + bank +
                ", bankRating=" + bankRating +
                ", buildingNumber=" + buildingNumber +
                ", street='" + street + '\'' +
                ", city=" + city +
                ", state=" + state +
                ", zipcode=" + zipcode +
                '}');
    }
}
