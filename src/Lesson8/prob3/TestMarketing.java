package Lesson8.prob3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestMarketing {

    public static void main(String[] args) {

        List<Marketing> marketingList = new ArrayList<>();

        //Add five objects to ArrayList
        marketingList.add(new Marketing("Tony", "Electronics", 12.50));
        marketingList.add(new Marketing("Otim", "Cards", 50.00));
        marketingList.add(new Marketing("Sushil", "Kettle", 15.5));
        marketingList.add(new Marketing("Karki", "Phone", 8.30));
        marketingList.add(new Marketing("Akira", "Laptop", 50.10));

        //Deleting an object by passing instance object
        Marketing toDelete = new Marketing("Sushil", "Kettle", 15.5);
        marketingList.remove(toDelete);

        //Print the size of list
        System.out.println("Size of marketing list: " + marketingList.size());

        //Retrieving object by its position
        Marketing retrieved = marketingList.get(3);
        System.out.println("Retrieved Marketing: " + retrieved);

        //Update details of a Marketing object by passing its position
        marketingList.set(1, new Marketing("Brian", "Mouse", 6.23));

        //Sort the list in natural order for the field sales amount using Comparator interface
        marketingList.sort(Comparator.comparing(Marketing::getSalesamount));
        System.out.println("List sorted by sales amount: " + marketingList);

        //Retrieve the list of employees with more than $1000 sales and sort them by employeename
        List<Marketing> highSalesList = new ArrayList<>();
        for (Marketing m : marketingList) {
            if (m.getSalesamount() > 1000.0) {
                highSalesList.add(m);
            }
        }
        highSalesList.sort(Comparator.comparing(Marketing::getEmployeename));
        System.out.println("Employees with more than $1000 sales sorted by name: " + highSalesList);

    }
}
