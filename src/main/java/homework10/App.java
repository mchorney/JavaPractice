package homework10;

import java.util.concurrent.Callable;

public class App {
    public static void main(String[]arg){
        Clothes dress = new Clothes();
        dress.type ="dress";
        dress.color="blue";
        dress.size=8;
        Clothes gloves=new Clothes();
        gloves.type="gloves";
        gloves.color="dark blue";
        dress.buy();
        gloves.buy();
        dress.overstretch();

        Flower rose=new Flower();
        rose.type="rose";
        rose.color="red";
        Flower tulip=new Flower();
        tulip.type="tulip";
        tulip.color="yellow";
        rose.water();
        tulip.water();
        rose.buy();
        tulip.buy();

        Pet dog=new Pet();
        dog.type="dog";
        dog.name="Bim";
        dog.breed="Poodle";
        Pet cat=new Pet();
        cat.breed= "Abyssinian";
        cat.name="Musya";
        cat.type="cat";
        dog.pet();
        dog.feed();
        cat.pet();
        cat.feed();

        Skincare cream=new Skincare();
        cream.brand="Mary Kay";
        cream.typeOfSkin="dry and oily";
        cream.purpose="agefighting";
        Skincare soap=new Skincare();
        soap.typeOfSkin="all";
        soap.brand="Nivea";
        soap.purpose="cleansing";
        cream.apply();
        soap.sell();

    }
}
