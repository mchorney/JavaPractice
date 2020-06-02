package hwk12;

public enum DogBreed {
    POODLE("Betsie"),
    GOLDEN_RETRIEVER("Lori"),
    GOLDEN_DOODLE("Winnie"),
    MALTEESE("Stacy"),
    MALTIE_POO("Tracy"),
    POMERANIAN("Trixie"),
    BULLDOG("Jessica");

    private String name;
    DogBreed(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

}
