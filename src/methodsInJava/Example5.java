package methodsInJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example5 {

    // if any number is exactly dividing the target number and giving remainder zero then it is factor.
    public static boolean isPrime(int num)
    {
        int factor = 0;
        for(int i=2; i < num/2; i++)
        {
            if(num%i == 0)
            {
                factor++;
            }
        }

        if(factor == 2)
        {
            return true;
        }

        return false;
    }

    public static void main(String[] args)
    {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = Input.nextInt();

        boolean result = isPrime(number);

        if(result)
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Not a prime");
        }
    }
}
