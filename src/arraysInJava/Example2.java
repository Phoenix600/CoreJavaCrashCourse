package arraysInJava;

import java.util.Arrays;

public class Example2 {
    public static void main(String...args)
    {
        int a1 = 'A'; // coersion
        char c1 = 100;

        System.out.println("The value of a1 : " + a1);
        System.out.println("The value of char a1 " + (char)a1);

        System.out.println("The value of c1 : " + c1);
        System.out.println("The value of (int)c1 " + (int)c1);

        int chars[] = {'A','B','C','D'};
        System.out.println(Arrays.toString(chars));

        char[] nums = {97,98,99,100}; // Coersion
        System.out.println(Arrays.toString(nums));

        int[] myNums0s = new int[3];
        System.out.println(Arrays.toString(myNums0s));

        int[] myNums = null;
        myNums = new int[] {100,200,300,400};

        System.out.println(Arrays.toString(myNums));
    }
}
