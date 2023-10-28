public class CarLotTester {
    public static void main(String[] args) {
        // creates a new car lot
        CarLot carlot = new CarLot();
        
        //Adds cars to the car lot
        addCar(HyundaiElantra, 56000, 45, 13500.50, 20800.75);
        addCar(PoscheCayenne, 200, 25, 45000.00, 75000.98);
        addCar(VWBeater, 200500, 10, 0.0, 500);

<<<<<<< HEAD
        // Testing Accessors
        Car car1 = carlot.findCarByIdentifier​(null);


        if (car1 != null){
            System.out.println("Car" + car1 + "found");
        }
        else{
            System.out.println("Car" + car1 + "not found");
        }
=======
>>>>>>> 4456887ef044275c84489ba29f0f8b9f8a58082b
    }
}