package H15;

public class App {
    public static void main(String[] args) {
        Tables tables = new Tables("HOFF", "Colorado", 6889);
        Chairs chairs = new Chairs("HOFF", "Kokond", 3200);
        KitchenTable kitchenTable = new Home("IKEA", "Stradont", 5600, 1, 1920);
        KitchenChair kitchenChair = new Home("IKEA", "Billy", 4200, 4, 1920);
        OfficeTable officeTable = new Office("HOST", "Frost", 6000, 30, 1920);
        OfficeChair officeChair = new Office("Horst", "Ontario", 4500, 30, 1920);
        ComputerTable computerTable = new Home("BUST", "Sherlock", 4899, 1, 1500);
        ComputerChair computerChair = new Home("HOFF", "Aurora", 7000, 1, 1500);

        kitchenTable.comfortableEat();
        kitchenChair.comfortableSeat();
        officeTable.convenienceWork();
        officeChair.convenienceWorking();
        computerTable.comfortWork();
        computerChair.comfortWorking();



    }
}
