package methodsInJava;

public class Example2 {

    public int min(int x, int y)
    {
        if(x<y) return x;
        else return y;
    }

    public static int max(int x, int y)
    {
        if(x>y)
        {
            return x;
        }
        else
        {
            return y;
        }
    }

    public static void main(String[] args)
    {
        int a = 14;
        int b = 13;

        int maxNumber = max(a,b);
        System.out.println("Maximum Number : " + maxNumber);

        Example2 myObject = new Example2();
        int minNumber = myObject.min(a,b);
        System.out.println("Minimum Number : " + minNumber);

    }
}
