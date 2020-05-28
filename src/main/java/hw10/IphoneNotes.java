package hw10;

public class IphoneNotes {
    public String name;
    public String topic;
    public String location;


    public void printMe() {
        System.out.println("what " + name);
        System.out.println("combined by " + topic + "topic");
        System.out.println("located in " + location);

    }

    public void addnew(){

        System.out.println("add new in " + name);
    }

    public void markas(String a){
        System.out.println("mark as done " + a + "for " + topic + " in " + location);
    }





}
