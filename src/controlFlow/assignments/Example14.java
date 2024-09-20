package controlFlow.assignments;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args)
    {
        Scanner Input = new Scanner(System.in);
        int number;

        System.out.println("Enter the number : ");
        number = Input.nextInt();

        if(number >= 1 && number <= 100)
        {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
