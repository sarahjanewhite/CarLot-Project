import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//Do we need an import statement for Car class?

public class CarLot {
  ArrayList<Car> inventory = new ArrayList<Car>();

  public CarLot() {
     ArrayList<Car> = //something;
   }

  public Car findCarByIdentifier​(String identifier) {
     return
   }

  public double getAverageMpg() {
    return
  }

  public ArrayList<Car> getCarsSortedByMPG() {
    return
  }

  public ArrayList<Car> getCarsInOrderOfEntry() {
    return
  }

  public Car getCarWithBestMPG() {
    return 
  }

  public Car getCarWithHighestMileage() {
    return
  }

  ArrayList<Car> 	getInventory() {
    return
  }

  public double getTotalProfit() {
    return
  }

  // Mutator methods
  public void addCar(String id, int mileage, int mpg. double cost, double salesPrice) {
    Car newCar = new Car(id, mileage, mpg, cost, salesPrice);
    inventory.add(newCar);
  }

  public void sellCar(String identifier, double priceSold) throws IllegalArgumentException {
    Car carToSell = findCarByIdentifier​(identifier);
    if (carToSell == null) {
      throw new IllegalArgumentException("Car not found with identifier: " + identifier);
    }

    carToSell.sellCar(priceSold);
  }

}