package hwLesson16;

public class Mercedes {
    private String modelNAme;
    private String engine;
    private  int numOfcelinders;

    public Mercedes(String modelNAme, String engine, int numOfcelinders) {
        this.modelNAme = modelNAme;
        this.engine = engine;
        this.numOfcelinders = numOfcelinders;
    }

    public String getModelNAme() {
        return modelNAme;
    }

    public void setModelNAme(String modelNAme) {
        this.modelNAme = modelNAme;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getNumOfTurbins() {
        return numOfcelinders;
    }

    public void setnumOfcelinders(int numOfcelinders) {
        this.numOfcelinders = numOfcelinders;
    }

    public void printOut() {
        System.out.println("Mercedes{" +
                "modelNAme='" + modelNAme + '\'' +
                ", engine='" + engine + '\'' +
                ", numOfcelinders=" + numOfcelinders +
                '}');
    }

//    public String printME() {
//        return "Mercedes{" +
//                "modelNAme='" + modelNAme + '\'' +
//                ", engine='" + engine + '\'' +
//                ", numOfcelinders=" + numOfcelinders +
//                '}';
//    }
}