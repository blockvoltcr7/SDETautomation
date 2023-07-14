package OCA.Exam1.ClassesJavaAPI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

class Q2EmployeeLambda {
    private String name;
    private int age;
    private double salary;

    public Q2EmployeeLambda(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return name;
    }
}

class Test {
    public static void main(String [] args) {
        List<Q2EmployeeLambda> list = new ArrayList<>();
        list.add(new Q2EmployeeLambda("James", 25, 15000));
        list.add(new Q2EmployeeLambda("Lucy", 23, 12000));
        list.add(new Q2EmployeeLambda("Bill", 27, 10000));
        list.add(new Q2EmployeeLambda("Jack", 19, 5000));
        list.add(new Q2EmployeeLambda("Liya", 20, 8000));

//        process(list, /*INSERT*/);
        process(list, (e) -> { return e.getSalary() >= 10000; });
        process(list, e -> { return e.getSalary() >= 10000;});
        process(list, (Q2EmployeeLambda e) -> { return e.getSalary() >= 10000; });
        process(list, e -> e.getSalary() >= 10000);

        System.out.println(list);
    }

    private static void process(List<Q2EmployeeLambda> list, Predicate<Q2EmployeeLambda> predicate) {
        Iterator<Q2EmployeeLambda> iterator = list.iterator();
        while(iterator.hasNext()) {
            if(predicate.test(iterator.next()))
                iterator.remove();
        }
    }

/**
 * Jack's salary is 5000 and Liya's salary is 8000. If Employee's salary is >= 10000 then that Employee object is removed from the list.
 *
 *
 *
 * Allowed lambda expression is:
 *
 * (Employee e) -> { return e.getSalary() >= 10000; },
 *
 * Can be simplified to:  (e) -> { return e.getSalary() >= 10000; } => type can be removed from left side of the expression.
 *
 * Further simplified to: e -> { return e.getSalary() >= 10000; } => if there is only one parameter in left part, then round brackets (parenthesis) can be removed.
 *
 * Further simplified to: e -> e.getSalary() >= 10000 => if there is only one statement in the right side then semicolon inside the body, curly brackets and return statement can be removed. But all 3 [return, {}, ;] must be removed together.
 *
 *
 *
 * NOTE: there should not be any space between - and > of arrow operator. *****IMPORTANT*****
 *
 *
 */


}