package Programs_IQ;

public class FindHighestNumber {

    public static void main(String[] args) {

        int arr[]= {4,2,1,5,6,7,9,2};
        int x = 0;

        for(int i = 0;i<arr.length; i++){
            if(x<arr[i]){
                x=arr[i];
            }
        }
        System.out.println(x);
    }

}
