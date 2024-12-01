package Lesson3.question1;

public class Main {

    public static void main(String[] args) {

        // Addresses
        Address address1 = new Address("1000 N 4th St", "Fairfield", "IA", "52557");
        Address address2 = new Address("Massachusetts Hall", "Cambridge", "MA", "02138");
        Address address3 = new Address("5801 S Ellis Ave", "Chicago", "IL", "60637");

        //Customers
        Customer customer1 = new Customer("Tony", "Otim", "256-703-9487");
        customer1.setBillingAddress(address1);
        customer1.setShippingAddress(address2);

        Customer customer2 = new Customer("Sushil", "Karki", "641-874-9821");
        customer2.setBillingAddress(address2);
        customer2.setShippingAddress(address3);

        Customer customer3 = new Customer("Akera", "Brian", "256-726-3390");
        customer3.setBillingAddress(address3);
        customer3.setShippingAddress(address1);

        // Add Customers to array
        Customer[] customers = {customer1, customer2, customer3};

        // Loop through customer whose billing address is chicago
        for (Customer customer : customers) {
            if (customer.getBillingAddress().getCity().equals("Chicago")) {
                System.out.println(customer);
            }
        }

    }
}
