package typeConversionInJava;

public class Example1 {
    public  static void main(String...args)
    {
        // Narrowing // Lossy Conversion
        long x1 = 1212121212121212121L;
        System.out.println("Original Data : "+x1);

        int x2 = (int)x1;
        System.out.println("Converted Data : " + x2);

        double x3 = 12.121212121212211212;
        float x4  = (float)x3;
        System.out.println("Original Data " + x3);
        System.out.println("Converted Data " + x4);

        int x5 = 366;
        char x6 = (char)x5;
        System.out.println("Original Data " + x5);
        System.out.println("Converted Data " + x6);

//        boolean x7 = true;
//        int x8     = (int)x7;
        System.out.println("You can not convert boolean data type into another data type");
    }
}
