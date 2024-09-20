package controlFlow;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args)
    {
        int year;
        Scanner Input = new Scanner(System.in);

        System.out.println("Enter the year : ");
        year = Input.nextInt();
    // 2011
        if(year % 4 == 0 && year%100 != 0)
        {
            System.out.println("Leap Year");
        }else if(year % 100 == 0)
        {
            if(year % 400 == 0)
            {
                System.out.println("Leap Year");
            }else{
                System.out.println("Normal Year");
            }
        }
        else{
            System.out.println("Normal Year");
        }

    }
}
