package OCA;

public class InitializeBlock {

    String name;
    {
        System.out.println("Initialize Block1");
    }

    {
        System.out.println("Initialize Block2");
    }

    public InitializeBlock(String name) {
        this.name = name;
        System.out.println(getName());
        System.out.println("Constructor");
    }

    //get name
    public String getName() {
        return name;
    }
    {
        System.out.println("Initialize Block3");
    }

    {
        System.out.println("Initialize Block4");
    }

    public static void main(String[] args) {

        InitializeBlock initializeBlock = new InitializeBlock("John");
        System.out.println(initializeBlock.getName());


    }
}
