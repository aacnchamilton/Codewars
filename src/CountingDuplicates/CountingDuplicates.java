package CountingDuplicates;

import java.util.ArrayList;

public class CountingDuplicates {

	public static void main(String[] args) {
		String text = "ABBA";
		int count = countingDuplicates(text);
		System.out.println("Highest Count of Duplicate: " + count);

	}

	private static int countingDuplicates(String text) {
		char characters[] = text.toLowerCase().toCharArray();
		int count = 0;
		int duplicate = 0;
		ArrayList<Character> arrChar = new ArrayList<Character>();
		for (int i=0;i<characters.length;i++) {
			if (!arrChar.contains(characters[i])) {
				for (int j=i+1;j<characters.length;j++) {
					if (characters[i] == characters[j]) {
						count++;
					}
					//System.out.println("i loop: " + characters[i] + " j loop: " + characters[j] + " count: " + count);
				}
				if (count > 0 ) {
					duplicate++;
				}
			}
			arrChar.add(characters[i]);
			count = 0;
		}
		return duplicate;
	}

}
