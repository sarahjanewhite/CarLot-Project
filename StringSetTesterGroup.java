/**
 * StringSetTesterGroup
 * 
 * A class to test StringSet.java
 *
 * @author Sarah White
 *
 */

public class StringSetTesterGroup {

    public static void main(String[] args) {
        automatedTestStringSet();
    }

    private static void automatedTestStringSet() {
        // Creating an instance of StringSet
        StringSet stringSet = new StringSet();

        // Adding strings to the set
        stringSet.add("123");
        stringSet.add("abc");
        stringSet.add("456");
        stringSet.add("def");

        // Tests stringSet.size for accuracy
        if (stringSet.size() == 4) {
            System.out.println("Size test passed");
        } else {
            System.out.println("Size test failed");
        }

        // Tests stringSet.sumValidIntegers for accuracy
        if (stringSet.sumValidIntegers() == 579) {
            System.out.println("Sum of valid integers test passed");
        } else {
            System.out.println("Sum of valid integers test failed");
        }

        // Tests stringSet.numChars for accuracy
        if (stringSet.numChars() == 12) {
            System.out.println("Total number of characters test passed");
        } else {
            System.out.println("Total number of characters test failed");
        }

        // Sets a string variable to "ab"
        String substringToLookFor = "ab";
        // Tests stringSet.countStrings for accuracy
        if (stringSet.countStrings(substringToLookFor) == 1) {
            System.out.println("Count strings test passed");
        } else {
            System.out.println("Count strings test failed");
        }

        // Removing the last added string from the set
        stringSet.pop();

        // Automated testing after popping
        if (stringSet.size() == 3) {
            System.out.println("Size after popping test passed");
        } else {
            System.out.println("Size after popping test failed");
        }

        // Print statement for completed testing prints
        System.out.println("\nTesting complete.");
    }
}
