package core;

public class App {
    
	public static void main( String[] args ) {
        System.out.println( "Debit Card and Bad credit is anagram? - " + Anagram.validate("Debit Card", "Bad Credit"));
        System.out.println( "Охренеть and Не хрена себе is anagram? - " + Anagram.validate("Охренеть", "Не хрена себе"));
    }
	
	private String checkStrValue = null;
	public App() {
		this.checkStrValue = "SoneValue";
	}
	
	private void executeSomeConditions() {
		if ("SomeValue".equals(this.checkStrValue)) {
			
		} else if ("SomeValue".equals(this.checkStrValue)) {
			
		}
	}
	
	private static void incorrectAssignmentInIfCondition() {
		boolean value = false;
		if (value = true) {
	
		} else {
			
		}
	}
}
