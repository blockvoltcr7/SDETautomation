package Programs_IQ.programs;

import java.util.ArrayList;

public class IsPrime {


    public static void main(String[] args) {

        int[] intArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        isPrime(intArray);
        int primeNumber = 8;
        boolean isPrime = isPrime(primeNumber);

        if(!isPrime){
            System.out.println(primeNumber+" is not prime");
        }else{
            System.out.println(primeNumber+" is a prime number");
        }


    }

    public static ArrayList<Integer> isPrime(int[] arr){

        //if the value in the array is

        return null;
    }


    public static boolean isPrime(int n){

        //loop over the size of the number until index is greater than the number we are checking is prime
        for(int i = 2; i < n; i++){

            if (n % i == 0){
                return false;
            }
        }

        return true;
    }
}
