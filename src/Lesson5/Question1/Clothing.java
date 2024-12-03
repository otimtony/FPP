package Lesson5.Question1;

public class Clothing extends Product{


    String brand;
    double discountPercentage;
    Clothing(String productName, double productPrice, double discountPercentage, String brand){
        super(productName, productPrice);
        this.discountPercentage = discountPercentage;
        this.brand = brand;
    }

    @Override
    public double getProductPrice() {
        return productPrice - productPrice * (discountPercentage / 100);
    }
}
