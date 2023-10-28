import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//Do we need an import statement for Car class?

import javax.management.RuntimeErrorException;

public class CarLot {
  private ArrayList<Car> inventory;

  public CarLot() {
    inventory = new ArrayList<Car>();
   }

  public Car findCarByIdentifier​(String identifier) {

    for(int i = 0; i < inventory.size(); i++) {
      for (Car car : inventory){}
        if(car.getId() == identifier) {
            return car;
        }
        else {
            throw new RuntimeErrorException("There is no car with that id");
        } 
    }
   }

  public double getAverageMpg() {
    if (inventory.isEmpty()) {
            return 0; // could throw an exception if needed
        }

        double sum = 0;
        for (Car car : inventory) {
            sum += car.getMpg();
        }

        return sum / inventory.size();
    }
  }

  public ArrayList<Car> getCarsSortedByMPG() {
    ArrayList<Car> sortedByMPG = new ArrayList<>(inventory);

    sortedByMPG.sort(Comparator.comparingDouble(Car::getMpg));

    return sortedByMPG;
  }

  public ArrayList<Car> getCarsInOrderOfEntry() {
    ArrayList<Car> inventoryInOrderOfEntry = new ArrayList<Car>();
    inventoryInOrderOfEntry = (ArrayList)inventory.clone();

    return inventoryInOrderOfEntry;
  }

  public Car getCarWithBestMPG() {
    if (inventory.isEmpty()) {
      return null;
  }

  Car bestMPGCar = inventory.get(0);

  for (Car car : inventory) {
      if (car.getMpg() > bestMPGCar.getMpg()) {
          bestMPGCar = car;
      }
  }

  return bestMPGCar;
  }

  public Car getCarWithHighestMileage() {
    if (inventory.isEmpty()) {
      return null;
  }

  Car highestMileageCar = inventory.get(0);

  for (Car car : inventory) {
      if (car.getMileage() > highestMileageCar.getMileage()) {
          highestMileageCar = car;
      }
  }

  return highestMileageCar;
  }

  ArrayList<Car> 	getInventory() {
    return new ArrayList<>(inventory);
  }

  public double getTotalProfit() {
    double totalProfit = 0;

    for (Car car : inventory) {
        totalProfit += car.getProfit();
    }

    return totalProfit;
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
