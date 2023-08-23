package OCA.Exam3;

public class StringCharMango {


    public static void main(String[] args) {
        String fruit = new String(new char[]{'M', 'a', 'n', 'g', 'o'});

        switch (fruit) {
            case "Apple":
                System.out.println("Apple");
                break;
            case "Mango":
                System.out.println("Mango");
                break;
            case "Banana":
                System.out.println("Banana");
                break;
            default:
                System.out.println("default");
        }
    }
}
