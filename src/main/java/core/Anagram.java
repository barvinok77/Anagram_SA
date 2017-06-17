package core;

public class Anagram {
	
	public static boolean validate(String s, String t) {
		if (s.replaceAll("\\s", "").length() != t.replaceAll("\\s", "").length()) {
			return false;
		}
		return true;
	}
}
