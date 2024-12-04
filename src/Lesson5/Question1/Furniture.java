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

    @Override
    public double getProductPrice() {
        return productPrice + shippingCost;
    }

    @Override
    public String toString() {
        return "Product Details:\n" +
                "Product Name: " + super.getProductName() + "\n" +
                "Product Price: $" + getProductPrice() + "\n" +
                "Material: " + getMaterial()  +
                "Shipping Cost: $ "  + getShippingCost() + "\n";

    }


}
