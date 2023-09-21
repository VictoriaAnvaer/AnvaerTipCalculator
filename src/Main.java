import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double costTotal;

        System.out.println("Welcome to the tip calculator!");
        System.out.print("What's the tip percentage? (0-100): ");
        int tipPercent = scan.nextInt();
        System.out.println();

        System.out.print("Enter a cost in dollars and cents (-1 to end): ");
        double cost = scan.nextDouble();
        costTotal = cost + 1;

        while (cost != -1) {

            System.out.print("Enter a cost in dollars and cents (-1 to end): ");
            cost = scan.nextDouble();
            costTotal = costTotal + cost;

        }

        System.out.println(costTotal);
    }
}