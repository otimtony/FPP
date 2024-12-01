package Lesson3.Question5;


public class Prog5 {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza(PizzaSize.SMALL, PizzaType.VEGGIE,2);
        Pizza pizza2 = new Pizza(PizzaSize.MEDIUM, PizzaType.PEPPERONI,1);
        Pizza pizza3 = new Pizza(PizzaSize.LARGE, PizzaType.BBQCHICKEN,2);
        System.out.println(pizza1.printOrderSummary());
        System.out.println(pizza2.printOrderSummary());
        System.out.println(pizza3.printOrderSummary());
    }
}

enum PizzaSize {
    SMALL, MEDIUM, LARGE
}

enum PizzaType {
    VEGGIE, PEPPERONI, CHEESE, BBQCHICKEN
}

class Pizza {
    private PizzaSize size;
    private PizzaType type;
    private int quantity;
    private double price;
    private double tax;


    Pizza(PizzaSize size, PizzaType type, int quantity) {
        this.size = size;
        this.type = type;
        this.quantity = quantity;
        this.calculatePrice();
    }

    private void calculatePrice() {

        double typePrice = switch (type) {
            case CHEESE -> 1.5;
            case PEPPERONI, BBQCHICKEN -> 2;
            case VEGGIE -> 1;

        };

        double sizePrice = switch (size) {
            case SMALL -> 8;
            case MEDIUM -> 10;
            case LARGE -> 12;

        };

        this.price = (typePrice + sizePrice) * quantity;

        this.tax = this.price * 0.03;


    }




    public String printOrderSummary() {


        return String.format(
                 "Pizza Order:%n" +
                 "Size: %s%n" +
                 "Qty: %d%n" +
                 "Type: %s%n" +
                  "Price: $%.2f%n" +
                 "Tax: $%.2f%n" +
                 "Total Price: $%.2f",
                this.size,
                this.quantity,
                this.type,
                this.price,
                this.tax,
                this.price + this.tax
        );
    }
}