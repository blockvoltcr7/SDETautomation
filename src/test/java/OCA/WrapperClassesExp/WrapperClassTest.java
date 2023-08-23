package OCA.WrapperClassesExp;

import java.util.ArrayList;
import java.util.List;

public class WrapperClassTest {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();;

        Integer wrapint = Integer.valueOf(7);
        System.out.println(wrapint);
        int j = 7;
        numbers.add(Integer.valueOf(j));
        numbers.add(j); //autoboxing

        //to get primative back out of the wrapper class, call the <type>Value() method
        int k = numbers.get(0).intValue();
        int l = numbers.get(1); //unboxing

        Integer wrapInt = Integer.valueOf(7);
        int x = wrapInt.intValue();
        Character wrapChar = Character.valueOf('c');
        char ch = wrapChar.charValue();
        System.out.println(ch);
        System.out.println(x);

    }
}
