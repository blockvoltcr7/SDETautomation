package OCA.Exam3;

public class StringConcatEqualsExample {

    /**
     * str1 == "1:ONE" is true because the compiler treats constant string concatenations as compile-time constants,
     * and it uses string interning to make them reference the same memory location as the literal string.
     *
     * str2 == "1:ONE" is false because string interning doesn't apply to the toString() conversion of an Integer object.
     * So, str2 doesn't reference the same memory location as the literal string.
     *
     * In simple terms, the first comparison returns true because of interning,
     * but the second comparison returns false because the Integer object's conversion doesn't use interning.
     * @param args
     */
    public static void main(String[] args) {
        final int i1 = 1;
        final Integer i2 = 1;
        final String s1 = ":ONE";

        String str1 = i1 + s1;
        String str2 = i2 + s1;

        System.out.println(str1 == "1:ONE");
        System.out.println(str2 == "1:ONE");

    }

}
