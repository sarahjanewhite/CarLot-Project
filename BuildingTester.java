import java.util.ArrayList;
import java.util.Random;

public class BuildingTester {

    public static void main(String[] args) {
        automatedTestBuilding();
    }

    private static void automatedTestBuilding() {
        Random rand = new Random();
        ArrayList<Room> rooms = new ArrayList<>();

        // Create a Classroom with 50 chairs
        Room classroom = new Classroom(500, 50);
        rooms.add(classroom);

        // Create an Elevator with a random initial area
        Room elevator = new Elevator(rand.nextInt(100) + 10);
        // Randomly move the elevator up or down
        if (rand.nextBoolean()) {
            ((Elevator) elevator).up(rand.nextInt(10));
        } else {
            ((Elevator) elevator).down(rand.nextInt(10));
        }
        rooms.add(elevator);

        System.out.println("Building Summary:");
        for (Room room : rooms) {
            System.out.println(room.toString());
        }
    }
}
