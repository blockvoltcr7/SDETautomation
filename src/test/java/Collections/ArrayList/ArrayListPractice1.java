package Collections.ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice1 {


    public static void main(String[] args) {

        ArrayList<String> stockslist = arrayListAndLoop();

        for(int i = 0; i<stockslist.size();i++){

            if(stockslist.get(i).toString().equalsIgnoreCase("AAPL")){
                stockslist.remove(i);
            }

        }

        if(stockslist.contains("AAPL")){
            System.out.println("true, AAPL is not in the list");
        }else{
            System.out.println("false, AAPL is not in the list");

            if(stockslist.contains("SPOT")){
                System.out.println("true, SPY is in the list");
            }
        }

        stockslist.add("CRWD");

        System.out.println(stockslist.get(0));

        System.out.println(stockslist.get(9));

        Iterator itr = stockslist.iterator();

        while (itr.hasNext()){
            System.out.println("stock: "+itr.next());
        }

        ArrayList<String> stockListMyFavorites = new ArrayList<>();

        stockListMyFavorites.addAll(stockslist);

        for(String s : stockListMyFavorites){
            System.out.println("new stock favorite list "+ s);
        }


       int arrayListSize = stockListMyFavorites.size();

        System.out.println("arraylist size is :"+ arrayListSize);

       boolean isArrayListEmpty = stockListMyFavorites.isEmpty();

        System.out.println("is my list empty? : "+ isArrayListEmpty);

        stockListMyFavorites.clear();

        isArrayListEmpty = stockListMyFavorites.isEmpty();


        System.out.println("is my list empty after clearing? : "+ isArrayListEmpty);

        int indexOfMyFavoriteStock = stockslist.indexOf("TSLA");

        System.out.println("index of my favorite stock, TSLA :" +indexOfMyFavoriteStock);



    }



    public static ArrayList<String> arrayListAndLoop(){

        ArrayList<String> topTenTechStocksList = new ArrayList<>();

        topTenTechStocksList.add("TSLA");
        topTenTechStocksList.add("AAPL");
        topTenTechStocksList.add("NVDA");
        topTenTechStocksList.add("META");
        topTenTechStocksList.add("AMD");
        topTenTechStocksList.add("GOOGL");
        topTenTechStocksList.add("SPOT");
        topTenTechStocksList.add("NFLX");
        topTenTechStocksList.add("AMZN");
        topTenTechStocksList.add("MSFT");


        for(String s : topTenTechStocksList){
            System.out.println(s);
        }

        return topTenTechStocksList;

    }
}
