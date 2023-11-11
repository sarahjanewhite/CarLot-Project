import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Building {

	public static void main(String[] args) {
		Scanner kybd = new Scanner(System.in);

		// declare an ArrayList containing Room elements
		Random rand = new Random();

		System.out.println("Enter \n\t1: create classroom\n\t2: create create elevator" + "\n\t3: exit");
		int inp = kybd.nextInt();
		while (inp != 3) {
			if (inp == 1) {
				System.out.println("How many chairs? ");
				int ch = kybd.nextInt();
				Room current = new Classroom(rand.nextInt(1000) + 100, ch);
				// add current to the ArrayList
			} else if (inp == 2) {
				Elevator current = new Elevator(rand.nextInt(100) + 10);
				if (rand.nextInt(2) == 0) {
					current.up(rand.nextInt(10));
				} else {
					current.down(rand.nextInt(10));
				}
				// add current to the ArrayList
			}
			System.out.println("Enter \n\t1: create classroom\n\t2: create create elevator" + "\n\t3: exit");
			inp = kybd.nextInt();
		}
		kybd.close();
		// create a for loop to walk through the ArrayList its elements, one per line

	}

}
