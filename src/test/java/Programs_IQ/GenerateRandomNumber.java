package Programs_IQ;

import java.util.Random;

public class GenerateRandomNumber {



	public void generateRandomNumber(){

		//random number class instance
		//Creates a new random number generator.
		Random ran =  new Random();

		//for loop that starts at zero and ends at what ever number set

		int mylimit = 2;

		for(int i=0; i<mylimit;i++){

			int number = ran.nextInt(100);

			System.out.println(number);
		}
	}
	
	public static void main(String[] args) {
		//created an instance of the class
		GenerateRandomNumber obj = new GenerateRandomNumber();

		//calling the method by using obj instance of GenerateRandomNumber class
		obj.generateRandomNumber();
		int min = 1000;
		int max = 50000;
		double result = Math.random() * ( max - min );

		System.out.println(Math.round(result));

		double weight = 1.0 / 4;

		System.out.println(weight);

	}

}
