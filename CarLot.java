import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;


public class CarLot {
  private ArrayList<Car> inventory;

  public CarLot() {
    inventory = new ArrayList<Car>();
   }

  public Car findCarByIdentifier​(String identifier) {
    for (Car car : inventory){
      if (car.getId().equals(identifier)){
        return car;
      }
    }
    return null;
   }

  public double getAverageMPG() {
    if (inventory.isEmpty()) {
            return 0; // could throw an exception if needed
        }

        double sum = 0;
        for (Car car : inventory) {
            sum += car.getMpg();
        }

        return sum / inventory.size();
    }

  public ArrayList<Car> getCarsSortedByMPG() {
    ArrayList<Car> sortedByMPG = new ArrayList<>(inventory);

    sortedByMPG.sort(Comparator.comparingDouble(Car::getMpg));

    return sortedByMPG;
  }

  public ArrayList<Car> getCarsInOrderOfEntry() {

    return new ArrayList<>(inventory);
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
  public void addCar(String id, int mileage, int mpg, double cost, double salesPrice, int nhtsaRating) {
    Car newCar = new Car(id, mileage, mpg, cost, salesPrice, nhtsaRating); 
    add(newCar);
}

  public void sellCar(String identifier, double priceSold) throws IllegalArgumentException {
    Car carToSell = findCarByIdentifier​(identifier);
    if (carToSell == null) {
      throw new IllegalArgumentException("Car not found with identifier: " + identifier);
    }

    carToSell.sellCar(priceSold);
  }

 public void saveToDisk() {
      try (PrintWriter writer = new PrintWriter("carlot.txt")) {
          for (Car car : inventory) {
              writer.println(car.getId() + "," + car.getMileage() + "," + car.getMpg() + "," +
                      car.getCost() + "," + car.getSalesPrice() + "," + car.getNhtsaRating());
          }
      } catch (IOException e) {
          e.printStackTrace();
      }
  }

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
                  inventory.add(loadedCar);
              }
          }
      } catch (IOException | NumberFormatException e) {
          e.printStackTrace();
      }
  }

}
