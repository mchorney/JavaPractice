package HW10;

public class Clothes {
    public String name;
    public String type;
    public int size;
    public String color;
    public boolean female;
    public boolean male;

    public void printMe(){
        if(female=true){
            System.out.println("This is for women");
        } else {
            System.out.println("This is for men");
        }
        System.out.println("Name = " +name);
        System.out.println("Type = " +type);
        System.out.println("Size = " +size);
        System.out.println("Color = " +color);
        System.out.println("************************");

    }
}
