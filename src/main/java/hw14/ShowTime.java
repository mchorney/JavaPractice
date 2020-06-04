package hw14;

public class ShowTime {
    protected String animeName;
    protected boolean kidType;
    protected Brand brand;
    protected int timeOfShow;

    public ShowTime(String animeName, boolean kidType, Brand brand, int timeOfShow) {
        this.animeName = animeName;
        this.kidType = kidType;
        this.brand = brand;
        this.timeOfShow = timeOfShow;
    }

    public String getAnimeName() {
        return animeName;
    }

    public void setAnimeName(String animeName) {
        this.animeName = animeName;
    }

    public boolean isKidType() {
        return kidType;
    }

    public void setKidType(boolean kidType) {
        this.kidType = kidType;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getTimeOfShow() {
        return timeOfShow;
    }

    public void setTimeOfShow(int timeOfShow) {
        this.timeOfShow = timeOfShow;
    }

    public void prinOut(){
        System.out.println("anime name "+animeName+" what type "+kidType+" company "+brand+" time show starts "+timeOfShow);
    }
}
