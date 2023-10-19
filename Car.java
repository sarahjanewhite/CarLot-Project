public class Car {
    // Member variables (attributes) of the Car class
    private String id;
    private int mileage;
    private int mpg;
    private double cost;
    private double salesPrice;
    private boolean sold;
    private double priceSold;
    private double profit;

    // Default Constructor
    public Car() {
        // Default constructor initializes a Car object with default values.
        this.setId("default1");
        this.setMileage(0);
        this.setMpg(0);
        this.setCost(0.0);
        this.setSalesPrice(0.0);
        this.setSold(false);
        this.setPriceSold(0.0);
        this.setProfit(0.0);
    }

    // Constructor for adding a new Car to the inventory
    public Car(String id, int mileage, int mpg, double cost, double salesPrice) {
        // Constructor for creating a new Car object with specified attributes.
        this.setId(id);
        this.setMileage(mileage);
        this.setMpg(mpg);
        this.setCost(cost);
        this.setSalesPrice(salesPrice);

    }

    // Accessor methods
    // Accessor methods to retrieve the values of the member variables.
    public int getMpg() {
        return mpg;

    }

    public double getCost() {
        return cost;

    }

    // Setter methods
    // Setter methods to modify the values of the member variables.
    public void setMpg(int mpg) {
        setMpg = mpg;

    }

    public void setCost(double cost) {
        setCost = cost;

    }

    // Method to mark the car as sold and calculate the profit
    // Method for selling the car and calculating profit.

    // Comparison methods
    // Methods for comparing Car objects based on specific attributes (mpg, mileage,
    // price).
    public int compareMPG(Car otherCar) {
        if (mpg < otherCar.mpg) {
            return -1;
        } else if (mpg > otherCar.mpg) {
            return 1;
        } else {
            return 0;
        }


    }

    // toString method
    @Override
    public String toString() {
        // Method to generate a formatted string representation of the Car object.
    }

    /**
    * Displays a text representation of a specific Car object 
    */
    
    public String toString() {
    
        System.out.println("Car ID: " + getId());
        System.out.println("Mileage: " +getMileage());
        System.out.println("MPG: " +getMpg());
        System.out.println("Cost: $" + getCost());
        System.out.println("Sales Price: $" +getSalesPrice());
        System.out.println("Sold?: " +isSold());
        System.out.println("Price Sold: $" +getPriceSold());
        System.out.println("Profit: $" +getProfit());
    }
     
    /**
    * Compares the sales price of this instance of car to another instance
    * Returns a negative number if this car's sales price is lower
    * Returns zero if the prices are equal
    * Returns a positive number is this car's sales price is higher
    *
    * @param Car otherCar This is the car whose sales price will be compared
    */
    
    public double compareSalesprice(Car otherCar) {
    
        double difference = getPriceSold() - otherCar.getPriceSold();
    
        return difference;
    }
    
    /**
    * Returns the asking price of the current car object
    */
    
    public double getSalesPrice() {
        
        return salesPrice;
    }
    
    /**
    * Allows the user to change the asking price of the current car object
    * Returns the new asking price
    *
    * @param double salesPrice The asking price for the car
    */
    public double setSalesPrice (double salesPrice) {
        this.salesPrice = salesPrice ;
        return this.salesPrice;
    }
    
    /**
    * Returns the actual sale price of the current car object
    */
    
    public double getPriceSold() {
        
        return priceSold;
    }
    
    /**
    * Allows the user to enter the price the car was sold for
    * Returns the new sales price
    *
    * @param double priceSold The price the car was sold for
    */
    
    public double setPriceSold (double priceSold) {
        this.priceSold = priceSold;
        return this.priceSold;
    }
}
