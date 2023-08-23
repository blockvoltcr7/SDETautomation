package OCA.Exam3;


/**
 * This code works because when you create an instance of a class using new ClassName(), you are invoking the constructor of that class.
 * In this case, when you call new Sub(); in the main method, you are creating an instance of the Sub class.
 *
 * However, the constructors of classes are designed to follow an inheritance chain. In other words,
 * when a subclass constructor is called, it implicitly calls the constructor of its superclass before its own code runs.
 * This is a fundamental concept in object-oriented programming known as constructor chaining.
 *
 * Here's what happens step by step:
 *
 * When you call new Sub();, it calls the constructor of the Sub class.
 * Inside the Sub class constructor, before the System.out.println("Sub"); line,
 * the constructor of the superclass (Super in this case) is automatically invoked.
 * The superclass constructor public Super() prints "Super".
 * After the superclass constructor completes, the Sub constructor continues executing, and it prints "Sub".
 * So, even though you didn't explicitly create an instance name for new Sub();, the constructors of both the superclass and
 * subclass are invoked in sequence due to inheritance and constructor chaining.
 * This is why you see both "Super" and "Sub" printed when you run the code.
 *
 * This behavior is a key feature of object-oriented programming,
 * where subclasses build upon the behavior of their superclasses through inheritance and method overriding.
 */

class Super {
    public Super() {
        System.out.println("100");
    }
}

class Sub extends Super {
    public Sub() {
        System.out.println("200");
    }
}

public class SuperSubClassInstantiateWithoutInstanceName {



    public static void main(String[] args) {

        new Sub();

    }
}
