package hw11;

public class Exercise {
    private String name;
    private String partOfBody;
    private String type;

    public Exercise(){};

    public Exercise(String name,String type,String partOfBody){
        this.name = name;
        this.type = type;
        this.partOfBody=partOfBody;
    }
    public Exercise(String n,String pb){
        name=n;
        partOfBody=pb;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPartOfBody(String partOfBody) {
        this.partOfBody = partOfBody;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getPartOfBody() {
        return partOfBody;
    }

    public void printClass(){
        String t=" ";
        if ( type.equals("Cardio")){
            t="burning a lot of calories.";
        }
        else{
            t="building strong muscles";}

        System.out.println("When you do "+name+", you are training your "+partOfBody+" and "+t);
    }
}
