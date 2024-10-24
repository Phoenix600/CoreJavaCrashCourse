package wrapperClassesInJava;

public class Example2 {
    public static void main(String[] args) {
        Float x1 = -12f;

        int x = 0;
        System.out.println(x1/0);

        // Static Methods
        System.out.println(Float.toHexString(12.12f));

        String floatString =  Float.toString(12.12f); // ==> "12.12"
        System.out.println("Float String : " + floatString);

        Float x2 = 12f/0; //  Infinite
        boolean isFinite = Float.isFinite(x2);
        System.out.println("X2 Is Finite :  " + isFinite);

        Float x3 = 3.0f/0;
        boolean isNan = Float.isNaN(x3);
        System.out.println("X3 Is NAN : " + isNan);
        float X3 = x3;

       float maxNum =  Float.max(12.13f,10.01f);
       System.out.println("Maximum Number  : " + maxNum);

       float minNum = Float.min(12.0f,-3.33f);
       System.out.println("Minimum Number :  " + minNum);


    }
}
