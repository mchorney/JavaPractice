package home17;

public class Threes {
    private String kind;
    private int size;

    public Threes() {
    }

    public Threes(String kind, int size) {
        this.kind = kind;
        this.size = size;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Threes{" +
                "kind='" + kind + '\'' +
                ", size=" + size +
                '}';
    }
}
