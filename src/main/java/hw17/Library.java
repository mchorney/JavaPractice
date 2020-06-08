package hw17;

public class Library {
    private String library;
    private int row;

    public Library(String library, int raw) {
        this.library = library;
        this.row = raw;
    }

    public String getLibrary() {
        return library;
    }

    public void setLibrary(String library) {
        this.library = library;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    void printInfo (){
        System.out.println("Library is "+ library + " Row number is " + row);
    }

    @Override
    public String toString() {
        return "Library{" +
                "library='" + library + '\'' +
                ", row=" + row +
                '}';
    }
}
