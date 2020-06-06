package hw14;

public class Film {
        protected String name;
        protected String producer;
        protected int year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Film(String name, String producer, int year) {
        this.name = name;
        this.producer = producer;
        this.year = year;
    }


    public void description (String yourName){
        System.out.println("Hi, " + yourName + " And the Oscar goes to... "+name+ " Please welcome and congratulations to the all who made the " + name + " happened... to Producer" + producer);
    }


}
