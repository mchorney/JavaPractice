package hw10;

public class Decorative_pillow {
    public String color;
    public String condition;
    public String phrase;

    public void newColor(){
        System.out.println("The pillow with a phrase '"+phrase+"' used to be only in "+color+". Now we also have pink and black!");
    }
    public void newPhrase(){
        System.out.println("The look of the phrase '"+phrase+"' was changed to '"+phrase.toUpperCase()+"'!");
    }
}
