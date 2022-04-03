package Programs_IQ;

public class Recursion {


    public static void main(String[] args) {

    reduceByOne(10);

    }

    public static void reduceByOne(int n){

        if(n>=0){
            reduceByOne(n-1);
            System.out.println(n);
        }
    }
}
