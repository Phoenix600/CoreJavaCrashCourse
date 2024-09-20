package controlFlow;

import java.util.Scanner;

public class Practice1 {
    public static void main(String...args)
    {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int userEnteredNumber = Input.nextInt();

        if(userEnteredNumber%2 == 0)
        {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
