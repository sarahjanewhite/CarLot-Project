import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Building {

	public static void main(String[] args) {
		Scanner kybd = new Scanner(System.in);
		ArrayList<Room> rooms = new ArrayList<>();
		Random rand = new Random();

		System.out.println("Enter \n\t1: create classroom\n\t2: create elevator\n\t3: exit");
		int inp = kybd.nextInt();

		while (inp != 3) {
			if (inp == 1) {
				System.out.println("Enter the area of the classroom: ");
				int area = kybd.nextInt();
				System.out.println("Enter the number of chairs: ");
				int chairs = kybd.nextInt();
				Classroom current = new Classroom(area, chairs);
				rooms.add(current);
			} else if (inp == 2) {
				System.out.println("Enter the area of the elevator: ");
				int area = kybd.nextInt();
				Elevator current = new Elevator(area);
				if (rand.nextInt(2) == 0) {
					current.up(rand.nextInt(10));
				} else {
					current.down(rand.nextInt(10));
				}
				rooms.add(current);
			}

			System.out.println("Enter \n\t1: create classroom\n\t2: create elevator\n\t3: exit");
			inp = kybd.nextInt();
		}

		kybd.close();

		// Loops through the ArrayList and prints the information for each room
		for (Room room : rooms) {
			System.out.println(room);
		}
	}
}
