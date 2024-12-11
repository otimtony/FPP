package Lesson5.Question1;

public class TestClass {

    public static void main(String[] args) {
        Product cloth1 = new Clothing("shirt", 20, 3, "xyz");
        Product cloth2 = new Clothing("Jacket", 100, 5, "ABC");
        Product electronics1 = new Electronics("TV", 200, 10, "12 Months");
        Product fur1 = new Furniture("Bed", 400, 35, "Wood");
        Product electronics2 = new Electronics("Monitor", 150, 5, "6 Months");


        Product[] productArr = {cloth1, cloth2, electronics1, fur1, electronics2};

        //  sum of all the products
        System.out.println("Sum of the products is: " + sumProducts(productArr));

        // Loop through the objects and print the status of the objects
        for (Product product : productArr) {
            if (product != null) {
                System.out.println(product.toString());
            } else {
                System.out.println("Null product encountered");
            }
        }
    }

    public static double sumProducts(Product[] col) {

        if (col == null || col.length == 0) {
            return 0.0;
        }

        double sum = 0;
        for (Product x : col) {
            if (x != null) {
                sum += x.getProductPrice();
            }
        }

        return sum;
    }
}
