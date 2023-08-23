package OCA.Exam1.ClassesJavaAPI;

public class Q5BankSwiftCodeSubString {


    public static void main(String[] args) {
        String swiftCode = "ICICINBBRT4";

        /**
         * A bank's swift code is generally of 11 characters and used in international money transfers.
         * An example of swift code: ICICINBBRT4
         * ICIC: First 4 letters for bank code
         * IN: Next 2 letters for Country code
         * BB: Next 2 letters for Location code
         * RT4: Next 3 letters for Branch code
         *
         * Which of the following code correctly extracts country code from the swift code referred by String reference variable swiftCode?
         */

        //I C I C I N B B R T 4
        //0 1 2 3 4 5 6 7 8 9 10

        System.out.println(swiftCode.substring(4, 6)); // IN
        System.out.println(swiftCode.substring(4, 5)); // BB
        System.out.println(swiftCode.substring(3, 6)); // CIN

        /**
         * Explanation
         * substring(int beginIndex, int endIndex) is used to extract the substring.
         * The substring begins at "beginIndex" and extends till "endIndex - 1".
         *
         * Country code information is stored at index 4 and 5,
         * so the correct substring method to extract country code is: swiftCode.substring(4, 6);
         */

    }
}
