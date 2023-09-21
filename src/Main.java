import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double costTotal;

        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group: ");
        int peopleAmount = scan.nextInt();
        System.out.print("What's the tip percentage? (0-100): ");
        int tipPercent = scan.nextInt();

        System.out.print("Enter a cost in dollars and cents (-1 to end): ");
        double cost = scan.nextDouble();
        costTotal = cost + 1;

        while (cost != -1) {

            System.out.print("Enter a cost in dollars and cents (-1 to end): ");
            cost = scan.nextDouble();
            costTotal = costTotal + cost;

        }

        double totalTip = costTotal * (tipPercent / 100.00);
        double finalCost = costTotal - totalTip;

        System.out.println("Total bill before tip: $" + costTotal);
        System.out.println("Total percentage: " + tipPercent + "%");
        System.out.println("Total tip: $" + totalTip);
        System.out.println("Total bill with tip: $" + finalCost);
        System.out.println("Per person cost before tip: $" + (costTotal / peopleAmount));
        System.out.println("Tip per person: $" + (totalTip / peopleAmount));
        System.out.println("Total cost per person: $" + (finalCost / peopleAmount));

    }
}