package homework11;

import java.util.Arrays;

public class Clothes {
    private String type;
    private String[] color;
    private int[] size;
    public Clothes(){}
    public Clothes (String type,String[] color,int[] size) {
        this.type = type;
        this.color = color;
        this.size = size;
    }
    public void setType(String type){
        this.type = type;
    }
    public void  setColor(String[] color){
        this.color = color;
    }
    public void setSize(int[] size){
        this.size=size;
    }
    public String[] getColor (){
        return color;
    }
    public String getType(){
        return type;
    }
    public int[] getSize(){
        return size;
    }
    public void printClass(){
        System.out.println("Type = "+type);
        for (String col:this.color) {
            System.out.println("Color = " + col);
        }
        for (int s:this.size) {
            System.out.println("Size = "+s);
        }

    }
}
