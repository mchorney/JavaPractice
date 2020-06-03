package hw14;

public class Supermarket1 extends Supermarket {
    private String cafeName;
    private Format format;

    public Supermarket1(String name, City city, int openYear, String cafeName, Format format) {
        super(name, city, openYear);
        this.cafeName = cafeName;
        this.format = format;
    }
    public void invitationInfo(String folkName){
        System.out.println("В нашем супермаркете открыто кафе "+'"'+ cafeName+'"'+".");
    }

}
