package Lesson5.Question1;

public class TestClass {

    public static void main(String[] args) {
        Product cloth1 = new Clothing("shirt", 20, 3, "xyz");
        Product cloth2 = new Clothing("Jacket", 100, 5, "ABC");
        Product electronics1 = new Electronics("TV", 200, 10, "Lifetime warranty");
        Product fur1 = new Furniture("Bed", 400, 35, "Wood");
        Product Electronics2 = new Electronics("Monitor", 150, 5, "Express Warranty");

        Product[] productArr = {cloth1, cloth2, electronics1, fur1, Electronics2};
        System.out.println(sumProducts(productArr));

        for (Product product : productArr) {
            System.out.println(product.toString());
        }
    }


    public static double sumProducts(Product[] col) {
        double sum = 0;

        for (Product x: col){
            switch (x) {
                case Clothing clothing -> sum = sum + clothing.getProductPrice();
                case Furniture furniture -> sum = sum + furniture.getProductPrice();
                case Electronics electronics -> sum = sum + electronics.getProductPrice();
                case Product product -> sum = sum + product.getProductPrice();
            }
        }

        return sum;
    }
}
