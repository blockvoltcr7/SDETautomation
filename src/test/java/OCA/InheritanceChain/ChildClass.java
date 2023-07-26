package OCA.InheritanceChain;

public class ChildClass extends IntermediateClass {
    public static String childStaticVar = "ChildStaticVar";

    static {
        System.out.println("Child Static Block: " + childStaticVar);
    }

    public String childInstanceVar = "ChildInstanceVar";

    {
        System.out.println("Child Instance Block: " + childInstanceVar);
    }

    public ChildClass() {
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {
        ChildClass child = new ChildClass();
    }
}
// Output:
// Base Static Block: BaseStaticVar
// Intermediate Static Block: IntermediateStaticVar
// Child Static Block: ChildStaticVar
// Base Instance Block: BaseInstanceVar
// Base Constructor
// Intermediate Instance Block: IntermediateInstanceVar
// Intermediate Constructor

//explanation
// The static blocks are executed in the order of the inheritance chain, from the top to the bottom.
// The instance blocks are executed in the order of the inheritance chain, from the top to the bottom.
// The constructors are executed in the order of the inheritance chain, from the top to the bottom.
// The instance variables are initialized in the order of the inheritance chain, from the top to the bottom.
// The static variables are initialized in the order of the inheritance chain, from the top to the bottom.
// The static blocks are executed only once, when the class is loaded.
// The instance blocks are executed every time when a new instance of the class is created.
// The constructors are executed every time when a new instance of the class is created.
// The instance variables are initialized every time when a new instance of the class is created.
// The static variables are initialized only once, when the class is loaded.
// The static blocks are executed before the instance blocks.
// The instance blocks are executed before the constructors.
// The constructors are executed before the instance variables are initialized.
// The instance variables are initialized before the static variables are initialized.
// The static variables are initialized before the main method is executed.
// The main method is executed before the other methods are executed.
// The other methods are executed before the instance variables are used.
// The instance variables are used before the static variables are used.
// The static variables are used before the instance blocks are used.
// The instance blocks are used before the constructors are used.
// The constructors are used before the other methods are used.
// The other methods are used before the main method is used.
// The main method is used before the static blocks are used.


