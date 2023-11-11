public class Elevator extends Room {
    private int currentFloor;

    public Elevator(int area) {
        super(area);
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void up(int floors) {
        currentFloor += floors;
    }

    public void down(int floors) {
        currentFloor -= floors;
    }

}
