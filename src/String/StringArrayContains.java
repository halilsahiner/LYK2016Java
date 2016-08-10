package String;

import java.util.Arrays;

public class StringArrayContains {
	public static void main(String args[]) {
		String[] strMonths = new String[] { "January", "February", "March", "April", "May", "June", "July", "August",
				"November", "September" };

		String strFind1 = "March";
		String strFind2 = "December";

		boolean contains = false;

		for (int i = 0; i < strMonths.length; i++) {
			if (strMonths[i].equals(strFind1)) {
				contains = true;
				break;

			}
		}
		if (contains) {
			System.out.println("String array Stringi içeriyor " + strFind1);
		} else
			System.out.println("İçermiyor." + strFind1);
		contains = Arrays.asList(strMonths).contains(strFind1);
		System.out.println("Array string'i içeriyor mu? " + strFind1 + " " + contains);
		contains = Arrays.asList(strMonths).contains(strFind2);
		System.out.println("Array string'i içeriyor mu? " + strFind2 + " " + contains);

	}

}
