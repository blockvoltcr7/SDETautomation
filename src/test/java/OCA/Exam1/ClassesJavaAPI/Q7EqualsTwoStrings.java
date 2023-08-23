package OCA.Exam1.ClassesJavaAPI;

public class Q7EqualsTwoStrings {

    public static void main(String[] args) {
            String s1 = "OCAJP";
            String s2 = "OCAJP" + "";
            System.out.println(s1 == s2);

    }

    /**
     * In the given code, s1 and s2 both have the value "OCAJP". Although s2 is created by concatenating an empty string,
     * the compiler combines "OCAJP" and "" during compilation, resulting in the same value.
     *
     * When comparing s1 and s2 using ==, it checks if they refer to the exact same memory location.
     * In this case, the compiler optimizes the code and makes s1 and s2 refer to the same memory location, known as the String pool.
     *
     * So, s1 and s2 point to the same underlying string in memory.
     * As a result, the comparison s1 == s2 evaluates to true.
     *
     * It's important to remember that for comparing the actual content of strings,
     * it's generally recommended to use the equals() method instead of ==.
     *
     * Explanation
     * Please note that Strings computed by concatenation at compile time,
     * will be referred by String Pool during execution.
     * Compile time String concatenation happens when both of the operands are compile time constants,
     * such as literal, final variable etc.
     *
     *
     *
     * For the statement, String s2 = "OCAJP" + "";, `"OCAJP" + ""` is a constant expression
     * as both the operands "OCAJP" and
     * "" are String literals, which means the expression `"OCAJP" + ""` is computed at compile-time and
     * results in String literal "OCAJP".
     *
     * So, during compilation, Java compiler translates the statement
     *
     * String s2 = "OCAJP" + "";
     *
     * to
     *
     * String s2 = "OCAJP";
     *
     * As "OCAJP" is a String literal, hence at runtime it will be referred by String Pool.
     *
     *
     *
     * When Test class is executed,
     *
     * s1 refers to "OCAJP" (String Pool object).
     *
     * s2 also refers to same String pool object "OCAJP".
     *
     * s1 and s2 both refer to the same String object and that is why s1 == s2 returns true.
     *
     *
     *
     * Please note that Strings computed by concatenation at run time (if the resultant expression is not
     * constant expression) are newly created and therefore distinct.
     *
     * For below code snippet:
     *
     * String s1 = "OCAJP";
     * String s2 = s1 + "";
     * System.out.println(s1 == s2);
     * Output is false, as s1 is a variable and `s1 + ""` is not a constant expression,
     * therefore this expression is computed only at runtime and a new non-pool String object is created.
     */
}
