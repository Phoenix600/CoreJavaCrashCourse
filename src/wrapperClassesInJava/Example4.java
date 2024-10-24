package wrapperClassesInJava;

import java.lang.Double;

public class Example4 {
    public static void main(String[] args)
    {
        // Double Wrapper Class
//        Double d1 = new Double(12.12);

        Double d1 = 12.12;
        Double d2 = 13.13;

        // Static Data Members
        System.out.println("MAX EXPONENT : " + Double.MAX_EXPONENT);
        System.out.println("MIN EXPONENT : " + Double.MIN_EXPONENT);
        System.out.println("MIN_NORMAL_VALUE    : " + Double.MIN_NORMAL);
        System.out.println("MIN_VALUE : " + Double.MIN_VALUE);
        System.out.println("MAX_VALUE : " + Double.MAX_VALUE);
        System.out.println("SIZE OF DOUBLE IN BYTES : " + Double.BYTES);
        System.out.println("SIZE OF DOUBLE IN BITS : " + Double.SIZE);
        // static methods
        int result = Double.compare(d2,d1);
        System.out.println("Are They Same : " + result);

        Double d3 = 120.0;

        boolean res = Double.isFinite(d3/0);
        System.out.println("IsFinite : " + res);

        res = Double.isNaN(0.0/0);
        System.out.println("IsNAN : " + res);

        res = Double.isInfinite(d3);
        System.out.println("IsInfinite : " + res);

        Double converted_double_num = Double.parseDouble("12.1212");
        System.out.println("Converted Data : " + converted_double_num);
        // 10 ==> 1010
        // 10.01 ==>
        String hexString = Double.toHexString(d1);
        System.out.println("HEX-String : "+ hexString);



    }
}
