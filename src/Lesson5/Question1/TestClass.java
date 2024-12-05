package Lesson5.Question1;

public class TestClass {

    public static void main(String[] args) {
        Product cloth1 = new Clothing("shirt", 20, 3, "xyz");
        Product cloth2 = new Clothing("Jacket", 100, 5, "ABC");
        Product electronics1 = new Electronics("TV", 200, 10, "Lifetime warranty");
        Product fur1 = new Furniture("Bed", 400, 35, "Wood");
        Product Electronics2 = new Electronics("Monitor", 150, 5, "Express Warranty");


        Product[] productArr = {cloth1, cloth2, electronics1, fur1, Electronics2};

        //  sum of all the products
        System.out.println("Sum of the products is: " + sumProducts(productArr));

        // Loop through the objects and print the status of the objects
        for (Product product : productArr) {
            System.out.println(product.toString());
        }
    }


    public static double sumProducts(Product[] col) {
        double sum = 0;

        for (Product x : col) {
            sum += x.getProductPrice();
        }

        return sum;
    }
}
