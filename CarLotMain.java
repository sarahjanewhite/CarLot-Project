import java.util.*;

public class CarLotMain {
    public static void main(String[] args) {
        CarLotMain carLotMain = new CarLotMain();
        carLotMain.run();
    }

    private CarLot carLot;
    private Scanner scanner;

    public CarLotMain() {
        // Initialize CarLot and Scanner
        carLot = new CarLot();
        scanner = new Scanner(System.in);
    }

    public void run() {
        int choice;
        do {
            printMenu();
            choice = getChoice();

            switch (choice) {
                case 1:
                    addCarToInventory();
                    break;
                case 2:
                    sellCarFromInventory();
                    break;
                case 3:
                    listInventoryByAcquisitionOrder();
                    break;
                case 4:
                    listInventoryByMPG();
                    break;
                case 5:
                    displayCarWithBestMPG();
                    break;
                case 6:
                    displayCarWithHighestMileage();
                    break;
                case 7:
                    displayAverageMPG();
                    break;
                case 8:
                    displayTotalProfit();
                    break;
            }
        } while (choice != 0);
    }

    private void printMenu() {
        // Menu print goes here
        System.out.println("[0] to exit");
        System.out.println("[1] Add a car to inventory");
        System.out.println("[2] Sell a car from inventory");
        System.out.println("[3] List inventory by order of acquisition");
        System.out.println("[4] List inventory from best MPG to worst MPG ");
        System.out.println("[5] Display car with best MPG");
        System.out.println("[6] Display car with highest mileage");
        System.out.println("[7] Display overall MPG for the entire inventory");
        System.out.println("[8] Display profit for all sold cars");
        System.out.println("Enter a number from 0 to 8: ");
    }

    private int getChoice() {
        // Implement user input for the menu choice
        int choice;
        try {
            choice = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException i) {
            choice = -1;
        }
        return choice;
    }

    private void addCarToInventory() {
        // Implement adding a car to the inventory
        System.out.print("Enter car identifier: ");
        String id = scanner.next();
        System.out.print("Enter car mileage: ");
        int mileage = scanner.nextInt();
        System.out.print("Enter car MPG: ");
        int mpg = scanner.nextInt();
        System.out.print("Enter car cost: ");
        double cost = scanner.nextDouble();
        System.out.print("Enter car sales price: ");
        double salesPrice = scanner.nextDouble();

        carLot.addCar(id, mileage, mpg, cost, salesPrice);
        System.out.println("Car added to inventory.");
    }

    private void sellCarFromInventory() {
        // Implement selling a car from the inventory
        System.out.print("Enter car to sell: ");
        String id = scanner.nextLine();
        System.out.print("Enter the price for the car: ");
        double priceSold = Double.parseDouble(scanner.nextLine());

        carLot.sellCar(id, priceSold);
        System.out.println("Car sold!");
    }

    private void listInventoryByAcquisitionOrder() {
        // Implement listing inventory by order of acquisition
        ArrayList<Car> inventory = carLot.getCarsInOrderOfEntry();
        for (Car car : inventory) {
            System.out.println(car);
        }
    }

    private void listInventoryByMPG() {
        // Implement listing inventory by MPG
        ArrayList<Car> inventory = carLot.getCarsSortedByMPG();
        if (inventory != null) {
            System.out.println("Cars Sorted by MPG: ");
            for (Car car : inventory) {
                System.out.println(car);
            }
        } else {
            System.out.println("No cars in inventory");
        }

    }

    private void displayCarWithBestMPG() {
        Car CarWithBestMPG = carLot.getCarWithBestMPG();
        if (CarWithBestMPG != null) {
            System.out.println("Car with the best MPG: " + CarWithBestMPG);
        } else {
            System.out.println("No cars in inventory");
        }

    }

    private void displayCarWithHighestMileage() {
        // Implement displaying the car with the highest mileage
        Car highestMileageCar = carLot.getCarWithHighestMileage();
        if (highestMileageCar != null) {
            System.out.println("Car with the highest mileage: " + highestMileageCar);
        } else {
            System.out.println("No cars in inventory");
        }
    }

    private void displayAverageMPG() {
        // Implement displaying the average MPG for all cars in inventory
        double averageMPG = carLot.getAverageMPG();
        System.out.println("Average MPG for all cars in inventory: " + averageMPG);
    }

    private void displayTotalProfit() {
        // Implement displaying the total profit for all sold cars
        double totalProfit = carLot.getTotalProfit();
        System.out.println("Total profit for all sold cars: $" + totalProfit);
    }

}