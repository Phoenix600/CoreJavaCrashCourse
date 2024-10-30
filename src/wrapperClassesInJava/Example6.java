package wrapperClassesInJava;

public class Example6 {
    public static void main(String[] args) {
//        Long l1 = new Long(12L);

        // static data members in Long Wrapper Class
        System.out.println("MAX_VALUE : "+Long.MAX_VALUE);
        System.out.println("MIN_VALUE : "+Long.MIN_VALUE);
        System.out.println("SIZE OF LONG DATA TYPE IN BITS : "+Long.SIZE);
        System.out.println("SIZE OF LONG DATA TYPE IN BYTES : " + Long.BYTES);
        System.out.println("DATA TYPE OF WRAPPER LONG : " + Long.TYPE);

        // Static Methods In Long Wrapper Class
        System.out.println("Bits Count : " + Long.bitCount(23L));
        System.out.println("Decoded Long : "+Long.decode("2333"));
        System.out.println("Parsing String To Long : " + Long.parseLong("233333333333"));
        System.out.println("Lowest Ones Bit In 68 : " +Long.lowestOneBit(68));
        System.out.println("Highest Ones Bit In 68 : "+Long.highestOneBit(68));
        System.out.println("Number Of Leading Zeros In 1024 : "+Long.numberOfLeadingZeros(1024));
        System.out.println("Number of Trailing Zeros In 1024 : " + Long.numberOfTrailingZeros(1024));
        System.out.println("The Binary String Of 100 : " + Long.toBinaryString(100L));
        System.out.println("The Hex String of 100 : " + Long.toHexString(100L));
        System.out.println("The Octal String of 100 : " + Long.toOctalString(100L));
        System.out.println("Rotating 8 By 2 Places : " + Long.rotateLeft(8,2));
        System.out.println("Rotating 2 By 2 Places : " + Long.rotateRight(2,2));
        System.out.println("The Number 10 after Reversing Its Bits : " + Long.reverse(10));
        System.out.println("Reversed Bytes Of 8 : " + Long.reverseBytes(8L));
        System.out.println("Comparison of 33L and 44L : " + Long.compare(33L,44L));

        /**
         * The static signum function of the Long class is used to get the signum function of the specified long value.
         *
         * The signum denotes the sign of a real number.
         *
         * A real number less than zero is denoted by -1.
         * A real number greater than zero is denoted by 1.
         * A real number equal to zero is denoted by 0.
         */
        System.out.println("Signum of  12 : " + Long.signum(12));
        System.out.println("Signum of -12 : " + Long.signum(-12));
        System.out.println("Signum of   0 : " + Long.signum(0));

        // Non-Static Methods:
        Long lnum = 12900000000L;
        System.out.println("Converted To Short   : " + lnum.shortValue());
        System.out.println("Converted To Integer : " + lnum.intValue());
        System.out.println("Converted To Float   : " + lnum.floatValue());
        System.out.println("Converted To Double  : " + lnum.doubleValue());
        System.out.println("Converted To Bytes   : " + lnum.byteValue());
        System.out.println("Converted To String  : " + lnum.toString());


    }
}
