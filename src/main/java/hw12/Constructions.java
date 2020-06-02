package hw12;

public class Constructions {
    private String name;
    private int efforts;
    private LandScape landScape;

    public Constructions(String name, int efforts, LandScape landScape) {
        this.name = name;
        this.efforts = efforts;
        this.landScape = landScape;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEfforts() {
        return efforts;
    }

    public void setEfforts(int efforts) {
        this.efforts = efforts;
    }

    public LandScape getLandScape() {
        return landScape;
    }

    public void setLandScape(LandScape landScape) {
        this.landScape = landScape;
    }

    @Override
    public String toString() {
        return "Constructions {" +
                "Name = '" + name + '\'' +
                ", Efforts = " + efforts + '\'' +
                ", Landscape = " + landScape +
                '}';
    }
}
