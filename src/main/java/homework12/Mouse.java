package homework12;

public class Mouse {
    private String type;
    private String maker;

    public Mouse(String type, String maker) {
        this.type = type;
        this.maker = maker;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public void printInfo() {
        System.out.println("Mouse{" +
                "type='" + type + '\'' +
                ", maker='" + maker + '\'' +
                '}');
    }
}
