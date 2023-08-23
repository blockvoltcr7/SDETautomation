package OCA.Precedence;

public class PrecedenceLogic {


    public static void main(String[] args) {

        int x = 3 + 2 * 2 - 1; // result is 6, because multiplication has higher precedence than addition and subtraction
        int y = (3 + 2) * (2 - 1); //result is 5, because parenthesis has higher precedence than multiplication, addition and subtraction
        int z = 3 + 2 * 2 - 1 / 2; //result is 6, because multiplication and division have higher precedence than addition and subtraction
        int a = 3 + 2 * (2 - 1) / 2; //result is 4, because parenthesis has higher precedence than multiplication and division, and multiplication and division have higher precedence than addition and subtraction
        int b = 3 + 2 * ((2 - 1) / 2); //result is 4, because parenthesis has higher precedence than multiplication and division, and multiplication and division have higher precedence than addition and subtraction
        int c = 3 + 2 * ((2 - 1) / 2) + 1; //result is 5, because parenthesis has higher precedence than multiplication and division, and multiplication and division have higher precedence than addition and subtraction
        int d = 3 + 2 * ((2 - 1) / (2 + 1)); //result is 3, because parenthesis has higher precedence than multiplication and division, and multiplication and division have higher precedence than addition and subtraction
        int e = 3 + 2 * ((2 - 1) / (2 + 1)) + 1; //result is 4, because parenthesis has higher precedence than multiplication and division, and multiplication and division have higher precedence than addition and subtraction
        int f = 3 + 2 * ((2 - 1) / (2 + 1)) + 1 - 1; //result is 3, because parenthesis has higher precedence than multiplication and division, and multiplication and division have higher precedence than addition and subtraction
        int g = 3 + 2 * ((2 - 1) / (2 + 1)) + 1 - 1 * 2; //result is 1, because parenthesis has higher precedence than multiplication and division, and multiplication and division have higher precedence than addition and subtraction
        int h = 3 + 2 * ((2 - 1) / (2 + 1)) + 1 - 1 * 2 + 1; //result is 2, because parenthesis has higher precedence than multiplication and division, and multiplication and division have higher precedence than addition and subtraction

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println("h = " + h);


    }
}
