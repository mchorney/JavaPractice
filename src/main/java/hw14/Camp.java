package hw14;

public class Camp {
    protected String type;
    protected String duration;
    protected int cost;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Camp(String type, String duration, int cost) {
        this.type = type;
        this.duration = duration;
        this.cost = cost;

    }

    public void printInfo (String yourName){
        System.out.println("Hi, " + yourName + ", let me tell you about our " + type + ". This " + type + " is all what you was looking for. Join us!");}

//    public void printMe() {
//        System.out.println("Camp{" +
//                "type=" + type +
//                ", duration=" + duration +
//                ", cost=" + cost + " dollars" +
//                '}');
    }


