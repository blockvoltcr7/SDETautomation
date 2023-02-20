package Programs_IQ.Palindrome;

import java.util.stream.IntStream;

public class PalindromeChecker {


    public static void main(String[] args) {


        String str1 = "wise";
        String str2 = "aBBa";
        String str3 = "madam";

        System.out.println(palindromeCheckStreams(str2));
        System.out.println(isPalindrome(str3));
        System.out.println(palindromeCheckStreams(str1));


    }


    //hard way but most efficient

    /**
     * First, it converts the word to lower case using the toLowerCase method. This step is important because we want to perform a case-insensitive comparison of the characters.
     * Then, it uses Java Stream API to check if all characters in the word are equal when comparing the first character to the last character, the second character to the second-to-last character, and so on.
     * The IntStream.range method generates a stream of integers that ranges from 0 to half of the length of the lowercased word. This is because we only need to check half of the characters in the word, as the other half will be its mirror.
     * The allMatch method checks if all elements of the stream satisfy the given predicate (a function that returns a boolean value). In this case, the predicate checks if the character at the current index (i) is equal to the character at the mirror index (lowerCasedStr.length() -i -1).
     * If all characters are equal, the allMatch method returns true, which means the word is a palindrome. If any of the characters are not equal, the allMatch method returns false, indicating that the word is not a palindrome.
     * So in essence, this function returns true if the word is a palindrome anThen, it uses  false otherwise.
     *
     *
     *
     * Regenerate response
     * @param word
     * @return
     */
    public static boolean palindromeCheckStreams(String word){

        String lowerCasedStr = word.toLowerCase();

        return IntStream.range(0, lowerCasedStr.length() / 2)
                .allMatch(i -> lowerCasedStr.charAt(i) == lowerCasedStr.charAt(lowerCasedStr.length() -i -1));

    }

    //easy way of doing palindrome

    /**
     * In this code, we first reverse the word using the reverse() method of the StringBuilder class.
     * Then we compare the reversed word with the original word using the equals method.
     * If both words are equal, the word is a palindrome, and the method returns true.
     * If the words are not equal, the method returns false.
     * @param word
     * @return
     */
    public static boolean isPalindrome(String word) {
        StringBuilder reverseWord = new StringBuilder(word).reverse();
        return word.equals(reverseWord.toString());
    }


}
