package hmw10;

public class Breakfast {
    public boolean isCoffee;
    public boolean isJuice;
    public String food;

    public void addCoffee(){
        this.isCoffee = true;
    }

    public void addOrangeJuice(){
        this.isJuice = true;
    }

    public void setBreakfast(String food){
        this.food = food;
    }

    public void serveBreakfast(){
        if (this.food == null){
            System.out.println("Please choose your breakfast food!");
        }else if(!this.isJuice && !this.isCoffee){
            System.out.println("Please choose your drink!");
        }else if(!this.isJuice){
            System.out.println("You are eating " + this.food + " for breakfast served with coffee!");
        }else if(!this.isCoffee){
            System.out.println("You are eating " + this.food + " for breakfast served with orange juice!");
        }else{
            System.out.println("You are eating " + this.food + " for breakfast served with orange juice and coffee!");
        }

    }
}
