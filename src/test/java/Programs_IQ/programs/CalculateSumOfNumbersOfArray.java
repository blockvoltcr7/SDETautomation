package Programs_IQ.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CalculateSumOfNumbersOfArray {
	
	public int calculateSumOfNumbers(){


		int[] a = {10,20,30,40};
		int sum = 0;
		for(int arr:a){
			sum = sum + arr;
		}

		return sum;
	}

	public static int calculateSumsUsingStreams(){

		List<Integer> list = Arrays.asList(1,2,4,5,6,7,8,9);
		Optional<Integer> sum =list.stream().reduce((a, b) -> a+b);
		return sum.get();
	}


	public static void main(String[] args) {
		CalculateSumOfNumbersOfArray obj = new CalculateSumOfNumbersOfArray();
		System.out.println(obj.calculateSumOfNumbers());
	}

}
