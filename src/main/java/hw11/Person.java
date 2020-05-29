package hw11;

import java.util.Arrays;

public class Person {
    private String name;
    private String occupation;
    private String[] country;
    //-------------------------
    public Person(String n, String o, String[] c){
        this.name = n; this.occupation = o; this.country = c;
    }
    public Person(){}

    //-------------------------
    public void printClass1(){
        //int[] array = {1, 2, 3, 4, 5};
        System.out.println(name + " is "+ occupation + " has been in: ");
        for (String element: country) {
            System.out.println(element);
        }
        //System.out.println("Name = " + this.address + "\nType = " + this.type + "\nAge = "+ this.age);
    }
    public String getName(){
        return this.name;
    }
    public String getOccupation(){
        return this.occupation;
    }
    public String[] getCountry(){
        return this.country;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setOccupation (String o){
        this.occupation = o;
    }
    public void setCountry (String[] c){
        this.country = c;
    }

    //@Override
    public String printClass() {
        return "Person {" +
                "name='" + name + '\'' +
                ", occupation ='" + occupation + '\'' +
                ", has been in =" + Arrays.toString(country) +
                '}';
    }
}
