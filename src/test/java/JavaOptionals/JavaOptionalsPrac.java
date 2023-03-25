package JavaOptionals;

import java.util.Optional;

public class JavaOptionalsPrac {

    /**
     * In Java, an Optional is a container object which may or may not contain a non-null value.
     * It is used to represent a value that may be absent, to help prevent null pointer exceptions.
     *
     * Using Optional can make your code more readable and easier to understand,
     * as it explicitly states that a value may not be present. It also provides a number of useful methods for
     * working with absent values, such as isPresent(), orElse(), and orElseGet().
     *
     * One common use case for Optional is in methods that can return null,
     * which can be difficult to work with and can lead to null pointer exceptions if not handled correctly.
     * By returning an Optional instead of a nullable value,
     * the caller of the method is forced to handle the possibility of a missing value.
     *
     * In Java 8, Optional was introduced as a part of the new Stream API to improve the functionality of
     * functional style operations and also to prevent null pointer exceptions.
     *
     * In summary, Optional is a Java class which is used to handle null in a more elegant way.
     * It is a container object which may or may not contain a non-null value,
     * and it is used to represent a value that may be absent.
     * It helps to make the code more readable and easy to understand and also prevent null pointer exceptions.
     * @param args
     */

    public static void main(String[] args) {


        Optional<String> emptyOpt = Optional.empty();
        Optional<String> nameOpt = Optional.of("Kathryn");

        if(emptyOpt.isEmpty()){
            System.out.println("hi "+ nameOpt.get());
        }else{
            System.out.println("hi its not empty");
        }

        if(emptyOpt.isPresent()){
            System.out.println("hi "+ nameOpt.get());
        }else{
            System.out.println("hi its not present");
        }

        Optional<Integer> data = Optional.of(3123);

        System.out.println(data.get() +" "+ data.orElse(0));


        String name = null;
        Optional<String> optionalName = Optional.ofNullable(name);

        String defaultName = "Unknown";
        String returnedName = optionalName.orElseGet(() -> defaultName);

        System.out.println(returnedName);
        


    }
}
