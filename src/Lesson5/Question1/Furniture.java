package Lesson5.Question1;

public class Furniture extends Product {

    String material;
    double shippingCost;

    Furniture(String productName, double productPrice, double shippingCost, String material) {
        super(productName, productPrice);
        this.shippingCost = shippingCost;
        this.material = material;
    }

    @Override
    public double getProductPrice() {
        return productPrice + shippingCost;
    }


}
