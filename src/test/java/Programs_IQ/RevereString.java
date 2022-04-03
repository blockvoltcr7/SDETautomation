package Programs_IQ;

import org.testng.annotations.Test;

public class RevereString {

	
	@Test(enabled = true, priority = 1)
	public void reverseStringTest1() {
		
		reverseStringRecommended();
		//reverseStringEasyWay();
	}
	
	@Test(enabled = true, priority = 1)
	public void reverseStringTest2() {
		
		reverseStringEasyWay();
	}
	 static void reverseStringRecommended() {
		
		String word = "SDETautomation";
		
		String emptyString = "";
		
		int word_length = word.length(); //14 chars

		for(int i = word_length-1; i>=0;i--) {//want to start at index 13 but word length has a length of 14. 
			emptyString = emptyString + word.charAt(i);
		}
		
		String reversedWord = emptyString;
		System.out.println(reversedWord);
		
	}
	
	 static void reverseStringEasyWay() {
		 
		 
		 String word = "API_Tester";
		 StringBuffer buffer = new StringBuffer(word);
		 StringBuffer reversedWord = buffer.reverse();
		 System.out.println(reversedWord);
		 
		 
	 }
	
	
}
