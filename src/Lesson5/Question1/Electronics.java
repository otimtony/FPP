package Lesson5.Question1;

public class Electronics extends Product {

    private String warranty;
    private double warrantyCost;

    Electronics(String productName, double productPrice, double warrantyCost, String warranty) {
        super(productName, productPrice);
        this.warrantyCost = warrantyCost;
        this.warranty = warranty;
    }

    String getWarranty() {
        return warranty;
    }

    double getWarrantyCost() {
        return warrantyCost;
    }

    void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    void setWarrantyCost(double warrantyCost) {
        this.warrantyCost = warrantyCost;
    }

    @Override
    public double getProductPrice() {
        return productPrice + warrantyCost;
    }

    @Override
    public String toString() {
        return "[" + getProductName() + ", $" + getProductPrice() + ", " + "Warranty: " + getWarranty() + ", Warranty Cost: $" + getWarrantyCost() + "]";
    }
}
