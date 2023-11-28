import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
// import java.util.Collections;
// import javax.management.RuntimeErrorException;

/**
 * A CarLot Represents a collection of distinct Cars that serve as the car lot's
 * inventory and associated operations on the car lot.
 */
public class CarLot extends ArrayList<Car> {

  /**
   * Default constructor. Intializes the inventory
   */
  public CarLot() {

  }

  /**
   * Return the average MPG of all cars in the inventory
   *
   * @return average MPG of all cars
   */
  public double getAverageMPG() {
    if (isEmpty()) {
      return 0; // could throw an exception if needed
    }
    double sum = 0;
    for (int i = 0; i < size(); i++) {
      Car car = get(i);
      sum += car.getMpg();
    }

    return sum / size();
  }

  /**
   * Return the Car in inventory that matches the identifier
   *
   * @param identifier Car identifier to search for
   * @return Car with the mathc identifier or null if no match
   */
  public Car findCarByIdentifier​(String identifier) {
    for (int i = 0; i < size(); i++) {
      Car car = get(i);
      if (car.getId().equals(identifier)) {
        return car;
      }
    }
    return null;
  }

  /**
   * Return a new list containing all of the Cars in inventory, in the order that
   * they were added to the inventory
   *
   * @return new list of Cars
   */
  public ArrayList<Car> getCarsInOrderOfEntry() {
    return this;
  }

  /**
   * Return the single Car inventory that has the highest MPG
   *
   * @return Car with the highest MPG
   */
  public Car getCarWithBestMPG() {
    if (isEmpty()) {
      return null;
    }
    Car bestMPGCar = get(0);

    for (int i = 0; i < size(); i++) {
      Car car = get(i);
      if (car.getMpg() > bestMPGCar.getMpg()) {
        bestMPGCar = car;
      }
    }
    return bestMPGCar;
  }

  /**
   * Return the single Car in the inventory that has the highest mileage.
   *
   * @return Car with highest mileage
   */
  public Car getCarWithHighestMileage() {

    if (isEmpty()) {
      return null;
    }

    Car highestMileageCar = get(0);

    for (int i = 0; i < size(); i++) {
      Car car1 = get(i);
      if (car1.getMileage() > highestMileageCar.getMileage()) {
        highestMileageCar = car1;
      }
    }
    return highestMileageCar;
  }

  /**
   * Retrieves all cars in the CarLot.
   *
   * @return An ArrayList containing all cars in the CarLot.
   */
  public ArrayList<Car> getInventory() {
    return this;
  }

  /**
   * Return the total profit of all sold car in inventory
   *
   * @return total profit of all sold car
   */
  public double getTotalProfit() {
    if (isEmpty()) {
      return 0;
    }

    double totalProfit = 0;

    for (int i = 0; i < size(); i++) {
      Car car = get(i);
      totalProfit += car.getProfit();
    }

    return totalProfit;
  }

  /**
   * Return a new list containing all of the Cars in inventory, sorted by highest
   * to lowest MPG
   *
   * @return new, sorted list
   */
  public ArrayList<Car> getCarsSortedByMPG() {
    CarLot sortedByMPG = new CarLot();
    for (int i = 0; i < size(); i++) {
      Car car = get(i);
      sortedByMPG.add(car);
      sortedByMPG.sort(Comparator.comparingDouble(Car::getMpg));
    }
    return sortedByMPG;
  }

  /**
   * Adds a new car to the CarLot's inventory.
   *
   * @param id          Identifier of the new car.
   * @param mileage     Mileage of the new car.
   * @param mpg         MPG of the new car.
   * @param cost        Cost of the new car.
   * @param salesPrice  Selling price of the new car.
   * @param nhtsaRating NHTSA rating of the new car.
   */
  // Mutator methods
  public void addCar(String id, int mileage, int mpg, double cost, double salesPrice, int nhtsaRating) {
    Car newCar = new Car(id, mileage, mpg, cost, salesPrice, nhtsaRating);
    add(newCar);
  }

  /**
   * Sell the car identified by the identifier for the priceSold
   *
   * @param identifier Identifier of the car to be sold.
   * @param priceSold  Price for which the car is sold.
   * @throws IllegalArgumentException Thrown if there is no car with identifier in
   *                                  the inventory
   */
  public void sellCar(String identifier, double priceSold) throws IllegalArgumentException {
    Car carToSell = findCarByIdentifier​(identifier);
    if (carToSell == null) {
      throw new IllegalArgumentException("Car not found with identifier: " + identifier);
    }

    carToSell.sellCar(priceSold);
  }

  /**
   * Saves the car in this carlot to the file specified in CARLOT_INVENTORY
   * 
   * @throws IOException is thrown if the file cannot be opened
   */
  public void saveToDisk() {
    try (PrintWriter writer = new PrintWriter("carlot.txt")) {
      for (int i = 0; i < size(); i++) {
        Car car = get(i);
        writer.println(car.getId() + "," + car.getMileage() + "," + car.getMpg() + "," +
            car.getCost() + "," + car.getSalesPrice() + "," + car.getNhtsaRating());
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  /**
   * Load the car stores in CARLOT_INVENTORY_LOCATION
   * 
   * @throws FileNotFoundException If the file cannot be opened.
   * @throws IOException           If an I/O error occurs while reading from the
   *                               file.
   * @throws NumberFormatException If the data in the file cannot be properly
   *                               parsed.
   */
  public void loadFromDisk() {
    try (BufferedReader reader = new BufferedReader(new FileReader("carlot.txt"))) {
      String line;
      while ((line = reader.readLine()) != null) {
        String[] carData = line.split(",");
        if (carData.length == 6) {
          String id = carData[0];
          int mileage = Integer.parseInt(carData[1]);
          int mpg = Integer.parseInt(carData[2]);
          double cost = Double.parseDouble(carData[3]);
          double salesPrice = Double.parseDouble(carData[4]);
          int nhtsaRating = Integer.parseInt(carData[5]);

          Car loadedCar = new Car(id, mileage, mpg, cost, salesPrice, nhtsaRating);
          add(loadedCar);
        }
      }
    } catch (IOException | NumberFormatException e) {
      e.printStackTrace();
    }
  }
}
