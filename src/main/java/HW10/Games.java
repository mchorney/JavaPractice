package HW10;

public class Games {
    public String name;
    public String type;
    public String rating;
    public int a_rating;
    public int year;

    public void printMe(){
        if(a_rating>4){
            System.out.println("We recommend you this game:");
        } else {
            System.out.println("Rating is less then 4, play at your own risk ");
        }
        System.out.println("Name = " +name);
        System.out.println("Type = " +type);
        System.out.println("Rating = " +rating);
        System.out.println("Year = " +year);
    }
}
