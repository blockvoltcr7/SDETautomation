package StringManipulation;

public class FindStringDifference {

        public static String findStringDifference(String str1, String str2) {
            StringBuilder diffBuilder = new StringBuilder();

            int minLength = Math.min(str1.length(), str2.length());

            for (int i = 0; i < minLength; i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    diffBuilder.append(str1.charAt(i)).append(" != ").append(str2.charAt(i)).append(", ");
                }
            }

            if (str1.length() > minLength) {
                diffBuilder.append(str1.substring(minLength));
            } else if (str2.length() > minLength) {
                diffBuilder.append(str2.substring(minLength));
            }

            return diffBuilder.toString();
        }

        public static void main(String[] args) {
            String str1 = "342434:S:FL:matt:F";
            String str2 = "342434:R:FL:matt:F";

            String difference = findStringDifference(str1, str2);

            System.out.println("Difference between \"" + str1 + "\" and \"" + str2 + "\": " + difference);
        }
    }


