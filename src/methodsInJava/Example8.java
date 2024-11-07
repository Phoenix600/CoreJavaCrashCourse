package methodsInJava;

// Example on Method Overloading
// return type
public class Example8 {

    public static int getMin(int x1, int x2)
    {
        return x1 < x2 ? x1 : x2;
    }

    public static float getMin(float x1, float x2)
    {
        return x1 < x2 ? x1 : x2;
    }

    public static int getMin(int x1,int x2, int x3)
    {
        return (x1<x2 && x1<x3) ? x1 : (x2 < x3 ? x2 : x3);
    }

    public static void main(String[] args) {
        Object o = getMin(14,13);
        System.out.println(o);

        o = getMin(12.0f,12.12f);
        System.out.println(o);

        o = getMin(12,13,8);
        System.out.println(o);
    }
}
