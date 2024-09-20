package loopsInJava.practice;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args)
    {
        // Printing all odd number within range
        Scanner Input = new Scanner(System.in);
        int lowerLimit;
        int upperLimit;

        System.out.println("Enter the lowerLimit : ");
        lowerLimit = Input.nextInt();

        System.out.println("Enter the upperLimit : ");
        upperLimit = Input.nextInt();

        for(int i=lowerLimit; i < upperLimit; i++)
        {
            if(i%2 != 0)
            {
                System.out.println("Odd Value : " + i);
            }
        }

    }
}
