package OCA.InheritanceChain;

public class IntermediateClass extends BaseClass {
    public static String interStaticVar = "IntermediateStaticVar";

    static {
        System.out.println("Intermediate Static Block: " + interStaticVar);
    }

    public String interInstanceVar = "IntermediateInstanceVar";

    {
        System.out.println("Intermediate Instance Block: " + interInstanceVar);
    }

    public IntermediateClass() {
        System.out.println("Intermediate Constructor");
    }
}
