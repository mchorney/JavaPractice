package hwLesson15;

public class Food implements Product {
    private String product_name;
    private boolean frozen_food;
    private int high;
    private int width;
    private int pound;
    private DeliveryType deliveryType;

    public Food(String product_name, boolean frozen_food, int high, int width, int pound,DeliveryType deliveryType) {
        this.product_name = product_name;
        this.frozen_food = frozen_food;
        this.high = high;
        this.width = width;
        this.pound = pound;
        this.deliveryType = deliveryType;
    }
    @Override
    public void dimensions(){
        System.out.println("Dimensions of the product are :" + this.high +" X "+this.width);
    }
    @Override
    public void typeOfDelivery(int pound){

        if  (pound< 10)
            System.out.println("YOUR PACKAGE WILL BE DELIVERED in 2 hours");
        else System.out.println("Your PACKAGE WILL BE DELIVERED in 24 hours");
    }
    @Override
    public void printDetails(){
        System.out.println("The Product is "+ product_name+ " That will fit   "+ high+ "X" + width +"Box, it's weight is "+ pound+" pounds and Delivery type will be "  + deliveryType);}
}
