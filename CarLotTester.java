import java.util.ArrayList;

public class CarLotTester {
    public static void main(String[] args) {
        // creates a new car lot
        CarLot carlot = new CarLot();
        
        // Adds cars to the car lot
        carlot.addCar("Hyundai Elantra", 56000, 45, 13500.50, 0.0);
        carlot.addCar("Porsche Cayenne", 200, 25, 45000.00, 0.0);
        carlot.addCar("VW Beater", 200500, 10, 0.0, 0.0);

       // Prints car lot
       System.out.println("Car Inventory:");
       ArrayList<Car> inventory = carlot.getInventory();
       
       for (Car car : inventory) {
           System.out.println("ID: " + car.getId() +
                              ", Mileage: " + car.getMileage() +
                              ", MPG: " + car.getMpg() +
                              ", Cost: " + car.getCost() +
                              ", Sales Price: " + car.getSalesPrice());

        System.out.println();
       }

        // Testing Accessors
        Car car1 = carlot.findCarByIdentifier​("Hyundai Elantra");
        Car car2 = carlot.findCarByIdentifier​("Porsche Cayenne");
        Car car3 = carlot.findCarByIdentifier​("VW Beater");

        if (car1 != null) {
            System.out.println("Hyundai Elantra found");
        } else {
            System.out.println("Hyundai Elantra not found");
        }

        if (car2 != null) {
            System.out.println("Porsche Cayenne found");
        } else {
            System.out.println("Porsche Cayenne not found");
        }

        if (car3 != null) {
            System.out.println("VW Beater found");
        } else {
            System.out.println("VW Beater not found");
        }

        System.out.println("The cars in order of entry are: " + carlot.getCarsInOrderOfEntry() + "\n");

        System.out.println("The average MPG on the lot is: " + String.format("%.2f", carlot.getAverageMPG()) + "\n");

        System.out.println("The cars sorted by MPG are: " + carlot.getCarsSortedByMPG() + "\n");

        System.out.println("The car with the best MPG is: " + carlot.getCarWithBestMPG() + "\n");

        System.out.println("The cars sorted by MPG are: " + carlot.getCarsSortedByMPG() + "\n");

        System.out.println("The car with the highest mileage is: " + carlot.getCarWithHighestMileage() + "\n");

        //Sell car(s)
        carlot.sellCar("Hyundai Elantra", 20800.75);
        System.out.println("The Hyundai Elantra has been sold for: $20800.75");
        carlot.sellCar("Porsche Cayenne", 75000.98);
        System.out.println("The Porsche Cayenne has been sold for: $75000.98");
        carlot.sellCar("VW Beater", 500.00);
        System.out.println("The VW Beater has been sold for: $500.00");

        System.out.println();
        System.out.println("The inventory is now: " + carlot.getInventory());

        System.out.println();
        System.out.println("The profit is now: $" + String.format("%.2f", carlot.getTotalProfit()));

    }
}
