package hw11;

import java.util.Arrays;

public class House {
    private String address;
    private String type;
    private int[] passOpen;
    //-------------------------
    public House(String a, String t, int[] n){
        this.address = a; this.type = t; this.passOpen = n;
    }
    public House(){}
    //-------------------------
    public void printClass1(){
        //int[] array = {1, 2, 3, 4, 5};
        System.out.println(address + " is "+ type + " has password: ");
        for (int element: passOpen) {
            System.out.println(element);
        }
        //System.out.println("Name = " + this.address + "\nType = " + this.type + "\nAge = "+ this.age);
    }
    public String getAddress(){
        return this.address;
    }
    public String getType(){
        return this.type;
    }
    public int[] getN(){
        return this.passOpen;
    }
    public void setAddress(String a){
        this.address = a;
    }
    public void setType (String t){
        this.type = t;
    }
    public void setPassOpen (int[] n){
        this.passOpen = n;
    }

    //@Override
    public String printClass() {
        return "House{" +
                "address='" + address + '\'' +
                ", type='" + type + '\'' +
                ", passOpen=" + Arrays.toString(passOpen) +
                '}';
    }
}
