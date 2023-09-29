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

        // variables declared

        double costTotal;
        double totalTip;
        double finalCost;
        int peopleAmount;
        int tipPercent;
        double cost;

        int x = 1;
        ArrayList<String> menuItem = new ArrayList<String>(); // creates array for storing menu items

        System.out.println("Welcome to the tip calculator!");

        while (x != -1) { // while loop gives the ability to calculate multiple situations

            menuItem.clear(); // clears list of items from previous order

            System.out.print("How many people are in your group: ");
            peopleAmount = scan.nextInt();
            System.out.print("What's the tip percentage? (0-100): ");
            tipPercent = scan.nextInt();

            System.out.println();

            System.out.print("Enter a cost in dollars and cents (-1 to end): ");
            cost = scan.nextDouble();
            scan.nextLine();
            costTotal = cost + 1; // +1 to not count -1 to quit

            System.out.print("Enter a menu item: ");
            menuItem.add(scan.nextLine());

            System.out.print("Enter a cost in dollars and cents (-1 to end): ");
            cost = scan.nextDouble();
            costTotal = costTotal + cost;


            while (cost != -1) { // while loop to give the ability to add multiple items

                System.out.print("Enter a menu item: ");
                menuItem.add(scan.next());
                scan.nextLine();

                System.out.print("Enter a cost in dollars and cents (-1 to end): ");
                cost = scan.nextDouble();
                costTotal = costTotal + cost;

            }

            // main calculations for receipt in order to make it easier to read

            totalTip = (Math.round((costTotal * (tipPercent / 100.00)) * 100.0) / 100.0);
            finalCost = costTotal + totalTip;

            // final receipt

            System.out.println();

            System.out.println("Total bill before tip: $" + costTotal);
            System.out.println("Total percentage: " + tipPercent + "%");
            System.out.println("Total tip: $" + totalTip);
            System.out.println("Total bill with tip: $" + finalCost);
            System.out.println("Per person cost before tip: $" + (Math.round((costTotal / peopleAmount) * 100.0) / 100.0));
            System.out.println("Tip per person: $" + (Math.round((totalTip / peopleAmount) * 100.0) / 100.0));
            System.out.println("Total cost per person: $" + (Math.round((finalCost / peopleAmount) * 100.0) / 100.0));

            System.out.println();

            System.out.println("Items ordered: "); // prints all menu items ordered from the array list
            for (String i: menuItem) {
                System.out.println(i);
            }

            System.out.println();
            System.out.print("Enter any integer to perform another calculation, -1 to quit: ");
            x = scan.nextInt();
            System.out.println();
        }
    }
}