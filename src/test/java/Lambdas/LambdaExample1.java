package Lambdas;

import java.util.function.Supplier;


@FunctionalInterface
interface Abilities{

    public void leap();
}


@FunctionalInterface
interface Sleep{

    public void sleepAmountAndTime(String sleepAmount, String timeToSleep);

}


//class Test implements Sleep {
//
//
//    @Override
//    public void sleepAmountAndTime(String sleepAmount, String timeToSleep) {
//        System.out.println("i get about "+sleepAmount+" each day and i like to sleep around "+ timeToSleep);
//    }
//}

public class LambdaExample1 {


    /**
        lambdas dont belong to a class
        they are just functions that exists in isolation
        the functions can be treated as values
     assigning a block of code to a value?
     piece of code that becomes a value and gets assigned to a variable and where ever it goes, a piece of code goes with it
     take method and assign it to a variable
     the method becomes a thing that gets assigned to a variable
     lambda function is a unanimous function
     can be nameless function
     no return type
     no access modifier
     */

    static Animal dolphin = new Animal("jerry", 1,2, "sardines");


    public static void main(String[] args) {

        System.out.println("hi my name is "+ dolphin.getName()+", i have "+ dolphin.getNumberOfArms()+" arms" +
                " and "+ dolphin.getNumberOfLegs()+" leg but realy its a tail and the scientific word for it is called a fluke :) " +
                "and i love to eat "+dolphin.getFoodIlove());

        dolphin.setEyeColor("baby blue");
        System.out.println("i forgot to mention that my eyes are "+ dolphin.getEyeColor());

        Abilities abilities = () -> System.out.println("wahoo im leaping out of the water!!! splash");

        abilities.leap();

        Sleep sleep = (String sleepTime, String sleepAmount) -> System.out.println("i get about "+sleepAmount+" each day and i like to sleep around "+ sleepTime);
        sleep.sleepAmountAndTime("4am","4");


    }


    static class Animal {

        String name;
        int numberOfLegs;
        int numberOfArms;
        String foodIlove;
        String eyeColor;



        public Animal(String name, int numberOflegs, int numberOfArms, String foodILove){
            this.name = name;
            this.numberOfArms = numberOfArms;
            this.numberOfLegs = numberOflegs;
            this.foodIlove = foodILove;
        }

        public String getEyeColor() {
            return eyeColor;
        }

        public void setEyeColor(String eyeColor) {
            this.eyeColor = eyeColor;
        }

        public String getName() {
            return name;
        }

        public int getNumberOfLegs() {
            return numberOfLegs;
        }

        public int getNumberOfArms() {
            return numberOfArms;
        }

        public String getFoodIlove() {
            return foodIlove;
        }




    }

}
