package OCA.InheritanceChain;

public class BaseClass {
    public static String baseStaticVar = "BaseStaticVar";

    static {
        System.out.println("Base Static Block: " + baseStaticVar);
    }

    public String baseInstanceVar = "BaseInstanceVar";

    {
        System.out.println("Base Instance Block: " + baseInstanceVar);
    }

    public BaseClass() {
        System.out.println("Base Constructor");
    }
}
