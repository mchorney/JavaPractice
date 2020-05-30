package hw11;

public class Snake1 {
    private String tpyeOfSnake;
    private String name;
    private String nation;
    private String food;
    private String poison;
    private int ageOfliving;

    public Snake1(){}
    public Snake1(String a, String b, String c, String d, String e, int f){
        tpyeOfSnake = a;
        name = b;
        nation = c;
        food = d;
        poison = e;
        ageOfliving =f;
    }
    public Snake1 (String tpyeOfSnake,String food,String poison){
        this.tpyeOfSnake = tpyeOfSnake;
        this.food = food;
        this.poison = poison;

    }
    public void q1(){
        this.tpyeOfSnake = tpyeOfSnake;
    }
    public void q2(){
        this.name = name;
    }
    public void q3(){
        this.nation= nation;
    }
    public void q4(){
        this.food = food;
    }
    public void q5(){
        this.poison=poison;
    }
    public void q6(){
        this.ageOfliving = ageOfliving;
    }
    public String w1(){return tpyeOfSnake;}
    public String w2(){return  name;}
    public String w3(){return nation;}
    public String w4(){return food;}
    public String w5(){return poison;}
    public int w6(){return ageOfliving;}
    public void printClass1(){
        System.out.println("type of snake "+tpyeOfSnake+"\nname "+name+"\nnation "+nation+"\nfood "+food+"\npoison "+poison+"\nage of the snake "+ageOfliving);
    }


}
