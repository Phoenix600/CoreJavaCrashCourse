package stringsInJava;

import java.util.Scanner;

public class Example5 {
    public  static void main(String...args)
    {
        Scanner Input = new Scanner(System.in);
        int testCase;
        System.out.println("Enter the testcase: ");
//        testCase = Integer.parseInt(Input.next());
        testCase = Input.nextInt();
        String data;
        int len;
        boolean result;

        for(int i=0; i<testCase; i++)
        {
            System.out.println("");
           len = Input.nextInt();
           data = Input.next();

           result = data.charAt(0) != data.charAt(len-1);

            System.out.println(result ? "YES" : "NO");

        }

    }
}
