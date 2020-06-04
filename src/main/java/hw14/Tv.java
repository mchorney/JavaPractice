package hw14;

public class Tv extends ShowTime{
    protected String tv_show;

    public Tv(String animeName, boolean kidType, Brand brand, int timeOfShow, String tv_show) {
        super(animeName, kidType, brand, timeOfShow);
        this.tv_show = tv_show;
    }

    public String getTv_show() {
        return tv_show;
    }

    public void setTv_show(String tv_show) {
        this.tv_show = tv_show;
    }

    public void printOut(){
        System.out.println(" this is tv show");
    }
}
