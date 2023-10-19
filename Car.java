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
        /**
         * Default constructor initializes a Car object with default values.
         *
         **/
        this("default1", 0, 0, 0.0, 0.0);
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
     */
    public Car(String id, int mileage, int mpg, double cost, double salesPrice) {
        // Constructor for creating a new Car object with specified attributes.
        this.id = id;
        this.mileage = mileage;
        this.mpg = mpg;
        this.cost = cost;
        this.salesPrice = salesPrice;
        this.sold = false;
        this.priceSold = 0.0;
        this.profit = 0.0;
    }

    // Accessor methods
    // Accessor methods to retrieve the values of the member variables.
    public int getMpg() {
        return mpg;

    }

    public double getCost() {
        return cost;

    }

    // TODO: getId goes here

    // TODO: getMileage goes here

    public double getSalesPrice() {
        return salesPrice;
    }

    public boolean isSold() {
        return sold;
    }

    public double getPriceSold() {
        return priceSold;
    }

    public double getProfit() {
        return profit;
    }

    // Setter methods
    public void setMpg(int mpg) {
        this.mpg = mpg;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setId(String id) {
        this.id = id;
    }

    // TODO: setMileage goes here

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }

    public void setPriceSold(double priceSold) {
        this.priceSold = priceSold;
        calculateProfit();
    }

    // Method to mark the car as sold and calculate profit
    public void sellCar(double priceSold) {
        this.sold = true;
        this.setPriceSold(priceSold);
    }

    // Comparison methods
    public int compareMPG(Car otherCar) {
        return Double.compare(this.mpg, otherCar.mpg);
    }

    // TODO: compareMiles comparison goes here (return Integer.compare)

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
        return "Car: " + id + ", Mileage: " + mileage + ", MPG " + mpg +
                ", Sold: " + (sold ? "Yes" : "No") + ", Cost: $" + String.format("%.2f", cost) +
                ", Selling price: $" + String.format("%.2f", salesPrice) +
                ", Sold For $" + String.format("%.2f", priceSold) +
                ", Profit: $" + String.format("%.2f", profit);
    }
}