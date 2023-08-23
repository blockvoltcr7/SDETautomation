package StringManipulation;

public class FindStringDifferenceCount {

     public static int calculateLevenshteinDistance(String str1, String str2) {
            int[][] dp = new int[str1.length() + 1][str2.length() + 1];

            for (int i = 0; i <= str1.length(); i++) {
                dp[i][0] = i;
            }

            for (int j = 0; j <= str2.length(); j++) {
                dp[0][j] = j;
            }

            for (int i = 1; i <= str1.length(); i++) {
                for (int j = 1; j <= str2.length(); j++) {
                    int cost = (str1.charAt(i - 1) != str2.charAt(j - 1)) ? 1 : 0;
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j] + 1, dp[i][j - 1] + 1), dp[i - 1][j - 1] + cost);
                }
            }

            return dp[str1.length()][str2.length()];
        }

        public static void main(String[] args) {
            String str1 = "Hello";
            String str2 = "Helss";

            int difference = calculateLevenshteinDistance(str1, str2);

            System.out.println("Difference between \"" + str1 + "\" and \"" + str2 + "\": " + difference);
        }
    }


