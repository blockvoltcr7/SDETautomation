package Programs_IQ;

public class CalculateSum {

    public static void main(String[] args) {

        CalculateSum c = new CalculateSum();

        System.out.println(c.calculate());

    }


    public int calculate() {


        int[] a = {5, 5};

       int sum = 0;

        for (int i : a) {
            sum = sum + i;
        }


        return sum;
    }
}
