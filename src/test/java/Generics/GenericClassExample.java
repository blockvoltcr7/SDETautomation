package Generics;

import org.testng.annotations.Test;

class MacBookPro<Z>{
	
	Z value;
	
	public void displayType() {
		
		System.out.println(value.getClass().getName());
	}

	public Z getValue() {
		return value;
	}

	public void setValue(Z value) {
		this.value = value;
	}
	
}


public class GenericClassExample {

	
	@Test(enabled = true)
	public void testgeneric() {
		
		MacBookPro<Integer> mac2019	 = new MacBookPro<Integer>();
		mac2019.value = 2400;
		mac2019.displayType();
		
	}
	

}
