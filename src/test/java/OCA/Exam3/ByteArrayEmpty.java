package OCA.Exam3;

public class ByteArrayEmpty {


    /**
     * Tries to access the first element of the empty array, which doesn't exist.
     * This causes an "ArrayIndexOutOfBoundsException" because the array has no elements.
     * In simple terms, the code creates an empty array and then tries to read an element that isn't there, causing an error.
     * @param args
     */
    public static void main(String[] args) {
        byte[] bytes = new byte[0];
        System.out.println(bytes.length);
        System.out.println(bytes[0]);

    }
}
