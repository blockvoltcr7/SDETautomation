package OCA.Exam3;


class Base {
    public void m1() {
        System.out.println("Base: m1()");
    }
}

class Derived extends Base {
    public void m1() {
        System.out.println("Derived: m1()");
    }
}

public class BaseDerivedtest {

    public static void main(String[] args) {
        Base obj = new Derived();
        obj.m1();
    }

}
