package hw11;

public class Bootcamps {
    private String name;
    private String duration;
    private String trainer;
    private String [] topics;


    public Bootcamps(String name, String duration, String trainer, String[]topics){
        this.name = name;
        this.duration = duration;
        this.trainer = trainer;
        this.topics = topics;


    }

    public Bootcamps (){};

    public Bootcamps (String name, String duration) {
        this.name=name;
        this.duration =duration;
    }

    public void setName (String name){
        this.name=name;
    }

    public void setDuration (String duration) {
        this.duration= duration;

    }
    public void setTrainer (String trainer) {
        this.trainer= trainer;

    }

    public void setTopics (String[]topics) {
        this.topics = topics;
    }

    public String getName (){
        return name;
    }

    public String getDuration (){
        return this.duration;
    }

    public String getTrainer(){
        return this.trainer;

    }

    public String[] getTopics(){
        return this.topics;
    }



    public void printOut() {
        System.out.println("Name = " + name + "\nDuration = " + this.duration + "\nTrainer= " + this.trainer + "\ntopics = " + this.topics);
    }

    public void printOut1() {
        System.out.println("Name = " + name + "\nDuration = " + this.duration );
    }




}
