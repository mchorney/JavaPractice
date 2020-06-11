package hw20;

public interface Life {
    void toExist();

    default void beAware() {
        System.out.println("Be fruitful and multiply.");
    }

    static void beAccountable() {
        System.out.println("Consume!");
    }
}
