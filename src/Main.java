/*
SOURCES USED
https://stackoverflow.com/questions/8825209/rounding-decimal-points
https://stackoverflow.com/questions/4455873/java-arraylist-to-store-user-input
https://www.developer.com/java/print-java-array/
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double costTotal;
        ArrayList<String> menuItem = new ArrayList<String>(); // creates array for storing menu items

        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group: ");
        int peopleAmount = scan.nextInt();
        System.out.print("What's the tip percentage? (0-100): ");
        int tipPercent = scan.nextInt();

        System.out.print("Enter a cost in dollars and cents (-1 to end): ");
        double cost = scan.nextDouble();
        costTotal = cost + 1;

        System.out.print("Enter a menu item: ");
        menuItem.add(scan.next());


        while (cost != -1) {

            System.out.print("Enter a cost in dollars and cents (-1 to end): ");
            cost = scan.nextDouble();
            costTotal = costTotal + cost;

            if (cost != -1) { // makes sure the code does not ask for an item if price is entered as -1 (to end)
                System.out.print("Enter a menu item: ");
                menuItem.add(scan.next());
            }

        }
        double totalTip = (Math.round((costTotal * (tipPercent / 100.00)) * 100.0) / 100.0);
        double finalCost = costTotal + totalTip;

        System.out.println("Total bill before tip: $" + costTotal);
        System.out.println("Total percentage: " + tipPercent + "%");
        System.out.println("Total tip: $" + totalTip);
        System.out.println("Total bill with tip: $" + finalCost);
        System.out.println("Per person cost before tip: $" + (Math.round((costTotal / peopleAmount) * 100.0) / 100.0));
        System.out.println("Tip per person: $" + (Math.round((totalTip / peopleAmount) * 100.0) / 100.0));
        System.out.println("Total cost per person: $" + (Math.round((finalCost / peopleAmount) * 100.0) / 100.0));


        System.out.println("Items ordered: "); // prints all menu items ordered from the array list
        for(String i : menuItem){
            System.out.println(i);
        }
    }
}