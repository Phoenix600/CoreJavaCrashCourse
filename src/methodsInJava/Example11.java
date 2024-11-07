package methodsInJava;

public class Example11 {

    public static int add(int x)
    {
        return x+99;
    }

    public static int add(int x, int y)
    {
        return x+y;
    }

    public static float add(int x, float y)
    {
        return x + y;
    }

    public static float add(float x)
    {
        return x + 99.009f;
    }

    public static float add(float x, float y, float z)
    {
        return x+y+z;
    }

    public static int add(int x, int y, int z)
    {
        return x+y+z;
    }

    public static void main(String[] args)
    {
        int res1      =  add(12);
        float res2    =  add(12.0112f);
        int res3      =  add(50,30,40);
        float res4    =  add(12,3.5f);
        float res5    =  add(0.1f,0.2f,0.3f);
        int res6    =  add(12,13);

        System.out.println("SUM : " + res1);
        System.out.println("SUM : " + res2);
        System.out.println("SUM : " + res3);
        System.out.println("SUM : " + res4);
        System.out.println("SUM : " + res5);
        System.out.println("SUM : " + res6);
    }
}
