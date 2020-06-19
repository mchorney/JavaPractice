package l12;

public class App12 {
    public static void main(String[] args) {
        Address ndhsAddress = new Address("465 New Dorp Lane", "State Island", States.CA, 40092);

        Schools newDorp = new Schools("NewDorp",SchoolType.PUBLIC,ndhsAddress);
        newDorp.printOut();
    }
}
