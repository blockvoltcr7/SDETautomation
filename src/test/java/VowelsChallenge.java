public class VowelsChallenge {


    public static void main(String[] args) {



    }


    /**
     * In this code, we first define a string of vowels vowels that includes both uppercase and lowercase vowels.
     * Then, we use a for loop to iterate through each character in the word.
     * For each character, we use the indexOf method to check if it's a vowel.
     * If the index is not -1, it means the character is a vowel, and the function returns true.
     * If the loop finishes without finding any vowels, the function returns false.
     * @param word
     * @return
     */
    public static boolean hasVowels(String word) {
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < word.length(); i++) {
            if (vowels.indexOf(word.charAt(i)) != -1) {
                return true;
            }
        }
        return false;
    }


    /**
     * This function works similarly to the previous one, but it uses Java streams instead of a for loop.
     *
     * First, it defines the string of vowels vowels that includes both uppercase and lowercase vowels.
     * Then, it uses the chars method to generate a stream of integers representing the characters in the word.
     * The anyMatch method checks if any element of the stream satisfies the given predicate (a function that returns a boolean value). In this case, the predicate checks if the character at the current index is a vowel.
     * If any character is a vowel, the anyMatch method returns true, which means the word has vowels. If no characters are vowels, the anyMatch method returns false, indicating that the word doesn't have vowels.
     * @param word
     * @return
     */
    public static boolean hasVowelsWithStreams(String word) {
        String vowels = "aeiouAEIOU";
        return word.chars().anyMatch(c -> vowels.indexOf(c) != -1);
    }
}


