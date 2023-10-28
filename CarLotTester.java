public class CarLotTester {
    public static void main(String[] args) {
        // creates a new car lot
        CarLot carlot = new CarLot();
        
        //Adds cars to the car lot
        carlot.addCar("HyundaiElantra", 56000, 45, 13500.50, 0.0);
        carlot.addCar("PorscheCayenne", 200, 25, 45000.00, 0.0);
        carlot.addCar("VWBeater", 200500, 10, 0.0, 0.0);

        // Testing Accessors
        Car car1 = carlot.findCarByIdentifier​("HyundaiElantra");
        Car car2 = carlot.findCarByIdentifier​("PorscheCayenne");
        Car car3 = carlot.findCarByIdentifier​("VWBeater");

        if (car1 != null){
            System.out.println("HyundaiElantra found");
        }
        else{
            System.out.println("HyundaiElantra not found");
        }

        if (car2 != null){
            System.out.println("PorscheCayenne found");
        }
        else{
            System.out.println("PorscheCayenne not found");
        }

        if (car3 != null){
            System.out.println("VWBeater found");
        }
        else{
            System.out.println("VWBeater not found");
        }
        
        System.out.println("The average MPG on the lot is: " + carlot.getAverageMPG());

        System.out.println("The car with the best MPG is: " + carlot.getCarWithBestMPG());

        System.out.println("The car with the highest mileage is: " + carlot.getCarWithHighestMileage());

        //Sell car(s)
        carlot.sellCar("HyundaiElantra", 20800.75);
        //carlot.sellCar("PorscheCayenne", 75000.98);
        //carlot.sellCar("VWBeater", 500.00);

    }
}