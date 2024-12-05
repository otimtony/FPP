package Lesson5.Question1;

public class Clothing extends Product {


    private String brand;
    private double discountPercentage;

    Clothing(String productName, double productPrice, double discountPercentage, String brand) {
        super(productName, productPrice);
        this.discountPercentage = discountPercentage;
        this.brand = brand;
    }

    String getBrand() {
        return brand;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    double getDiscountPercentage() {
        return discountPercentage;
    }

    void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }


    @Override
    public double getProductPrice() {
        return productPrice - productPrice * (discountPercentage / 100);
    }

    @Override
    public String toString() {
        return "Product Details:\n" +
                "Product Name: " + super.getProductName() + "\n" +
                "Product Price: $" + getProductPrice() + "\n" +
                "Brand: " + getBrand()  +  "\n" +
                "Discount Percentage: " + getDiscountPercentage() + "%" +"\n";

    }
}
