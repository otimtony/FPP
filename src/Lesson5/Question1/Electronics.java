package Lesson5.Question1;

public class Electronics extends Product {

    String warranty;
    double WarrantyCost;

    Electronics(String productName, double productPrice, double warrantyCost, String warranty) {
        super(productName, productPrice);
        this.WarrantyCost = warrantyCost;
        this.warranty = warranty;
    }

    @Override
    public double getProductPrice() {
        return productPrice + WarrantyCost;
    }
}
