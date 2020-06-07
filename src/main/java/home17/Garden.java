package home17;

public class Garden {
    private String type;
    private int count;

    public Garden() {
    }

    public Garden(String type, int aria) {
        this.type = type;
        this.count = aria;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCount() {
        return count;
    }


    public void setCount(int count) {
        this.count = count;
    }
    @Override
    public String toString() {
        return "Garden{" +
                "type='" + type + '\'' +
                ", count=" + count +
                '}';
    }
}
