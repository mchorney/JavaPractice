package les12_13;

public class App {
    public static void main(String[] args) {
        Colors car = Colors.GREY;
        String car1="GREY"; //"Grey","grey"


        Snickers nike=new Snickers("nike","air",new Colors[]{Colors.BLACK,Colors.GREY,Colors.PINK});

        MenuOfTheDay myDay =new MenuOfTheDay(FF.FIVEGUYS);

        ADDRESS ndhsad=new ADDRESS("465 New Dorp Lane",
                "Staten Island", States.NY,18386);

        School nd = new School("New Dorp",SchoolType.PUBLIC,ndhsad);
        nd.printOut();

        ADDRESS sitsaadr = new ADDRESS("485 Clawson Street","Staten Island", States.NY,10386);
        School sits = new School("Staten Island Technical High School", SchoolType.PUBLIC,sitsaadr);
        sits.printOut();
    }
}
