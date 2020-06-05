package H15;

public class Office extends Tables implements OfficeTable, OfficeChair {
    private int numberOfTables;
    private int usageTimes;

    public Office(String brand, String model, int price, int numberOfTables, int usageTimes) {
        super(brand, model, price);
        this.numberOfTables = numberOfTables;
        this.usageTimes = usageTimes;
    }

    public void convenienceWork() {
        System.out.println("CovenienceWork office table interface implemented for Office");
    }

    public void convenienceWorking(){
        System.out.println("CovenienceWork office chair interface implemented for Office");
    }


}
