/**
 * The Elevator class represents a room designed as an elevator,
 * extending the functionality of the Room class.
 * 
 * @author Jacob Sparks
 */
class Elevator extends Room {

    /**
     * The current floor of the elevator.
     */
    private int currentFloor;

    /**
     * Constructs an Elevator with the given area and initializes the current floor
     * to 1.
     *
     * @param area The area of the elevator.
     */
    public Elevator(int area) {
        super(area);
        this.currentFloor = 1;
    }

    /**
     * Gets the current floor of the elevator.
     *
     * @return The current floor.
     */
    public int getFloor() {
        return currentFloor;
    }

    /**
     * Moves the elevator up by the specified number of floors.
     * If the resulting floor is below the ground floor (floor 1), it is set to the
     * ground floor.
     *
     * @param floors The number of floors to move up.
     */
    public void up(int floors) {
        currentFloor += floors;
        if (currentFloor < 1) {
            currentFloor = 1; // Ensure it doesn't go below the ground floor (floor 1).
        }
    }

    /**
     * Moves the elevator down by the specified number of floors.
     * If the resulting floor is below the ground floor (floor 1), it is set to the
     * ground floor.
     *
     * @param floors The number of floors to move down.
     */
    public void down(int floors) {
        currentFloor -= floors;
        if (currentFloor < 1) {
            currentFloor = 1; // Ensure it doesn't go below the ground floor (floor 1).
        }
    }

    /**
     * Returns a string representation of the Elevator, including its area and
     * current floor.
     *
     * @return A string representation of the Elevator.
     */
    @Override
    public String toString() {
        return "Square Feet: " + getSquareFeet() + ", Capacity: " + getCapacity() + ", Current Floor: " + currentFloor;
    }
}
