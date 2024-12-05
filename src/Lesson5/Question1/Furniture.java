package Lesson5.Question1;

public class Furniture extends Product {

    private String material;
    private double shippingCost;

    Furniture(String productName, double productPrice, double shippingCost, String material) {
        super(productName, productPrice);
        this.shippingCost = shippingCost;
        this.material = material;
    }

    String getMaterial() {
        return material;
    }

    double getShippingCost() {
        return shippingCost;
    }

    void setMaterial(String material) {
        this.material = material;
    }

    void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    @Override
    public double getProductPrice() {
        return productPrice + shippingCost;
    }

    @Override
    public String toString() {
        return "[" + getProductName() + ", $" + getProductPrice() + ", " + "Material: " + material + ", Shipping Cost: $" + shippingCost + "]";
    }


}
