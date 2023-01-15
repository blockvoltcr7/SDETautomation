package MathSolutions;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Rounding {


    public static void main(String[] args) {

//        String val = roundDecimalUsingBigDecimal("342344.1942342",1);
//
//        System.out.println(val);
//
//        double x = 89;
//
//        double y = x / 100;
//        System.out.println(y);
        String result = String.format("%.1f", 5432.5 * 0.11);

        double n = 5432.5 * 0.11;
        System.out.println(n);




    }

    public static String roundDecimalUsingBigDecimal(String strValue, int decimalPlace) {
        return new BigDecimal(strValue).setScale(decimalPlace, RoundingMode.HALF_UP).stripTrailingZeros().toPlainString();
    }
}
