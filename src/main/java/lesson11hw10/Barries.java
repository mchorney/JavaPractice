package lesson11hw10;

public class Barries {
    private String name;
    private String[] placeOforigin;
    private String color;

    public Barries(String name, String[] placeOforigin, String color) {
        this.name = name;
        this.placeOforigin = placeOforigin;
        this.color = color;

    }

    public Barries() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getPlaceOforigin() {
        return placeOforigin;
    }

    public void setPlaceOforigin(String[] placeOforigin) {
        this.placeOforigin = placeOforigin;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printClass(){
        System.out.println("name = " +name);
        for (String placeOforigin:this.placeOforigin) {
            System.out.println(placeOforigin);

        }
        }


    }




