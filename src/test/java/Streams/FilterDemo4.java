package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

public class FilterDemo4 {


    static class Product{

        int id;
        String name;
        double price;

        public Product(int id, String name, double price){

            this.id = id;
            this.name = name;
            this.price = price;

        }


    }




    public static void main(String[] args) {

        //collection with objects of product class

        List<Product> productList = new ArrayList<>(); //collection that holds products

        productList.add(new Product(1,"mac", 1600));
        productList.add(new Product(2,"hp", 1500));
        productList.add(new Product(3,"sony", 900));
        productList.add(new Product(4,"bose", 400));
        productList.add(new Product(5,"nintendo", 300));
        productList.add(new Product(6,"playstation", 600));


        //return all the products that have a price greater than 1000
        productList.stream().filter(p -> p.price > 1000).forEach(pr -> System.out.println(pr.name + " | " + pr.price));






    }

}
