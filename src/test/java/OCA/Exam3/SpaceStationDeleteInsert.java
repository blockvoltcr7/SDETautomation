package OCA.Exam3;

public class SpaceStationDeleteInsert {


    /**
     * StringBuilder sb = new StringBuilder("SpaceStation");: Creates a StringBuilder object containing the string "SpaceStation".
     *
     * sb.delete(5, 6).insert(5, " S"): Deletes the character at index 5 (which is 'S') and inserts the string " S" at index 5. The content of the sb StringBuilder object becomes "Space Station".
     *
     * .toString(): Converts the StringBuilder content to a string. However, this result is not captured or assigned back to any variable. The content of the sb object remains "Space Station".
     *
     * .toUpperCase(): Converts the entire string to uppercase. However, this result is also not captured or assigned back to any variable.
     *
     * System.out.println(sb);: Prints the content of the sb StringBuilder object, which is "Space Station".
     *
     * In summary, the code indeed modifies the sb StringBuilder object's content to "Space Station" by inserting a space between "Space" and "Station". However, the modifications are not captured by toUpperCase() or assigned back to a variable. Therefore, the correct final output is "Space Station".
     *
     * @param args
     */
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("SpaceStation");
        sb.delete(5, 6).insert(5, " S").toString().toUpperCase();
        System.out.println(sb);
    }
}
