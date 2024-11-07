package methodsInJava;

public class Example6 {
    public static int getGreatestCommonDivisor(int m, int n)
    {
        while (m != n)
        {
            if(m > n)
            {
                m = m-n;
            }
            else
            {
                n = n-m;
            }
        }

        return m;
    }

    public static void main(String[] args) {
        int result = getGreatestCommonDivisor(15,25);
        System.out.println(result);
    }
}
