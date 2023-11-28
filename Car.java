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
    private int nhtsaRating;

    // Default Constructor
    public Car() {
        /**
         * Default constructor initializes a Car object with default values.
         *
         **/
        this("default1", 0, 0, 0.0, 0.0, 0);
    }

    /**
     * Constructor used when creating a new Car that will be added to a CarLot.
     *
     * @param id         String representation to identify this car. Should not
     *                   contain spaces.
     * @param mileage    Mileage of the vehicle when added to inventory.
     * @param mpg        Miles Per Gallon.
     * @param cost       Price paid to acquire this car.
     * @param salesPrice Price that the CarLot wants to sell this car for. Note that
     *                   when a vehicle is sold,
     *                   the price that it sells for may be different than the sales
     *                   price.
     * @param nhtsaRating NHTSA rating of the car (1-5 stars).
     */
    public Car(String id, int mileage, int mpg, double cost, double salesPrice, int nhtsaRating) {
        // Constructor for creating a new Car object with specified attributes.
        this.id = id;
        this.mileage = mileage;
        this.mpg = mpg;
        this.cost = cost;
        this.salesPrice = salesPrice;
        this.sold = false;
        this.priceSold = 0.0;
        this.profit = 0.0;
        this.nhtsaRating = nhtsaRating;
    }

    // Getter methods

    /**
     * Gets the Miles Per Gallon of the car
     * 
     * @return mpg | The car's MPG
     */
    public int getMpg() {
        return mpg;
    }

    /**
     * Gets the cost of the car
     * 
     * @return cost | The cost of the car
     */
    public double getCost() {
        return cost;
    }

    /**
     * Gets the car's ID
     * 
     * @return id | The car's ID
     */
    public String getId() {
        return id;
    }

    /**
     * Gets the car's mileage
     * 
     * @return mileage | The car's mileage
     */
    public int getMileage() {
        return mileage;
    }

    /**
     * Gets the car's selling price
     * 
     * @return salesPrice | The car's selling price
     */
    public double getSalesPrice() {
        return salesPrice;
    }

    /**
     * Checks if the car has been sold
     * 
     * @return sold | True if the car has been sold, false otherwise
     */
    public boolean isSold() {
        return sold;
    }

    /**
     * Gets the car's sold price
     * 
     * @return priceSold | The car's sold price
     */
    public double getPriceSold() {
        return priceSold;
    }

    /**
     * Gets the profit after selling the car
     * 
     * @return profit | The profit after selling the car
     */
    public double getProfit() {
        return profit;
    }

    /**
     * Gets the NHTSA rating of the car (1-5 stars)
     * 
     * @return nhtsaRating | The NHTSA rating of the car
     */
    public int getNhtsaRating() {
        return nhtsaRating;
    }

    // Setter methods

    /**
     * Sets the car's Miles Per Gallon
     * 
     * @param mpg | The new MPG
     */
    public void setMpg(int mpg) {
        this.mpg = mpg;
    }

    /**
     * Sets the car's cost
     * 
     * @param cost | The cost's new value
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

    /**
     * Sets the car's ID
     * 
     * @param id | The new ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets the car's mileage
     * 
     * @param mileage | The new mileage
     */
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    /**
     * Sets the car's selling price
     * 
     * @param salesPrice | The new selling price
     */
    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    /**
     * Sets whether the car has been sold or not
     * 
     * @param sold | True if the car is sold, false otherwise
     */
    public void setSold(boolean sold) {
        this.sold = sold;
    }

    /**
     * Sets the price for which the car was sold and calculates the profit
     * 
     * @param priceSold | The price the car was sold for
     */
    public void setPriceSold(double priceSold) {
        this.priceSold = priceSold;
        calculateProfit();
    }

    /**
     * Sets the NHTSA rating of the car
     * 
     * @param nhtsaRating | The new NHTSA rating 
     */
    public void setNhtsaRating(int nhtsaRating) {
        this.nhtsaRating = nhtsaRating;
    }

    // Method to mark the car as sold and calculate profit

    /**
     * Marks the car as sold and sets the selling price
     * 
     * @param priceSold | The price for which the car was sold
     */
    public void sellCar(double priceSold) {
        this.sold = true;
        this.setPriceSold(priceSold);
    }

    // Comparison methods

    /**
     * Compares the MPG of this car with another car
     * 
     * @param otherCar | The other car to compare with
     * @return Double.compare(this.mpg, otherCar.mpg) | A negative value if this car has lower MPG, 
     * a positive value if higher, and 0 if equal
     */
    public int compareMPG(Car otherCar) {
        return Double.compare(this.mpg, otherCar.mpg);

    }

    /**
     * Compares the mileage of this car with another car
     * 
     * @param otherCar | The other car to compare with
     * @return Integer.compare(this.mileage, otherCar.mileage) | A negative value if this car has lower mileage, 
     * a positive value if higher, and 0 if equal
     */
    public int compareMileage(Car otherCar) {
        return Integer.compare(this.mileage, otherCar.mileage);
    }

    /**
     * Compares the selling price of this car with another car
     * 
     * @param otherCar | The other car to compare with
     * @return Double.compare(this.salesPrice, otherCar.salesPrice) | A negative value if this car has a 
     * lower selling price, a positive value if higher, and 0 if equal
     */
    public int comparePrice(Car otherCar) {
        return Double.compare(this.salesPrice, otherCar.salesPrice);
    }

    // Calculate profit
    private void calculateProfit() {
        profit = priceSold - cost;
    }

    // toString method

    
    @Override
    public String toString() {
        // Convert the NHTSA rating to asterisks
        String nhtsaStars = "";
        for (int i = 0; i < nhtsaRating; i++) {
            nhtsaStars += "* ";
        }

        return "Car: " + id + ", Mileage: " + mileage + ", MPG " + mpg +
                ", Sold: " + (sold ? "Yes" : "No") + ", Cost: $" + String.format("%.2f", cost) +
                ", Selling price: $" + String.format("%.2f", salesPrice) +
                ", NHTSA Rating: " + nhtsaStars +
                ", Sold For $" + String.format("%.2f", priceSold) +
                ", Profit: $" + String.format("%.2f", profit);
    }
}
