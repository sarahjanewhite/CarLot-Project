import java.util.ArrayList;

/**
 * StringSet Revisited
 *
 * @author Aliyah Lewis, Jacob Sparks
 *
 */
public class StringSet extends ArrayList<String> {

    /**
     * Adds a new string to the set
     *
     * @param newStr The string to be added to the set.
     * @return true (if the string was added successfully) | false (if the set is
     *         full)
     */
    public boolean add(String newStr) {
        return super.add(newStr);
    }

    /**
     * Removes the last added string from the set.
     */
    public void pop() {
        if (!this.isEmpty()) {
            this.remove(this.size() - 1);
        }
    }

    /**
     * Returns the current size of the set.
     *
     * @return size The number of strings in the set.
     */
    public int size() {
        return super.size();
    }

    /**
     * Computes the sum of valid integers in the set.
     *
     * @return sum The sum of all valid integers in the set.
     */
    public int sumValidIntegers() {
        int sum = 0;
        for (String str : this) {
            try {
                sum += Integer.parseInt(str);
            } catch (NumberFormatException ignored) {
                // Not a valid integer, ignore and continue
            }
        }
        return sum;
    }

    /**
     * Computes the total number of characters in all strings in the set.
     *
     * @return totalChars The total number of characters in the set's strings.
     */
    public int numChars() {
        int totalChars = 0;
        for (String str : this) {
            totalChars += str.length();
        }
        return totalChars;
    }

    /**
     * Counts the number of strings in the set that contain a specified substring.
     *
     * @param stringToLookFor The substring to search for in the strings.
     * @return count The number of strings in the set containing the specified
     *         substring.
     */
    public int countStrings(String stringToLookFor) {
        int count = 0;
        for (String str : this) {
            if (str.contains(stringToLookFor)) {
                count++;
            }
        }
        return count;
    }
}
