import java.util.Scanner;

/**
 * StringSet Revisited
 *
 * @author Aliyah Lewis
 *
 */

public class StringSetTester {
	/**
     * Starts the program running and prints the game simulation
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner kybd = new Scanner(System.in);

        System.out.print("How many strings will you enter? ");
        int numStr = kybd.nextInt();
        kybd.nextLine(); // Consume the newline character

        StringSet stringSet = new StringSet();

        for (int i = 0; i < numStr; i++) {
            System.out.print("Enter a string: ");
            String input = kybd.nextLine();
            if (stringSet.add(input)) {
                System.out.println("Added: " + input);
            } else {
                System.out.println("StringSet is full. Cannot add more strings.");
            }
        }

        System.out.println("Number of strings in StringSet: " + stringSet.size());
        System.out.println("Total number of characters in StringSet: " + stringSet.numChars());

        System.out.print("Enter a substring to search for: ");
        String searchString = kybd.nextLine();
        int count = stringSet.countStrings(searchString);
        System.out.println("Number of strings containing the substring '" + searchString + "': " + count);

        kybd.close();
    }
}
