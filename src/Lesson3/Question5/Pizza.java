package Lesson3.Question5;

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