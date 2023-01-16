package MathSolutions;

public class Truncating {


    static void change(double value, int decimalpoint)
    {

        // Using the pow() method
        value = value * Math.pow(10, decimalpoint);
        System.out.println("multiplying and using power : "+ value);
        value = Math.floor(value);
        System.out.println("flooring the value : "+ value);
        value = value / Math.pow(10, decimalpoint);
        System.out.println("dividing the value of the decimal point : "+ value);

        System.out.println("final result : "+ value);

    }

    // Main Method
    public static void main(String[] args)
    {

        double firstvalue = 1212.12131131;
        int decimalpoint = 4;

        change(firstvalue, decimalpoint);

        double secondvalue = 3.142857142857143;
        int decimalpoint2 = 3;

        change(secondvalue, decimalpoint2);
    }
}
