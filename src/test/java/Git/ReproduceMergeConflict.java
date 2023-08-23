package Git;

public class ReproduceMergeConflict {


    public static void main(String[] args) {

        String[] names = {"John", "Mary", "Bob"};
        String name = "Mary";
        boolean found = findName(names, name);
        if (found) {
            System.out.println(name + " is in the array.");
        } else {
            System.out.println(name + " is not in the array.");
        }

    }


    //find name in an array function
    public static boolean findName(String[] names, String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) {
                return true;
            }
        }
        return false;
    }
}
