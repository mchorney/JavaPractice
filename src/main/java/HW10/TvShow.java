package HW10;

public class TvShow {
    public String name;
    public String type;
    public String limitation;
    public double rating;
    public int year;
    public boolean familyFriendly;

    public void printMe(){
        if(rating>4){
            System.out.println("We recommend you this TV Show:");
        } else {
            System.out.println("Rating is less then 4, play at your own risk ");
        }
        System.out.println("Name = " +name);
        System.out.println("Type = " +type);
        System.out.println("Limitation = " +limitation);
        System.out.println("Rating = " +rating);
        System.out.println("Year = " +year);
        System.out.println("Family Friendly = " +familyFriendly);
        System.out.println("************************");
    }
}
