package OCA.Exam3;

public class DoWhileLoopRemainder {


    public static void main(String[] args) {
        int start = 1;  // We start counting from 1
        int sum = 0;    // We will keep adding odd numbers to this sum

        do {
            if (start % 2 == 0) {  // If the current number is even, we skip it
                continue;  // Move on to the next iteration of the loop
            }
            sum += start;  // If the current number is odd, we add it to the sum
            System.out.println("start : " + start);  // Display the current number
            System.out.println("sum : " + sum);      // Display the current sum
        } while (++start <= 10);  // We repeat this until start becomes 11

        System.out.println(sum);  // Finally, we display the total sum
    }
}
