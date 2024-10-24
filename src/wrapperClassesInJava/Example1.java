package wrapperClassesInJava;

public class Example1 {
    public static void main(String[] args) {
        int x = 12;
        Integer x1 = 12;

        // static Data Members Inside the Integer
        System.out.println("INTEGER TAKES BYTES : " + Integer.BYTES);
        System.out.println("INTEGER MAX VALUE   : " +Integer.MAX_VALUE);
        System.out.println("INTEGER MIN VALUE   : " + Integer.MIN_VALUE);
        System.out.println("INTEGER TYPES       : " + Integer.TYPE);

        // Static Functions Inside the Integer Wrapper Class
        Integer n1 = 12;
        Integer n2 = 8;

        Integer numberOfOnes = Integer.bitCount(n1);
        System.out.println("Number of Ones in 12 : " + numberOfOnes);

        int revered2sComplementForm = Integer.reverse(1);
        System.out.println("Reversed  : " + revered2sComplementForm);

        int result = Integer.compare(n1,n2);
        System.out.println("Compare Result : " + result);

        result = Integer.min(n1,n2);
        System.out.println("Minimum : " + result);

        result = Integer.max(n1,n2);
        System.out.println("Maximum : " + result);

        result = Integer.parseInt("-1212");
        System.out.println("Parsed Integer : " + result);

        result = Integer.rotateLeft(1,2);
        System.out.println("1 << 2 : " + result);

        result = Integer.rotateRight(8,3);
        System.out.println("8 >> 3 : " + result);

        result = Integer.sum(12,14);
        System.out.println("Result 12 + 14 : " + result);

        result = Integer.decode("1212");
        System.out.println("Decoded Data  : " + result);

        String binaryString = Integer.toBinaryString(12);
        System.out.println("Binary Form : " + binaryString);

        String octalString = Integer.toOctalString(14);
        System.out.println("Octal Form : " + octalString);

        String hexaDecimalString  = Integer.toHexString(12);
        System.out.println("HexaDecimal String : " + hexaDecimalString);

        // static methods in Integer Class
        result =  Integer.max(1200,15);
        System.out.println("MAX : "  + result);

        result = Integer.lowestOneBit(10);
        System.out.println("Rightmost active bit position : " + result);

        result = Integer.highestOneBit(10);
        System.out.println("Left Most active bit position : " + result);

        result = Integer.numberOfLeadingZeros(8);
        System.out.println("Leading Zeros : " + result);

        result = Integer.bitCount(10);
        System.out.println("Bit Count  : " + result);

        result = Integer.valueOf("1212");
        System.out.println("Formated Integer : " + result);
    }
}
