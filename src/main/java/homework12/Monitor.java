package homework12;

public class Monitor {
    private String maker;
    private int screenSize;
    private String screenResolution;

    public Monitor(String maker, int screenSize, String screenResolution) {
        this.maker = maker;
        this.screenSize = screenSize;
        this.screenResolution = screenResolution;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    public void printInfo() {
        System.out.println("Monitor{" +
                "maker='" + maker + '\'' +
                ", screenSize=" + screenSize +
                ", screenResolution='" + screenResolution + '\'' +
                '}');
    }
}
