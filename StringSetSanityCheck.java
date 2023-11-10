import java.util.ArrayList;

public class StringSetSanityCheck {
	// This code verifies that the signatures for StringSet class
	// methods are correct. This code does not validate
	// the code in those methods.
	public static void SanityCheck() {
		StringSet objStrSet0 = new StringSet();

		// have to wait for inheritance lab for this to compile.
		ArrayList<String> ss2 = new StringSet();

		objStrSet0.add("");
		int int0 = objStrSet0.size();
		int0 = objStrSet0.numChars();
		int0 = objStrSet0.countStrings("xyzzy");
		int0 = objStrSet0.sumValidIntegers();
		objStrSet0.pop();

	}
}