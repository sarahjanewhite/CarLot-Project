import java.util.*;

/**
* CarLotMain is the main user interface class for the
* CarLot application. It reads input and performs
* output to the Console for all features in the
* application by using an instance of CarLot
* 
*/

public class CarLotMain extends java.lang.Object {

    /**
     * 
     * Starting point for the CarLot application
     * 
     * @param args Not used
     */
    public static void main(String[] args) {
        CarLotMain carLotMain = new CarLotMain();
        carLotMain.run();
    }

    private CarLot carLot;
    private Scanner scanner;

    /**
     * Constructor to initialize CarLot and Scanner.
     */
    public CarLotMain() {
        carLot = new CarLot();
        scanner = new Scanner(System.in);
    }

    /**
     * Main method to run the CarLot application.
     */
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
                case 9:
                    carLot.saveToDisk();
                    System.out.println("Inventory saved to disk.");
                    break;
                case 10:
                    carLot.loadFromDisk();
                    System.out.println("Inventory loaded from disk.");
                    break;
            }
        } while (choice != 0);
    }

    /**
     * Prints menu options to the console.
     */
    private void printMenu() {
        System.out.println("\n[0] to exit");
        System.out.println("[1] Add a car to inventory");
        System.out.println("[2] Sell a car from inventory");
        System.out.println("[3] List inventory by order of acquisition");
        System.out.println("[4] List inventory from best MPG to worst MPG ");
        System.out.println("[5] Display car with best MPG");
        System.out.println("[6] Display car with highest mileage");
        System.out.println("[7] Display overall MPG for the entire inventory");
        System.out.println("[8] Display profit for all sold cars");
        System.out.println("[9] Save to Disk");
        System.out.println("[10] Load from Disk");
        System.out.println("Enter a number from 0 to 10: \n");
    }

    /**
     * Gets the users choice from the menu
     * 
     * @return the user's choice
     */
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

    /**
     * Adds a user-specified car to the inventory.
     */
    private void addCarToInventory() {
        System.out.print("Enter car identifier: ");
        String id = scanner.next();
        scanner.nextLine(); 
    
        System.out.print("Enter car mileage: ");
        int mileage = scanner.nextInt();
        scanner.nextLine(); 
    
        System.out.print("Enter car MPG: ");
        int mpg = scanner.nextInt();
        scanner.nextLine(); 
    
        System.out.print("Enter car cost: ");
        double cost = scanner.nextDouble();
        scanner.nextLine(); 
    
        System.out.print("Enter car sales price: ");
        double salesPrice = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter NHTSA rating (1-5 stars): ");
        int nhtsaRating = scanner.nextInt();
        scanner.nextLine();

        carLot.addCar(id, mileage, mpg, cost, salesPrice, nhtsaRating);
        System.out.println("Car added to inventory.");
    }

    /**
     * Sells a specified car from the inventory.
     */
    private void sellCarFromInventory() {
        System.out.print("Enter car to sell: ");
        String id = scanner.next();
        scanner.nextLine();
    
        System.out.print("Enter the price for the car: ");
        double priceSold = Double.parseDouble(scanner.nextLine());
    
        carLot.sellCar(id, priceSold);
        System.out.println("Car sold!");
    }
    

    /**
     * Displays the inventory by order of acquisition.
     */
    private void listInventoryByAcquisitionOrder() {
        ArrayList<Car> inventory = carLot.getCarsInOrderOfEntry();
        System.out.println("Cars Listed by Acquisition: ");
        for (Car car : inventory) {
            System.out.println(car);
        }
    }

    /**
     * Displays the inventory from best to worst MPG.
     */
    private void listInventoryByMPG() {
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

    /**
     * Displays the car with the best MPG in the inventory.
     */
    private void displayCarWithBestMPG() {
        Car CarWithBestMPG = carLot.getCarWithBestMPG();
        if (CarWithBestMPG != null) {
            System.out.println("Car with the best MPG: \n" + CarWithBestMPG);
        } else {
            System.out.println("No cars in inventory");
        }

    }

    /**
     * Displays the car with the highest mileage in the inventory.
     */
    private void displayCarWithHighestMileage() {
        Car highestMileageCar = carLot.getCarWithHighestMileage();
        if (highestMileageCar != null) {
            System.out.println("Car with the highest mileage: \n" + highestMileageCar);
        } else {
            System.out.println("No cars in inventory");
        }
    }

    /**
     * Displays the average MPG for all cars in inventory.
     */
    private void displayAverageMPG() {
        double averageMPG = carLot.getAverageMPG();
        System.out.println("Average MPG for all cars in inventory: " + averageMPG);
    }

    /**
    * Displays the total profit for all sold cars.
    */
    private void displayTotalProfit() {
        double totalProfit = carLot.getTotalProfit();
        System.out.println("Total profit for all sold cars: $" + totalProfit);
    }

}