package Programs_IQ.programs;

import java.util.HashMap;

public class CountNumberInArray {
	
	public static void main(String[] args) {

		int[] a = {355,655,677};
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i =0; i<a.length; i++){
			char[] charr = String.valueOf(a[i]).toCharArray();

			for(int t =0; t<charr.length; t++){

				if(map.containsKey(charr[t])){
					map.put(charr[t], map.get(charr[t])+1);
				}
				else{
					map.put(charr[t], 1);
				}
			}
		}
		System.out.println(map);
		
	}

}
