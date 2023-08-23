package OCA;

public class ChainingContructor {


    int age = 0;

    public ChainingContructor(int age) {
        this.age = age;
        System.out.println("One-arg constructor");
    }

    public ChainingContructor() {
        this(10);
        System.out.println("No-arg constructor");
    }


    public static void main(String[] args) {

        ChainingContructor chainingContructor = new ChainingContructor();
        System.out.println(chainingContructor.age);

    }
}
