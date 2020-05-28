package hw10;

public class Weather {
    public String sky;
    public String color;
    public double time;
    public double dayTemperature;
    public double nightTemperature;

    public void today(){
        System.out.println("Now is "+time+"."+" We can see "+sky+", "+color+" sky."+ " The temperature is "+ dayTemperature+".");
    }
    public void averageTemp(){
        double averageTemp= (dayTemperature+nightTemperature)/2;
        System.out.println("The average temperature for today is "+ averageTemp+".");
    }
}
