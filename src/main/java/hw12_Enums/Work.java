package hw12_Enums;

public class Work {
    public static void main(String[] args) {
        FruitIngregients[] fruitIngregients= {FruitIngregients.APPLE,FruitIngregients.BANANA};
        OtherIngredients[] otherIngredients={OtherIngredients.PEANUT_BUTTER,OtherIngredients.WALNUTS};
        Drink monkeyBuzz = new Drink(KindOf.SMOOTHIE,"Monkey Buzz",fruitIngregients,otherIngredients);
        System.out.println("Hi!I'd like to order a "+monkeyBuzz.order()+" Thank you!");

        System.out.println("-----------------------------");

        FruitIngregients[]fruitIngregients1={FruitIngregients.BLUEBERRY,FruitIngregients.PINEAPPLE,FruitIngregients.SPINACH};
        OtherIngredients[]otherIngredients1={OtherIngredients.ICE_CREAM,OtherIngredients.MILK,OtherIngredients.HONEY};
        Drink weirdShake = new Drink(KindOf.MILKSHAKE,"Weird Shake",fruitIngregients1,otherIngredients1);
        System.out.println("Hi!I'd like to order a "+weirdShake.order()+" Thank you!");

        System.out.println("-----------------------------");

        OtherIngredients[] otherIngredients2={OtherIngredients.CHOCOLATE,OtherIngredients.MINT_SYRUP,OtherIngredients.SUGAR};
        Coffee superSweet = new Coffee("Superior Sweetness",TypesOfCoffee.MOCHA,otherIngredients2);
        System.out.println("May I have a "+superSweet.order()+" Thank you!");
    }
}
