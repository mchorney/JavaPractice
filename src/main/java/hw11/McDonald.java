package hw11;

public class McDonald {
    private String name;
    private String typeOfBread;
    private String typeOfSalat;
    private String typeOfOnion;
    private String[] typeOfMeat;
    private int priceOfBugrger;

    public McDonald(){}
    public McDonald(String a,String b,String c,String d,String[] e,int f){
        name = a;
        typeOfBread = b;
        typeOfSalat =c;
        typeOfOnion = d;
        typeOfMeat = e;
        priceOfBugrger = f;
    }
    public McDonald (String typeOfBread, String[] typeOfMeat, int priceOfBugrger){
        this.typeOfBread = typeOfBread;
        this.typeOfMeat = typeOfMeat;
        this.priceOfBugrger = priceOfBugrger;
    }

    public McDonald(String regular_with_nuts, String s, int priceOfBugrger) {
    }

    public void price(int priceOfBugrger){
        if(priceOfBugrger<3){
            priceOfBugrger = 3;
        }
        if(priceOfBugrger>10){
            priceOfBugrger= 10;
        }
        this.priceOfBugrger = priceOfBugrger;
    }
    public void name(String name){
        this.name = name;
    }
    public void bread(String typeOfBread){
        this.typeOfBread = typeOfBread;
    }
    public void salat(String typeOfSalat){
        this.typeOfSalat = typeOfSalat;
    }
    public void onion(String typeOfOnion){
        this.typeOfOnion = typeOfOnion;
    }
    public void meat(String[] typeOfMeat){
        this.typeOfMeat = typeOfMeat;
    }
    public int t1(){
        return priceOfBugrger;
    }
    public String t2(){
        return name;
    }
    public String t3(){
        return typeOfBread;
    }
    public String t4(){
        return typeOfSalat;
    }
    public String t5(){
        return typeOfOnion;
    }
    public String[] t6(){
        return typeOfMeat;
    }
    public  void printClass(){
        System.out.println("burger name = "+name+"\nbread = "+typeOfBread+"\nsalat = "+ typeOfSalat+"\nonion"+typeOfOnion+"\nprice of burger = $"+ priceOfBugrger);
        System.out.println("type of meat "+" = ");
        for (String v:typeOfMeat){
            System.out.println(v+"");
        }

    }

}
