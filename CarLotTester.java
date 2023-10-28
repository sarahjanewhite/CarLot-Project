public class CarLotTester {
    public static void main(String[] args) {
        // creates a new car lot
        CarLot carlot = new CarLot();
        
        //Adds cars to the car lot
        carlot.addCar("HyundaiElantra", 56000, 45, 13500.50, 20800.75);
        carlot.addCar("PorscheCayenne", 200, 25, 45000.00, 75000.98);
        carlot.addCar("VWBeater", 200500, 10, 0.0, 500);

        // Testing Accessors
        Car car1 = carlot.findCarByIdentifier​("HyundaiElantra");
        Car car2 = carlot.findCarByIdentifier​("PoscheCayenne");
        Car car3 = carlot.findCarByIdentifier​("VWBeater");

        if (car1 != null){
            System.out.println("HyundaiElantra found");
        }
        else{
            System.out.println("HyundaiElantra not found");
        }

        if (car2 != null){
            System.out.println("PoscheCayenne found");
        }
        else{
            System.out.println("PoscheCayenne not found");
        }

        if (car3 != null){
            System.out.println("VWBeater found");
        }
        else{
            System.out.println("VWBeater not found");
        }

        //Sell car(s)
        carlot.sellCar("HyundaiElantra", 20800.75);
        //carlot.sellCar("PorscheCayenne", 75000.98);
        //carlot.sellCar("VWBeater", 500.00);

    }
}