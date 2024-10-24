package typeConversionInJava;

public class Example2 {
    public static void main(String...args)
    {
        // Widening Type Conversion In Java (Loss-less Conversion)

        byte b1 = 36;  // -128 to +127
        short b2 = (short)b1;
        System.out.println("Original Data : " + b1);
        System.out.println("Converted Data : " + b2);

        short b3 = 3500;
        int b4   = (int)b3;
        System.out.println("Original Data : " + b3);
        System.out.println("Converted Data : " + b4);

        int b5  = 120000;   // -10^7 to +10^7
        long b6 = (long)b5; // +-10^12
        System.out.println("Original Data : " + b5);
        System.out.println("Converted Data : " + b6);

        float b7 = 12.121212f;
        double b8 = (double)b7;
        System.out.println("Original Data : " + b7);
        System.out.println("Converted Data : " + b8);

        char b9 = 'A';
        int b10 = (int)b9;
        System.out.println("Original Data : " + b9);
        System.out.println("Converted Data : " + (char)b10);

    }
}
