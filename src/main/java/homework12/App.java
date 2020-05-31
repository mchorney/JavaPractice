package homework12;

public class App {
    public static void main(String[] args) {

        Flower gardenia = new Flower(FlowerName.GARDENIA, FlowerColor.WHITE, TypeOfFlowering.ANNUALS, "Outdoor Part Sun", "0° to 20°F");
        System.out.println(gardenia.printFlower());
        Flower azalea = new Flower(FlowerName.AZALEA, FlowerColor.PINK, TypeOfFlowering.ANNUALS, "Outdoor Sun", "20° to 30°F");
        System.out.println(azalea.printFlower());

        FlowerName[] flowerlist = {FlowerName.AZALEA, FlowerName.ACACIA, FlowerName.ASTER, FlowerName.FOXGLOVE, FlowerName.FREESIA, FlowerName.ABUTILON};
        FlowerName[] flowerlist1 = {FlowerName.HYDRANGEA, FlowerName.ACACIA, FlowerName.ASTER, FlowerName.FOXGLOVE, FlowerName.ACONITE, FlowerName.FOXGLOVE};

        FlowerShop SeattleFlowers = new FlowerShop("Seattle Flowers", "1501 1st Ave, Seattle, WA 98101", "(206) 728-2588", flowerlist);
        FlowerShop PikePlaceFlowers = new FlowerShop("Pike Place Flowers", "600 2nd Ave, Seattle, WA 98104", "(206) 682-9797", flowerlist1);

        System.out.println(SeattleFlowers.printFlowerShop());
        System.out.println(PikePlaceFlowers.printFlowerShop());
    }
}

