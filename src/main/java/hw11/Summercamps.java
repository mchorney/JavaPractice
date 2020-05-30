package hw11;

public class Summercamps {
    private String name;
    private String location;
    private String month;
    private String [] lastnames;


    public Summercamps (String name, String location, String month,String[]lastnames ){
        this.name = name;
        this.location = location;
        this.month = month;
        this.lastnames=lastnames;
    }

    public Summercamps (){};
    public Summercamps (String name, String location, String month) {
        this.name = name;
        this.location = location;
        this.month = month;

    }

    public void setName (String name){
        this.name=name;
    }
    public void setLocation (String location) {
        this.location=location;
    }
    public void setMonth (String month) {
        this.month=month;
    }

    public void setLastnames(String[] lastnames) {
        this.lastnames = lastnames;
    }

    public String getName (){
        return name;
    }
    public String getLocation(){
        return location;
    }

    public String getMonth (){
        return month;
    }
    public String [] getLastnames (){
        return lastnames;
    }

    public void printOut() {
        System.out.println("Name = " + name + "\nlocation = " + this.location + "\nmonth= " + this.month + "\nlastnames= " + this.lastnames);
    }


}

