import java.util.Scanner;

public class CarTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a new Car using the default constructor
        Car defaultCar = new Car();
        System.out.println("\nDefault Car:\n" + defaultCar + "\n");

        // Get user input to create a new Car
        System.out.println("Enter New User's Car details:");
        System.out.print("ID: ");
        String id = scanner.nextLine();

        System.out.print("Mileage: ");
        int mileage = scanner.nextInt();

        System.out.print("MPG: ");
        int mpg = scanner.nextInt();

        System.out.print("Cost: ");
        double cost = scanner.nextDouble();

        System.out.print("Sales Price: ");
        double salesPrice = scanner.nextDouble();

        // Creates and prints a new Car with user input
        Car userCar = new Car(id, mileage, mpg, cost, salesPrice);
        System.out.println("\nUser's Car:\n" + userCar);

        // Ask the user if they want to sell the car
        System.out.print("\nDo you want to sell the car? (yes/no): ");
        scanner.nextLine();
        String sellChoice = scanner.nextLine().toLowerCase();

        if (sellChoice.equals("yes")) {
            System.out.print("Enter the selling price: ");
            double sellingPrice = scanner.nextDouble();

            // Sell the car print statements
            userCar.sellCar(sellingPrice);
            System.out.println("\nSold User's Car:\n" + userCar);
        } else {
            System.out.println("\nUser chose not to sell the car.");
        }

        // Close the scanner
        scanner.close();
    }
}
