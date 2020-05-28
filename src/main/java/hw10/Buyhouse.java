package hw10;

public class Buyhouse {

    public String location;
    public String footage;
    public String material;
    public int year;

    public void set_the_open_house (String b){
        System.out.println("set the Open House for house in "+ location  + " on " + b + " by appoitment");

    }

    public void remove_from_my_list () {
        System.out.println("remove from my list the house, which located in " + location + ", because of it's year " + year + " and material " + material   );
    }


}
