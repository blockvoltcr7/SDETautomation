package OCA.Exam3;

public class DecrementIncrementMath {


    /**
     * int a = 20;: Initializes the variable a with the value 20.
     *
     * int var = --a * a++ + a-- - --a;:
     *
     * --a: Decrements a by 1, so a becomes 19. The value of this expression is 19.
     * a++: The value of a (which is now 19) is used in the multiplication, and then a is incremented by 1, so a becomes 20. The value of this expression is 19.
     * a--: The value of a (which is still 20) is used in the addition, and then a is decremented by 1, so a becomes 19 again. The value of this expression is 20.
     * --a: Decrements a by 1, so a becomes 18. The value of this expression is 18.
     * The calculations can be simplified as follows:
     * 19 * 19 + 20 - 18
     *
     * Multiplication: 19 * 19 = 361
     * Addition: 361 + 20 = 381
     * Subtraction: 381 - 18 = 363
     * System.out.println("a = " + a);: Prints the value of a, which is now 18.
     *
     * System.out.println("var = " + var);: Prints the value of var, which is 363.
     *
     * In summary, after evaluating the expression, the variable a becomes 18, and the variable var is assigned the value 363.
     * The math involves decrementing and incrementing a and performing multiplication, addition, and subtraction operations based on
     * the current value of a.
     * @param args
     */
    public static void main(String[] args) {

        int a = 20;
        int var = --a * a++ + a-- - --a;
        System.out.println("a = " + a);
        System.out.println("var = " + var);

    }
}
