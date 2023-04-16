package CapitalizeFirstLetter;

import java.util.List;

public class CapitalizeFirstLetter {

	public static void main(String[] args) {
		String phrase = "most trees are blue";
		String phraseConversion = toJadenCase(phrase);
		System.out.println("phrase: " + phraseConversion);
	}

	public static String toJadenCase(String phrase) {
		if (phrase == null) {
			return null;
		} else if (phrase.isEmpty()) {
			return null;
		} else {
			String[] phrase2Words = phrase.split(" ");
			StringBuilder builder = new StringBuilder();
			String word = null;
			for (int i=0;i<phrase2Words.length;i++) {
				word = phrase2Words[i];
				word.toLowerCase();
				word = word.isEmpty() ? word : Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase() + " ";
				builder.append(word);
			}
			
			return builder.toString().trim();
		}
		
	}

}
