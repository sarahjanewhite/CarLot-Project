import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
//import java.util.Collections;
// import javax.management.RuntimeErrorException;

public class CarLot extends ArrayList<Car> {

  public CarLot() {
    
   }

  public double getAverageMPG() {
    if (isEmpty()) {
      return 0; // could throw an exception if needed
    }
    double sum = 0;
    for (int i = 0; i < size(); i++) {
      Car car = get(i);
      sum+= car.getMpg();
    }

    return sum /size();
    }
  
  public Car findCarByIdentifier​(String identifier) {
    for (int i = 0; i < size(); i++) {
      Car car = get(i);
      if (car.getId() == identifier) {
        return car;
      }
    }
    return null;
  }

  public ArrayList<Car> getCarsInOrderOfEntry() {
    return this;
  }

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
  
  public ArrayList<Car> getInventory() {
    return this;
  }
  
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

  public ArrayList<Car> getCarsSortedByMPG() {
    CarLot sortedByMPG = new CarLot();
    for (int i = 0; i < size(); i++) {
      Car car = get(i);
      sortedByMPG.add(car);
      sortedByMPG.sort(Comparator.comparingDouble(Car::getMpg));
    }
    return sortedByMPG;
  }

  // Mutator methods
  public void addCar(String id, int mileage, int mpg, double cost, double salesPrice) {
    Car newCar = new Car(id, mileage, mpg, cost, salesPrice);
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
      for (int i = 0; i < size(); i++) {
        Car car = get(i);
        writer.println(car.getId() + "," + car.getMileage() + "," + car.getMpg() + "," + 
        car.getCost() + "," + car.getSalesPrice());
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
        if (carData.length == 5) {
          String id = carData[0];
          int mileage = Integer.parseInt(carData[1]);
          int mpg = Integer.parseInt(carData[2]);
          double cost = Double.parseDouble(carData[3]);
          double salesPrice = Double.parseDouble(carData[4]);

          Car loadedCar = new Car(id, mileage, mpg, cost, salesPrice);
          add(loadedCar);
        }
      }
    } catch (IOException | NumberFormatException e) {
      e.printStackTrace();
    }
  }
}

