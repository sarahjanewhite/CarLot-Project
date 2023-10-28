public class CarLotTester {
    public static void main(String[] args) {
        // creates a new car lot
        CarLot carlot = new CarLot();
        
        //Adds cars to the car lot
        addCar(HyundaiElantra, 56000, 45, 13500.50, 20800.75);
        addCar(PoscheCayenne, 200, 25, 45000.00, 75000.98);
        addCar(VWBeater, 200500, 10, 0.0, 500);

    }
}