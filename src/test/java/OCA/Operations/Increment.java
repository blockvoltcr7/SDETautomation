package OCA.Operations;

public class Increment {

    public static void main(String[] args) {

        int x = 0;
        System.out.println("x = " + x++); //this will print 0 and then increment x, the old value is returned and printed first and then x is incremented by 1
        System.out.println("x = " + x);
        System.out.println("x = " + ++x); //this will increment x and then print it, the new value is returned and printed first and then x is incremented by 1
        System.out.println("x = " + x);
        System.out.println("x = " + x--); //this will print x and then decrement it, the old value is returned and printed first and then x is decremented by 1
        System.out.println("x = " + x);
        System.out.println("x = " + --x); //this will decrement x and then print it, the new value is returned and printed first and then x is decremented by 1
        System.out.println("x = " + x);


    }
}
