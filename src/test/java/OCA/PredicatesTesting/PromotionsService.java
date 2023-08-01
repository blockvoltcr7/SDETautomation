package OCA.PredicatesTesting;

import java.util.function.Predicate;

public class PromotionsService {


    private Customer customer = new Customer();

    public void sendPromotion(Predicate<Customer> p) {

        if(p.test(customer)) {
            System.out.println(" trueee Sending promotion to customer");
        }else{
            System.out.println(" falseee Sending promotion to customer");
        }
    }


    public static void main(String[] args) {
        PromotionsService promotionsService = new PromotionsService();

        promotionsService.sendPromotion(c -> c.getAge() > 25);
    }
}
