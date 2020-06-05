package hwk15;

public enum GrapeType {
    ISABELLA("home made Fragolio"),
    LADYFINGERS("Calmeria"),
    MOONDROPS("delicious grape juice"),
    PINOTNOIR("Pinot Noir"),
    COTTONCANDY("Schiava"),
    RIESLING("Riesling"),
    MERLOT("Merlot");

    public String wineName;

    GrapeType(String wineName){
        this.wineName=wineName;
    }

}
