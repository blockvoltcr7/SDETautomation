package OCA.Exam3;


import java.util.ArrayList;
import java.util.List;

interface Sellable {}
abstract class Animal {}

class Mammel extends Animal{}
class Rabbit extends Mammel implements Sellable{}


public class InitializerBlockErrors {
    {
        List<Animal> list = new ArrayList<>();
        list.add(new Rabbit());
    }

    {
        List<Animal> list = new ArrayList<>();
        list.add(new Mammel());
    }

    {
        List<Mammel> list = new ArrayList<>();
        list.add(new Rabbit());
    }

    //this will return an error because Mammel class does not implement Sellable
//    {
//        List<Sellable> list = new ArrayList<>();
//        list.add(new Mammel());
//    }

    {
        List<Sellable> list = new ArrayList<>();
        list.add(new Rabbit());
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

}
