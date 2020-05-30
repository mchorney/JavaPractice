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
    public void setTpyeOfSnake(String tpyeOfSnake){
        this.tpyeOfSnake = tpyeOfSnake;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setNation(String nation){ this.nation= nation; }
    public void setFood(String food){
        this.food = food;
    }
    public void setPoison(String poison){ this.poison=poison; }
    public void setAgeOfliving(int ageOfliving){
        this.ageOfliving = ageOfliving;
    }
    public String getTpyeOfSnake(String tpyeOfSnake){return tpyeOfSnake;}
    public String getName(String name){return  name;}
    public String getNation(String nation){return nation;}
    public String getFood(String food){return food;}
    public String getPoison(String poison){return poison;}
    public int getAgeOfliving(int ageOfliving){return ageOfliving;}
    public void printClass1(){
        System.out.println("type of snake "+tpyeOfSnake+"\nname "+name+"\nnation "+nation+"\nfood "+food+"\npoison "+poison+"\nage of the snake "+ageOfliving);
    }


}
