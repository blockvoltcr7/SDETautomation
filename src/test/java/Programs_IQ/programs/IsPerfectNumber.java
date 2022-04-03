package Programs_IQ.programs;

public class IsPerfectNumber {



	public static void main(String[] args) {


		IsPerfectNumber obj = new IsPerfectNumber();

		boolean b = obj.isPerfectNumber(6);

		System.out.println(b);
	}


	public boolean isPerfectNumber(int number){

		int temp = 0;

		for(int i = 1; i<=number/2; i++){


			if(number % i == 0){

				System.out.println("i----"+i);
				temp = temp + i;
				System.out.println(temp);
			}
		}

		if(number == temp){
			return true;
		}
		return false;
		
	}


}
