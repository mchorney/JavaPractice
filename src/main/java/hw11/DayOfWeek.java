package hw11;

public class DayOfWeek {
    private String name;
    private int number;
    private boolean weekend;

    public DayOfWeek(){
        this.name="";
        this.number=0;
        this.weekend=false;
    }
    public DayOfWeek(String name, int number, boolean f){
        this.name=name;
        this.number=number;
        this.weekend=f;
    }
    public String getName(){
        return name;
    }
    public int getNumber(){
        return number;
    }
    public boolean getWeekend(){
        return weekend;
    }
    public void setName(String value){
        name=value;
    }
    public void setNumber(int value){
        number=value;
    }
    public void setWeekend(boolean value){
        weekend=value;
    }
    public void printClass(){
        System.out.println("Day= "+ name);
        System.out.println("Order= "+ number);
        String qqq;
        if(weekend){
            qqq="yes, weekend!";
        }else {
            qqq="no, workday!";
        }
        System.out.println("Today is weekend? "+ qqq);
    }


}
