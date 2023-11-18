public class CarTester {
    public static void main(String[] args) {
        // Instantiate at least 2 Car objects
        Car car1 = new Car("CAR001", 5000, 25, 15000.0, 20000.0, 1);
        Car car2 = new Car("CAR002", 7000, 20, 18000.0, 25000.0, 5);

        // Verify that both constructors work as specified
        Car defaultCar = new Car();
        System.out.println("Default Car:\n" + defaultCar + "\n");

        // Insure that the sellCar() method works properly
        car1.sellCar(22000.0);
        car2.sellCar(27000.0);

        // Print the Car objects after selling
        System.out.println("Car 1:\n" + car1);
        System.out.println("Car 2:\n" + car2);

        // Test each compare method individually
        int compareMpg = car1.compareMPG(car2);
        int compareMiles = car1.compareMileage(car2);
        int comparePrice = car1.comparePrice(car2);

        System.out.println("Compare MPG: " + compareMpg);
        System.out.println("Compare Miles: " + compareMiles);
        System.out.println("Compare Price: " + comparePrice);

        // Verify that each compare method returns expected values
        if (compareMpg < 0) {
            System.out.println("Car 1 has lower MPG than Car 2.");
        } else if (compareMpg > 0) {
            System.out.println("Car 1 has higher MPG than Car 2.");
        } else {
            System.out.println("Car 1 and Car 2 have the same MPG.");
        }

        if (compareMiles < 0) {
            System.out.println("Car 1 has fewer miles than Car 2.");
        } else if (compareMiles > 0) {
            System.out.println("Car 1 has more miles than Car 2.");
        } else {
            System.out.println("Car 1 and Car 2 have the same miles.");
        }

        if (comparePrice < 0) {
            System.out.println("Car 1 has a lower price than Car 2.");
        } else if (comparePrice > 0) {
            System.out.println("Car 1 has a higher price than Car 2.");
        } else {
            System.out.println("Car 1 and Car 2 have the same price.");
        }

        // Display an error message if something goes wrong
        if (compareMpg == 0 && compareMiles == 0 && comparePrice == 0) {
            System.err.println("Error in comparison methods. Check the data or comparison methods.");
        }
    }
}
