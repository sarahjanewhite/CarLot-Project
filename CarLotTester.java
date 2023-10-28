public class CarLotTester {
    public static void main(String[] args) {
        // creates a new car lot
        CarLot carlot = new CarLot();
        
        //Adds cars to the car lot
        carlot.addCar("HyundaiElantra", 56000, 45, 13500.50, 20800.75);
        carlot.addCar("PoscheCayenne", 200, 25, 45000.00, 75000.98);
        carlot.addCar("VWBeater", 200500, 10, 0.0, 500);

        // Testing Accessors
        Car car1 = carlot.findCarByIdentifier("HyundaiElantra");
        Car car2 = carlot.findCarByIdentifier("PoscheCayenne");
        Car car3 = carlot.findCarByIdentifier("VWBeater");

        if (car1 != null){
            System.out.println("Car" + car1 + "found");
        }
        else{
            System.out.println("Car" + car1 + "not found");
        }

        if (car2 != null){
            System.out.println("Car" + car2 + "found");
        }
        else{
            System.out.println("Car" + car2 + "not found");
        }

        if (car3 != null){
            System.out.println("Car" + car3 + "found");
        }
        else{
            System.out.println("Car" + car3 + "not found");
        }


    }
}