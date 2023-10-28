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

    for(int i = 0; i < inventory.size(); i++) {
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

        averageMpg = sum / inventory.size();

        return averageMpg;
    }
  }

  public ArrayList<Car> getCarsSortedByMPG() {
    ArrayList<Car> sortedByMPG = new ArrayList<>(inventory);

    Collections.sort(sortedCars, Comparator.comparingDouble(Car::getMpg));

    return sortedByMPG;
  }

  public ArrayList<Car> getCarsInOrderOfEntry() {
    return
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
    return
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
