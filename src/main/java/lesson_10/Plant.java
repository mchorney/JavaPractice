package lesson_10;

public class Plant {
    public String name;
    public boolean is_indoor;

    public void setIs_indoor(boolean is_indoor) {
        this.is_indoor = is_indoor;
        if (is_indoor){
            System.out.println("Please keep your "+name+ " indoor");
        }
        System.out.println("You can plant your " +name+ " outdoor");
    }
}
