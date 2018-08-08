package me.jacob.palindromeChecker;

/*
 * Name: Jacob Seiler
 * Teacher: Mrs. Costin
 * Course: ICS4U
 * Date: 9/19/2017
 */
public class PalindromeChecker {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		char[] word = {'R', 'A', 'D', 'A', 'R'}; // Create new char array.
		printResult(word); // Print results for that array.

		char[] word1 = {'C', 'I', 'V', 'I', 'C'}; // Create new char array.
		printResult(word1); // Print results for that array.

		char[] word2 = {'H', 'E', 'L', 'L', 'O'}; // Create new char array.
		printResult(word2); // Print results for that array.
	}

	/**
	 * Checks if the given char array is a palindrom.
	 *
	 * @param word the char array to check
	 * @return true, if is a palindrom
	 */
	private static boolean isPalindrom(char[] word) {
		int iStart = 0; // Index to start at.
		int iEnd = word.length - 1; // Index at the end of the array.

		// While the end index is past the start index.
		while (iEnd > iStart) {
			if (word[iStart] != word[iEnd]) // If the chars do not equal each other.
				return false; // The array is not a palindrom.

			iStart++; // Move the start index forward.
			iEnd--; // Move the end index backwards.
		}

		return true; // The array is a palindrom.
	}

	/**
	 * Prints the result.
	 *
	 * @param word the char array to print
	 */
	private static void printResult(char[] word) {
		String w = String.valueOf(word); // Turn the char array into a string
		System.out.println("Palindrom \"" + w + "\": " + isPalindrom(word)); // Print the result
	}

}
