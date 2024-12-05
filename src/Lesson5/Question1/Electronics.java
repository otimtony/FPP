package Lesson5.Question1;

public class Electronics extends Product {

    private String warranty;
    private double WarrantyCost;

    Electronics(String productName, double productPrice, double warrantyCost, String warranty) {
        super(productName, productPrice);
        this.WarrantyCost = warrantyCost;
        this.warranty = warranty;
    }

    String getWarranty() {
        return warranty;
    }

    double getWarrantyCost() {
        return WarrantyCost;
    }

    void setWarranty(String warranty) {
        this.warranty = warranty;
    }
    void setWarrantyCost(double warrantyCost) {
        this.WarrantyCost = warrantyCost;
    }

    @Override
    public double getProductPrice() {
        return productPrice + WarrantyCost;
    }

    @Override
    public String toString() {
        return "Product Details:\n" +
                "Product Name: " + super.getProductName() + "\n" +
                "Product Price: $" + getProductPrice() + "\n" +
                "Warranty: " + getWarranty()  + "\n" +
                "Warranty Const: $" + getWarrantyCost() + "\n";

    }
}
