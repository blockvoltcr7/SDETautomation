package Programs_IQ.programs;

public class BubbleSort {


    public static void main(String[] args) {

        int[] arr = {7,1,2,8,6,3,4,9};

        sortArray(arr);

    }

    public static void sortArray(int[] arr){

        int temporaryVariable;

        //arr.length-1 allows us to start at the end of the length of the array
        for(int i = arr.length-1; i>0; i--){

            System.out.println("outer loop iteration "+ i);

            for(int t = 0; t<i; t++){

                System.out.println("inner loop iteration: "+t);
                if(arr[t] > arr[t+1]){
                    System.out.println("before swap :  arr[t] : "+ arr[t] +" --- arr[t+1] "+ arr[t+1]);
                    temporaryVariable = arr[t];

                    arr[t] = arr[t+1];
                    arr[t+1] = temporaryVariable;
                    System.out.println("swap success -- "+"arr[t] : "+ arr[t] +" --- arr[t+1] "+ arr[t+1]);

                }

            }
        }

        System.out.println("------ after sorting ------");
        for(int i : arr){
            System.out.println(i);
        }
    }


}
