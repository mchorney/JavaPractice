package homework11;


public class Bikes {
    private String maker;
    private String model;
    private String[] color;
    private int year;

    public Bikes(){}

    public Bikes (String maker, String model, String[] color, int year) {
        this.maker = maker;
        this.model = model;
        this.color = color;
        this.year= year;
    }
//    public Bikes (String mak,String mod, int year) {
//
//        this.mod = model;
//    }
//    }
        public String getmodel() { return model;}
        public String getmaker() { return maker;};
        public String[] getColor() {return color;};


    public void setYear(int year) {
        if (this.year>2020) year=2020;
        this.year = year;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public void setColor(String[] color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void printClass() {
        System.out.println("Hi we have " + maker+" "+model+" "+year);

        for (String ss:color) {
            System.out.println("possible colors "+ss);
        }

    }
}
