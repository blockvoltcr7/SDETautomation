package OCA.Exam1.ClassesJavaAPI;

public class Q20StringBuilderEquals {

    public static void main(String[] args) {
            StringBuilder sb = new StringBuilder("Java");
            String s1 = sb.toString();
            String s2 = sb.toString();

            System.out.println(s1 == s2);

    }


    /**
     * StringBuilder sb = new StringBuilder("Java");: You create a StringBuilder object sb initialized with the value "Java".
     *
     * String s1 = sb.toString();: You convert the StringBuilder sb to a String and assign it to the variable s1.
     *
     * String s2 = sb.toString();: Similarly, you convert the StringBuilder sb to a String and assign it to the variable s2.
     *
     * System.out.println(s1 == s2);: The == operator compares the references of s1 and s2. Since s1 and s2 are separate String objects created using sb.toString(), the comparison evaluates to false.
     *
     * When you use the == operator to compare objects, it checks if the references to the objects are the same, rather than comparing the content of the strings.
     *
     * To compare the content of the strings, you should use the equals() method. So, s1.equals(s2) would give you the expected result of true, as it compares the actual string values.
     *
     * Therefore, to compare the content of s1 and s2, you should use s1.equals(s2) instead of s1 == s2.
     */

    /**
     * Explanation
     * The == operator compares the references of s1 and s2. Since s1 and s2 are separate String objects created using sb.toString(), the comparison evaluates to false.
     * So both s1 and s2 refer to different String instances even though their contents are same. s1 == s2 returns false.
     */
}
