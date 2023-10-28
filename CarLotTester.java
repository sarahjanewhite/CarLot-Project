public class CarLotTester {
    public static void main(String[] args) {
        // creates a new car lot
        CarLot carlot = new CarLot();

        // Testing Accessors
        Car car1 = carlot.findCarByIdentifier​(null);


        if (car1 != null){
            System.out.println("Car" + car1 + "found");
        }
        else{
            System.out.println("Car" + car1 + "not found");
        }
    }
}