package OCA.VarargsExample;

public class VarargsExample {

    //varargs is a method that takes a variable number of arguments of the same type (or subtype) and treats them as an array of that type


    public static void main(String[] args) {

        myMethodTakesAlotOfArguments(1,2,3,4,5,6,7,8,9,10);
        myMethodTakesAlotOfArguments(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);


    }

    public static void myMethodTakesAlotOfArguments(int... numbers){

        for(int i : numbers){
            System.out.println(i);
        }


    }
}
