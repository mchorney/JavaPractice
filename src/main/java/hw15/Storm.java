package hw15;

public interface Storm {

    void beginning();
    void finishing();
    default void continued() {
        System.out.println("Perform action.");
    }

}
