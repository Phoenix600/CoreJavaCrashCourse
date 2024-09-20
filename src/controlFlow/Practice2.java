package controlFlow;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args)
    {
        int a;
        int b;
        int c;

        Scanner Input =  new Scanner(System.in);

        System.out.println("Enter three numbers :");
        a = Input.nextInt();
        b = Input.nextInt();
        c = Input.nextInt();

        if( (a > b) && (a>c) )
        {
            System.out.println("A is largest.");
        }
        else if(b>c)
        {
            System.out.println("B is largest");
        }
        else
        {
            System.out.println("C is largest");
        }

    }
}
