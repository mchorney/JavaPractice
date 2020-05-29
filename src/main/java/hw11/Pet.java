package hw11;

import java.util.Arrays;

public class Pet {
    private String name;
    private String type;
    private String[] additions;
    //-------------------------
    public Pet(String a, String t, String[] n){
        this.name = a; this.type = t; this.additions = n;
    }
    public Pet(){}
    public Pet(String n, String t){
        this.name = n; this.type = t;
    }
    //-------------------------
    public void printClass1(){
        //int[] array = {1, 2, 3, 4, 5};
        System.out.println(name + " is "+ type + " has: ");
        for (String element: additions) {
            System.out.println(element);
        }
        //System.out.println("Name = " + this.address + "\nType = " + this.type + "\nAge = "+ this.age);
    }
    public String getName(){
        return this.name;
    }
    public String getType(){
        return this.type;
    }
    public String[] getAdditions(){
        return this.additions;
    }
    public void setName(String a){
        this.name = a;
    }
    public void setType (String t){
        this.type = t;
    }
    public void setAdditions (String[] n){
        this.additions = n;
    }

    //@Override
    public String printClass() {
        return "Pet{" +
                "name ='" + name + '\'' +
                ", type='" + type + '\'' +
                ", has =" + Arrays.toString(additions) +
                '}';
    }
}
