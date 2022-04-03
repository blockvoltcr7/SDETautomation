package Programs_IQ;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class CountDuplicateLetters {


	public static void main(String[] args) {
		CountDuplicateLetters c = new CountDuplicateLetters();
		c.countDuplicateLetters();
	}
	
	public void countDuplicateLetters() {
		/*
		 * this program is counting how many duplicate letters are in the str String object
		 * there is 2 p's and 3 e's everything else is just 1
		 * 
		 * We are splitting the string into seperate characters  p e o p l e n t e c h and putting it in a array of type char
		 */
		
	    String str = "ineedpizzanow";
	    
	    Map<Character, Integer> charMap = new HashMap<Character, Integer>(); //character as key , integer as value
	    
	    char arr[] = str.toCharArray();//converting arr string to Char array

	    for (char value : arr) { //for each letter in arr as char array  which is "peoplentech"
	    	
	    	System.out.println("char value is :: "+value);

	       if (Character.isAlphabetic(value)) { //if character is alphabetic
	           if (charMap.containsKey(value)) { //if hashmap charMap contains a key
	               charMap.put(value, charMap.get(value) + 1); //put the value and increment the value integer by 1 

	               /*
	                * basically this is adding a integer to the key's value every iteration.
	                * notice the the condition if(charmap.containsKey(value)) then put a +1 to the key value.
	                */
	           } else {
	        	   
	               charMap.put(value, 1);
	           }
	       }
	    }

	    System.out.println("Char Map : "+charMap);
	}
	

}
