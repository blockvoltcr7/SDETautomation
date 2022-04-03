package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Collection {
	
	 static Set<String> s1 = new HashSet<String>();  
	 static Set<String> s2 = new LinkedHashSet<String>();  
	 static Set<String> s3 = new TreeSet<String>(); 
	
	
	
	public static void main(String[] args) {

		s1.add("tommy");
		s1.add("tommy");
		s1.add("tommy");
		s1.add("tommy");
		s1.add("tommy");

		Iterator<String> s = s1.iterator();
	     while(s.hasNext()){
	        System.out.println(s.next());
	     }
		
	}

}
